package nl.avans.drivio.model;

import javax.persistence.*;

@MappedSuperclass
public class Car {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    // TODO: Cammelcase gebruiken
    private int CarId;
    private String Brand;
    private String Model;
    private String FuelType;
    private int BuildYear;
    private String NumberPlate;
    private String CarType;
    private String GearBox;
    @ManyToOne
    @JoinColumn(name = "users")
    private User user;

    public Car() {
    }

    public Car(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user) {
        this.CarId = carId;
        this.Brand = brand;
        this.Model = model;
        this.FuelType = fuelType;
        this.BuildYear = buildYear;
        this.NumberPlate = numberPlate;
        this.CarType = carType;
        this.GearBox = gearBox;
        this.user = user;
    }
    public int getCarId() {
        return CarId;
    }

    public void setCarId(int carId) {
        this.CarId = carId;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        this.FuelType = fuelType;
    }

    public int getBuildYear() {
        return BuildYear;
    }

    public void setBuildYear(int buildYear) {
        this.BuildYear = buildYear;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.NumberPlate = numberPlate;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        this.CarType = carType;
    }

    public String getGearBox() {
        return GearBox;
    }

    public void setGearBox(String gearBox) {
        this.GearBox = gearBox;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + CarId +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", BuildYear=" + BuildYear +
                ", NumberPlate='" + NumberPlate + '\'' +
                ", CarType='" + CarType + '\'' +
                ", GearBox='" + GearBox + '\'' +
                ", user=" + user +
                '}';
    }
}
