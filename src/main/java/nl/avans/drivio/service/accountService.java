package nl.avans.drivio.service;

import nl.avans.drivio.data.ICrudData;
import nl.avans.drivio.model.accountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class accountService {

    private final ICrudData accountData;

    @Autowired
    public accountService(ICrudData accountData) {
        this.accountData = accountData;
    }

    public List<accountModel> getAccounts() {
        return accountData.findAll();
    }

    public void createAccount(accountModel account) {
        Optional<accountModel> accountOptional =  accountData.findaccountModelByEmail(account.getEmail());
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
}
