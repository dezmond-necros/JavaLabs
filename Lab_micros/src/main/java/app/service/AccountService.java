package app.service;

import app.myExceptions.*;
import app.service.model.Account;

public interface AccountService
{
    void withdraw(Account acc) throws NotEnoughMoneyException, UnknownAccountException;
    Account balance(int id) throws UnknownAccountException;
    void deposit(Account acc) throws  UnknownAccountException;
    void transfer(int fromID, int toID, int amount) throws NotEnoughMoneyException, UnknownAccountException;

}
