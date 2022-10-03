package nl.avans.drivio.model;

import javax.persistence.*;

@Entity
@Table
public class accountModel {
    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"
    )
    private Long AccountId;
    private String Email;
    private String Password;

    public accountModel() {
    }

    public accountModel(Long accountId, String email, String password) {
        this.AccountId = accountId;
        this.Email = email;
        this.Password = password;
    }

    public accountModel(String email, String password) {
        Email = email;
        Password = password;
    }

    public Long getAccountId() {
        return AccountId;
    }

    public void setAccountId(Long accountId) {
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

    @Override
    public String toString() {
        return "accountModel{" +
                "AccountId='" + AccountId + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
