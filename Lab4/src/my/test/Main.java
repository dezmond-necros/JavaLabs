package my.test;

import my.test.Banking.Account;
import my.test.exceptions.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        choiceHelper(startMenu());



    }

   static String  startMenu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Запущено меню банковской системы");
        System.out.println("Введите одну из следующих команд:");
        System.out.println("new [id] [владелец счета] [сумма] -- Добавление нового аккуанта");
        System.out.println("balance [id] -- Вывести информацию  о счете");
        System.out.println("withdraw [id] [сумма]  -- Снять указанную сумму");
        System.out.println("deposit [id] [сумма] -- Положить на счет указанную сумму");
        System.out.println("transfer [from id] [to id ] [сумма]  -- Перевести сумму другому человеку по id");
        String choice = in.nextLine();
        //        System.out.println(choice);
        return choice;
    }

    static void choiceHelper(String choice)
    {
        AccountService accBase = new Account();
        if (choice.startsWith("new"))
            {

                String[] command = choice.split(" ");
                accBase.addString(Integer.parseInt(command[1]),command[2],Integer.parseInt(command[3]));
            }
        else if (choice.startsWith("balance"))
            {
                String[] command = choice.split(" ");
                try
                {
                    accBase.balance(Integer.parseInt(command[1]));
                } catch (UnknownAccountException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else if (choice.startsWith("withdraw"))
            {
                String[] command = choice.split(" ");
                try
                {
                    accBase.withdraw(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                }
                catch (UnknownAccountException e)
                {
                    System.out.println(e.getMessage());
                } catch (NotEnoughMoneyException e)
                {
                    System.out.println(e.getMessage());
                }

            }
            else if (choice.startsWith("deposit"))
            {
                String[] command = choice.split(" ");
                try
                {
                    accBase.deposit(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                }
                catch (UnknownAccountException e)
                {
                    System.out.println(e.getMessage());
                }

            }
            else if (choice.startsWith("transfer"))
            {
                String[] command = choice.split(" ");
                try
                {
                    accBase.transfer(Integer.parseInt(command[1]),Integer.parseInt(command[2]),
                            Integer.parseInt(command[3]));
                }
                catch (UnknownAccountException e)
                {
                    System.out.println(e.getMessage());
                }
                catch (NotEnoughMoneyException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else
            {
                System.out.println("Ввели что то не то....");
            }
        endQuestion();
    }

    static void endQuestion()
    {
        System.out.println("Продолжить работу ? (y/n)");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice.charAt(0)=='y')
        {
            System.out.println("________________________________________");
            System.out.println("");
            choiceHelper(startMenu());

        }
        else if (choice.charAt(0) == 'n')
        {
           System.out.println("Пока!!");
        }
        else
        {
            System.out.println("Введите верный символ!! (y/n)");
            endQuestion();
        }

    }
}
