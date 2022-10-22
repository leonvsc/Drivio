package nl.avans.drivio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name", nullable = false, length = 200)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 200)
    private String lastName;

    @Column(name = "city", nullable = false, length = 150)
    private String city;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pass_id", referencedColumnName = "password_id")
    private Password passwords;


    public User(String firstName, String lastName, String city, Long phone, String email, Password passwords) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.passwords = passwords;
    }

    public User() {}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Password getPasswords() {
        return passwords;
    }

    public void setPasswords(Password passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", passwords=" + passwords +
                '}';
    }
}



