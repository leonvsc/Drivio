package nl.avans.drivio.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AdvertisementId;
    private String Title;
    private String Description;
    private double Price;
    private LocalDate StartDate;
    private LocalDate EndDate;
    @ManyToOne
    @JoinColumn
    private User user;

    public Advertisement(String title, String description, double price, LocalDate startDate, LocalDate endDate, User user) {
        Title = title;
        Description = description;
        Price = price;
        StartDate = startDate;
        EndDate = endDate;
        this.user = user;
    }

    public Advertisement() {

    }

    public int getAdvertisementId() {
        return AdvertisementId;
    }

    public void setAdvertisementId(int advertisementId) {
        AdvertisementId = advertisementId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User User) {
        this.user = User;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "AdvertisementId=" + AdvertisementId +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", user=" + user +
                '}';
    }
}