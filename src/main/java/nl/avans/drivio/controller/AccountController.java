package nl.avans.drivio.controller;

import nl.avans.drivio.model.Account;
import nl.avans.drivio.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {

    private final AccountService AccountService;

    @Autowired
    public AccountController(AccountService AccountService) {
        this.AccountService = AccountService;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return AccountService.getAccounts();
    }

    @PutMapping(path = "/update")
    public void updateAccount(@RequestBody Account account) {
        AccountService.updateAccount(account);
    }

    @PostMapping
    public void createAccount(@RequestBody Account account) {
        AccountService.createAccount(account);
    }

    @DeleteMapping(path = "{accountId}")
    public void deleteAccount(@PathVariable("accountId") int accountId) {
        AccountService.deleteAccount(accountId);
    }
}
