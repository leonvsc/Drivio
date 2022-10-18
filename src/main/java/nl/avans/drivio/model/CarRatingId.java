package nl.avans.drivio.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable  // embeddable required
public class CarRatingId implements Serializable {   // serializable required

    @Column(name = "user_id")  // primary key user table
    private Integer userId;

    @Column(name = "car_id") // primary key car table
    private Integer carId;


    public CarRatingId(Integer userId, Integer carId) {
        this.userId = userId;
        this.carId = carId;
    }

    public CarRatingId() {}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    // required
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarRatingId that)) return false;
        return userId.equals(that.userId) && carId.equals(that.carId);
    }

    // required
    @Override
    public int hashCode() {
        return Objects.hash(userId, carId);
    }
}
