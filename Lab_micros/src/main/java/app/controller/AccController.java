package app.controller;

import app.myExceptions.NotEnoughMoneyException;
import app.myExceptions.UnknownAccountException;
import app.service.AccountRegistry;
import app.service.AccountService;
import app.service.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccController
{
    @Autowired
    private AccountRegistry registry;

    @Autowired
    private AccountService accService;

    @PostMapping("/acc/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(Account acc)
    {
        registry.register(acc);
    }

    @PostMapping("/acc/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void unreg(@PathVariable("id") int id) throws UnknownAccountException
    {
        registry.unregister(id);
    }


    @GetMapping("/acc/{id}")
    public ResponseEntity<Account> balance(@PathVariable("id") int id) throws UnknownAccountException
    {
        return new ResponseEntity<>(accService.balance(id), HttpStatus.OK);
    }

    @PostMapping("/acc/withdraw")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void withdraw(Account acc) throws UnknownAccountException, NotEnoughMoneyException
    {
        accService.withdraw(acc);
    }

    @PostMapping("/acc/deposite")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deposite(Account acc) throws UnknownAccountException
    {
        accService.deposit(acc);
    }

    @PostMapping("/acc/transfer")
    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void transfer(@PathVariable("from") int from,@PathVariable("to") int to,@PathVariable("amount") int amount) throws UnknownAccountException, NotEnoughMoneyException
    public void transfer(int from,int to,int amount) throws UnknownAccountException, NotEnoughMoneyException
    {
        accService.transfer(from, to, amount);
    }

}
