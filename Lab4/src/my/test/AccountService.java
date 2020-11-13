package my.test;


import my.test.exceptions.*;

import java.io.IOException;

public interface AccountService
{
    void addString(int accountId,String holder,int amount) ;
    void withdraw(int accountId,int amount) throws NotEnoughMoneyException, UnknownAccountException;
    void balance(int accountId) throws UnknownAccountException;
    void deposit(int accountId, int amount) throws  UnknownAccountException;
    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException;

}

