package app.service;

import app.myExceptions.NotEnoughMoneyException;
import app.myExceptions.UnknownAccountException;
import app.repository.AccRepository;
import app.service.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBAccService implements AccountService
{

    @Autowired
    private AccRepository accRep;

    @Override
    public void withdraw(Account acc) throws NotEnoughMoneyException, UnknownAccountException
    {
        int id = acc.getID();
        int amount = acc.getAmount();
        Account acc2 = new Account();
        acc2 = accRep.getOne(id);
        if (accRep.findById(id).isEmpty())
        {
            throw new UnknownAccountException("ID not found!");
        }
        if (acc2.getAmount() >= amount)
        {
            int tempamount = acc2.getAmount()-amount;
            acc2.setAmount(tempamount);
            accRep.save(acc2);
            return;
        }
        else
            {
            throw new NotEnoughMoneyException("Not money!");
        }



    }

    @Override
    public Account balance(int id) throws UnknownAccountException
    {
        if (!accRep.findById(id).isPresent())
        {
            throw new UnknownAccountException("ID not found!");
        }
        return accRep.findById(id).get();

    }

    @Override
    public void deposit(Account acc) throws UnknownAccountException
    {
        int id = acc.getID();
        int amount = acc.getAmount();
        Account acc2 = new Account();
        acc2 = accRep.getOne(id);
        if (accRep.findById(id).isEmpty())
        {
            throw new UnknownAccountException("ID not found!");
        }

        int tempamount = acc2.getAmount()+amount;
        acc2.setAmount(tempamount);
        accRep.save(acc2);
        return;

    }

    @Override
    public void transfer(int fromID, int toID, int amount) throws NotEnoughMoneyException, UnknownAccountException
    {
        Account accFrom = new Account();
        Account accTo = new Account();
        if ((accRep.findById(fromID).isEmpty())&(accRep.findById(toID).isEmpty()))
        {
            throw new UnknownAccountException("ID not found!");
        }
        accFrom = accRep.getOne(fromID);
        accTo = accRep.getOne(toID);
        if (accFrom.getAmount() >= amount)
        {
            accFrom.setAmount(accFrom.getAmount()-amount);
            accTo.setAmount(accTo.getAmount()+amount);
            accRep.save(accFrom);
            accRep.save(accTo);
        /*int tempamount = acc2.getAmount()-amount;
            acc2.setAmount(tempamount);
            accRep.save(acc2);
           */
            return;
        }
        else
        {
            throw new NotEnoughMoneyException("Not money!");
        }

    }
}
