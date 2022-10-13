package nl.avans.drivio.model;

import javax.persistence.*;

@Entity
@Table
public class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    private int CarId;
    private String Brand;
    private String Model;
    private String FuelType;
    private int BuildYear;
    private String NumberPlate;
    private String CarType;
    private String GearBox;
//    private User Owner;
//    private User Renter;

    public Car() {
    }

    public Car(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User owner, User renter) {
        this.CarId = carId;
        this.Brand = brand;
        this.Model = model;
        this.FuelType = fuelType;
        this.BuildYear = buildYear;
        this.NumberPlate = numberPlate;
        this.CarType = carType;
        this.GearBox = gearBox;
//        this.Owner = owner;
//        this.Renter = renter;

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

//    public User getOwner() {
//        return Owner;
//    }
//
//    public void setOwner(User owner) {
//        Owner = owner;
//    }
//
//    public User getRenter() {
//        return Renter;
//    }
//
//    public void setRenter(User renter) {
//        Renter = renter;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + CarId +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", BuildYear='" + BuildYear + '\'' +
                ", NumberPlate='" + NumberPlate + '\'' +
                ", CarType='" + CarType + '\'' +
                ", GearBox='" + GearBox + '\'' +
                '}';
    }
}
