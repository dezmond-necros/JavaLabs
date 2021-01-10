package app.service;

import app.myExceptions.UnknownAccountException;
import app.service.model.Account;

public interface AccountRegistry
{
    void register(Account acc);
    void unregister(int id) throws UnknownAccountException;
}
