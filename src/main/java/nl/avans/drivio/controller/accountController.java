package nl.avans.drivio.controller;

import nl.avans.drivio.model.accountModel;
import nl.avans.drivio.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class accountController {

    private final nl.avans.drivio.service.accountService accountService;

    @Autowired
    public accountController(nl.avans.drivio.service.accountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<accountModel> getAccounts() {
        return accountService.getAccounts();
    }

    @PostMapping
    public void createAccount(@RequestBody accountModel account) {
        accountService.createAccount(account);
    }

    @DeleteMapping(path = "{accountId}")
    public void deleteAccount(@PathVariable("accountId") int accountId) {
        accountService.deleteAccount(accountId);
    }
}
