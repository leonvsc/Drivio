package nl.avans.drivio.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "advertisements")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "advertisement_id")
    private int advertisementId;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @ManyToOne // ManyToOne relation between Advertisement and User.
    @JoinColumn
    private User user;

    @OneToOne
    @JoinColumn
    private ElectricCar electricCar;

    public Advertisement(String title, String description, double price, LocalDate startDate, LocalDate endDate, User user, ElectricCar electricCar) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.electricCar = electricCar;
    }

    public Advertisement() {

    }

    public int getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(int advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User User) {
        this.user = User;
    }

    public ElectricCar getElectricCar() {
        return electricCar;
    }

    public void setElectricCar(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advertisementId=" + advertisementId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", user=" + user +
                ", electricCar=" + electricCar +
                '}';
    }
}