package nl.avans.drivio.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

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