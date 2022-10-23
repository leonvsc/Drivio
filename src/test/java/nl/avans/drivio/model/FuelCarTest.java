package nl.avans.drivio.model;

import nl.avans.drivio.model.FuelCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FuelCarTest {
    private FuelCar fuelCar;

    @BeforeEach
    void beforeEach() {
        fuelCar = mock(FuelCar.class);
    }


    @Test
    void getCarIdTest() {
        int notExisting;
        if (fuelCar.getCarId() == 0) {
            notExisting = 1;
        }
        else {
            notExisting = 2;
        }
        boolean testing = notExisting == 1;
        assertTrue(testing);
    }
}