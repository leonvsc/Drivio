package nl.avans.drivio.model;

public class accountModel {
    private String AccountId;
    private String Email;
    private String Password;

    public accountModel(String accountId, String email, String password) {
        this.AccountId = accountId;
        this.Email = email;
        this.Password = password;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        this.AccountId = accountId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
