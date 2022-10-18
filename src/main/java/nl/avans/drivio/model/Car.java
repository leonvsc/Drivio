package nl.avans.drivio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private Integer carId;
    private String brand;
    private String Model;
    private String fuelType;
    private int buildYear;
    private String numberPlate;
    private String carType;
    private String gearBox;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Collection<CarRating> ratings = new ArrayList<>();

    public Car() {
    }

    public Car(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, Collection<CarRating> ratings) {
        this.carId = carId;
        this.brand = brand;
        this.Model = model;
        this.fuelType = fuelType;
        this.buildYear = buildYear;
        this.numberPlate = numberPlate;
        this.carType = carType;
        this.gearBox = gearBox;
        this.ratings = ratings;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
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

    public Collection<CarRating> getRatings() {
        return ratings;
    }

    public void setRatings(Collection<CarRating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", buildYear=" + buildYear +
                ", numberPlate='" + numberPlate + '\'' +
                ", carType='" + carType + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
