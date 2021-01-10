package app.service;

import app.repository.AccRepository;
import app.service.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.myExceptions.UnknownAccountException;

@Component
public class DBAccReg implements AccountRegistry
{
    @Autowired
    private AccRepository accRep;

    @Override
    public void register(Account acc)
    {
        if(accRep.findById(acc.getID()).isPresent())
        {
            throw new RuntimeException("ID is already exist!");
        }
        accRep.save(acc);
    }

    @Override
    public void unregister(int id) throws UnknownAccountException
    {
        if(!accRep.findById(id).isPresent())
        {
            throw new UnknownAccountException("ID not found!");
        }
        accRep.deleteById(id);
    }
}
