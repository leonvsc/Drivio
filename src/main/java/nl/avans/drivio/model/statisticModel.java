package nl.avans.drivio.model;

public class statisticModel {
    private String StatisticId;
    private String Name;
    private String Value;
    private userModel User;

    public statisticModel(String statisticId, String name, String value, userModel user) {
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

    public userModel getUser() {
        return User;
    }

    public void setUser(userModel user) {
        this.User = user;
    }
}
