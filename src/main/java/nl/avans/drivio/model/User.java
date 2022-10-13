package nl.avans.drivio.model;

import javax.persistence.*;
//import java.awt.image.BufferedImage;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // For mysql this may be IDENTITY!
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name", nullable = false, length = 200)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 200)
    private String lastName;

    @Column(name = "city", nullable = false, length = 200)
    private String city;

    @Column(name = "phone", nullable = false)
    private long phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false, length = 150)
    private String password;


//    private BufferedImage myPicture;      (Period 2)
//    private String aboutMe;               (Period 2)
//    private BufferedImage driversLicense; (Period 2)
//    private boolean hasDriversLicense;    (Period 2)


    public User(Integer userId, String firstName, String lastName, String city, long phone, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User() {}   // Could be protected!

    public Integer getUserId() {
        return userId;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
