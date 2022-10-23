package nl.avans.drivio.model;

import javax.persistence.*;

@Entity
@Table(name = "statistics")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "statistic_id")
    private int StatisticId;
    @Column(name = "name")
    private String Name;
    @Column(name = "value")
    private String Value;
    @ManyToOne
    @JoinColumn
    private User User;

    public Statistic(int statisticId, String name, String value, User user) {
        this.StatisticId = statisticId;
        this.Name = name;
        this.Value = value;
        this.User = user;
    }

    public Statistic() {

    }

    public int getStatisticId() {
        return StatisticId;
    }

    public void setStatisticId(int statisticId) {
        this.StatisticId = statisticId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        this.User = user;
    }
}
