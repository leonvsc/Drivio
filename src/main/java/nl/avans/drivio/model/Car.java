package nl.avans.drivio.model;

import javax.persistence.*;

@MappedSuperclass
public class Car {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int carId;
    private String brand;
    private String model;
    private String fuelType;
    private int buildYear;
    private String numberPlate;
    private String carType;
    private String gearBox;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Car() {
    }

    public Car(String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.buildYear = buildYear;
        this.numberPlate = numberPlate;
        this.carType = carType;
        this.gearBox = gearBox;
        this.user = user;
    }
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
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
                "CarId=" + carId +
                ", Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", FuelType='" + fuelType + '\'' +
                ", BuildYear=" + buildYear +
                ", NumberPlate='" + numberPlate + '\'' +
                ", CarType='" + carType + '\'' +
                ", GearBox='" + gearBox + '\'' +
                ", user=" + user +
                '}';
    }
}
