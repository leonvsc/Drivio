package nl.avans.drivio.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id")
    private int reservationId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "availability_status")
    private boolean availabilityStatus;

    @ManyToOne // ManyToOne relation between Reservation and User.
    @JoinColumn
    private User user;

    @OneToOne // OneToOne relation between Advertisement and Reservation.
    @JoinColumn
    private Advertisement advertisement;

    public Reservation(LocalDate startDate, LocalDate endDate, boolean availabilityStatus, User user, Advertisement advertisement) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.availabilityStatus = availabilityStatus;
        this.user = user;
        this.advertisement = advertisement;
    }

    public Reservation() {
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
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

    public void setUser(User user) {
        this.user = user;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", availabilityStatus=" + availabilityStatus +
                ", user=" + user +
                ", advertisement=" + advertisement +
                '}';
    }
}
