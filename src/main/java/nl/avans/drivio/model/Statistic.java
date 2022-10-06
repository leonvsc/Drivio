package nl.avans.drivio.model;

public class Statistic {
    private String StatisticId;
    private String Name;
    private String Value;
    private nl.avans.drivio.model.User User;

    public Statistic(String statisticId, String name, String value, nl.avans.drivio.model.User user) {
        this.StatisticId = statisticId;
        this.Name = name;
        this.Value = value;
        this.User = user;
    }

    public String getStatisticId() {
        return StatisticId;
    }

    public void setStatisticId(String statisticId) {
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

    public nl.avans.drivio.model.User getUser() {
        return User;
    }

    public void setUser(nl.avans.drivio.model.User user) {
        this.User = user;
    }
}
