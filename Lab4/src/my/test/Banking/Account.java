package my.test.Banking;

import my.test.AccountService;
import my.test.exceptions.NotEnoughMoneyException;
import my.test.exceptions.UnknownAccountException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Account implements AccountService
{
    int ID;
    int amount;
    String holder;
///////////////////////////////////////////////////////////////////////////////////////////
    List<String> file;
    public void readFromFile()
    {
        try
        {

            file = Files.readAllLines(Paths.get("base.txt"), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void writeToFile()
    {
        try(FileWriter writer = new FileWriter("base.txt"))
        {
            for (String line : file)
            {
                writer.write( line);
                writer.append('\n');
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    public Account()
    {
        readFromFile();
    }


    @Override
    public void addString(int accountId,String holder,int amount)
    {
        if (checkId(accountId))
        {
            System.out.println("Пользователь с таким ID существует! Введите другой!");
        }
        else
        {
            file.add(accountId+" "+holder+" "+amount);
            writeToFile();
        }

        /*
        if (IOstream.checkId(ID))
        {
            IOstream.writeToFile(ID+" "+holder+" "+amount);
        }
        */
    }

    @Override
    public void withdraw(int accountId, int summ) throws NotEnoughMoneyException, UnknownAccountException
    {
        holder = null;
        amount = -1;
       for (int i = 0;i< file.size();i++)
       {
           String str = file.get(i);
           if (str.split(" ")[0].equals(Integer.toString(accountId)))
           {
               holder = str.split(" ")[1];
               amount = Integer.parseInt(str.split(" ")[2]);
               if ((amount-summ)>0) file.set(i,accountId+" "+ holder+ " "+(amount-summ));
               writeToFile();
           }
       }

        if ((amount == -1)||(summ > amount))
        {
            throw  new NotEnoughMoneyException("Недостаточно средств!");
        }
        else if (holder == null)
        {
            throw  new UnknownAccountException("Такого ID не существует!");
        }
        else
        {
            System.out.println("Снято : "+summ);

        }


    }

    @Override
    public void balance(int accountId) throws UnknownAccountException
    {
        holder = null;
        for (String str:file)
        {
            if (str.split(" ")[0].equals(Integer.toString(accountId)))
            {
                holder = str.split(" ")[1];
                amount = Integer.parseInt(str.split(" ")[2]);
            }
        }


        if (holder!= null)
        {
            System.out.println("Баланс : "+amount);
        }
        else
        {
            throw  new UnknownAccountException("Такого ID не существует!");
        }
    }

    @Override
    public void deposit(int accountId, int summ) throws  UnknownAccountException
    {
        holder = null;
        amount = -1;
        for (int i = 0;i< file.size();i++)
        {
            String str = file.get(i);
            if (str.split(" ")[0].equals(Integer.toString(accountId)))
            {
                holder = str.split(" ")[1];
                amount = Integer.parseInt(str.split(" ")[2]);
                file.set(i,accountId+" "+ holder+ " "+(amount+summ));
                writeToFile();
            }
        }


         if (holder == null)
        {
            throw  new UnknownAccountException("Такого ID не существует!");
        }
        else
        {
            System.out.println("Баланс пополнен, текущий баланс : "+(summ+amount));

        }

    }

    @Override
    public void transfer(int from, int to, int summ) throws NotEnoughMoneyException, UnknownAccountException
    {
        holder = null;
        String holder2 = null;
        amount = -1;
        int amount2;
        for (int i = 0;i< file.size();i++)
        {
            String str = file.get(i);
            if (str.split(" ")[0].equals(Integer.toString(from)))
            {
                holder = str.split(" ")[1];
                amount = Integer.parseInt(str.split(" ")[2]);
                for (int j = 0;j< file.size();j++)
                {
                    String str2 = file.get(j);
                    if (str2.split(" ")[0].equals(Integer.toString(to)))
                    {
                        holder2 = str2.split(" ")[1];
                        amount2 = Integer.parseInt(str2.split(" ")[2]);
                        if ((amount-summ)>0)
                        {
                            file.set(i,from+" "+ holder+ " "+(amount-summ));
                            file.set(j,to+" "+ holder2+ " "+(amount2+summ));
                            writeToFile();
                        }

                    }

                }


            }
        }

        if ((amount == -1)||(summ > amount))
        {
            throw  new NotEnoughMoneyException("Недостаточно средств!");
        }
        else if ((holder == null)||(holder2 == null))
        {
            throw  new UnknownAccountException("Такого ID не существует!");
        }
        else
        {
            System.out.println("Сумма : "+summ+ " переведена от "+ holder + " к "+ holder2);

        }
    }

    private boolean checkId(int id)
    {
        for (String str:file)
        {
            if (str.split(" ")[0].equals(Integer.toString(id)))
            {
                return true;
            }
        }
        return false;
    }




}
