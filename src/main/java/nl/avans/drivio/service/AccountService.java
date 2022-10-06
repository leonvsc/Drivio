package nl.avans.drivio.service;

import nl.avans.drivio.repository.AccountRepository;
import nl.avans.drivio.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountData;

    @Autowired
    public AccountService(AccountRepository accountData) {
        this.accountData = accountData;
    }

    public List<Account> getAccounts() {
        return accountData.findAll();
    }

    public void createAccount(Account account) {
        Optional<Account> accountOptional =  accountData.findaccountModelByEmail(account.getEmail());
        if (accountOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        accountData.save(account);
    }

    public void deleteAccount(int accountId) {
        boolean exists = accountData.existsById(accountId);
        if (!exists) {
            throw new IllegalStateException("account with id " + accountId + " doesn't exists");
        }
        accountData.deleteById(accountId);
    }

    public void updateAccount(Account account) {
        accountData.save(account);
    }
}
