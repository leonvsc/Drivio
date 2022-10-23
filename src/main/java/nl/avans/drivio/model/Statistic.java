package nl.avans.drivio.model;

import javax.persistence.*;

@Entity
@Table(name = "statistics")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "statistic_id")
    private int statisticId;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;
    @ManyToOne // ManyToOne Relation between Statistic and User
    @JoinColumn
    private User user;

    public Statistic(int statisticId, String name, String value, User user) {
        this.statisticId = statisticId;
        this.name = name;
        this.value = value;
        this.user = user;
    }

    public Statistic() {

    }

    public int getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(int statisticId) {
        this.statisticId = statisticId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
