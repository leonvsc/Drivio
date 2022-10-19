package nl.avans.drivio.model;

import javax.persistence.*;

@Entity
@Table(name = "passwords")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "password_id")
    private Integer passwordId;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne(mappedBy = "passwords")
    // mappedBy -> to make it a bidirectional relationship | users is mapped by passwords table: because users table has foreign key of passwords table
    private User users;


    public Password(String password) {
        this.password = password;
    }

    public Password() {}

    public Integer getPasswordId() {
        return passwordId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser(User user) {
        return user;
    }

    public void setUser(User user) {
        this.users = user;
    }

    @Override
    public String toString() {
        return "Password{" +
                "passwordId=" + passwordId +
                ", password='" + password + '\'' +
                '}';
    }
}
