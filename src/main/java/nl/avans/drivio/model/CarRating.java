package nl.avans.drivio.model;

import javax.persistence.*;

// Join Table
@Entity
public class CarRating {

    @EmbeddedId
    private CarRatingId carRatingId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("carId")
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "rating")
    private Integer rating;

    public CarRating(CarRatingId carRatingId, User user, Car car, Integer rating) {
        this.carRatingId = carRatingId;
        this.user = user;
        this.car = car;
        this.rating = rating;
    }

    public CarRating() {}

    public CarRatingId getCarRatingId() {
        return carRatingId;
    }

    public void setCarRatingId(CarRatingId carRatingId) {
        this.carRatingId = carRatingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CarRating{" +
                "carRatingId=" + carRatingId +
                ", user=" + user +
                ", car=" + car +
                ", rating=" + rating +
                '}';
    }
}
