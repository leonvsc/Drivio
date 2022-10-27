package nl.avans.drivio.service;

import nl.avans.drivio.model.Reservation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservationServiceTest {

    @Test
    void createReservation() throws NoSuchFieldException, IllegalAccessException {
        //Given
        Reservation reservation = new Reservation();
        reservation.setStartDate(LocalDate.of(2022, 10, 27));
        reservation.setEndDate(LocalDate.of(2022, 11, 27));

        //When
        final Field field = reservation.getClass().getDeclaredField("startDate");
        final Field field1 = reservation.getClass().getDeclaredField("endDate");

        field.setAccessible(true);
        field1.setAccessible(true);
        LocalDate startDate = (LocalDate) field1.get(reservation);
        LocalDate endDate = (LocalDate) field.get(reservation);
        boolean startDateAfterEnd = (startDate.isAfter(endDate));

        // Then
        assertTrue(startDateAfterEnd);
    }
}