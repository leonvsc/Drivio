package nl.avans.drivio.model;

import java.util.Date;

public class userModel {
    private String UserId;
    private String FirstName;
    private String LastName;
    private String Address;
    private Date DateOfBirth;
    private String IBAN;
    private accountModel Account;

    public userModel(String userId, String firstName, String lastName, String address, Date dateOfBirth, String IBAN, accountModel account) {
        this.UserId = userId;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Address = address;
        this.DateOfBirth = dateOfBirth;
        this.IBAN = IBAN;
        this.Account = account;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        this.UserId = userId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public accountModel getAccount() {
        return Account;
    }

    public void setAccount(accountModel accountId) {
        Account = accountId;
    }
}
