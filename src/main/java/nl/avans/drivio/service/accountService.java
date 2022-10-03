package nl.avans.drivio.service;

import nl.avans.drivio.model.accountModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class accountService {
    public List<accountModel> getAccounts() {
        return List.of(new accountModel(1L, "info@me.com", "password123"));
    }
}
