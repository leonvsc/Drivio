package nl.avans.drivio.model;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdvertisementTest {

    // Test if the advertisementId can be filled
    @Test
    void setAdvertisementId() throws NoSuchFieldException, IllegalAccessException {
        // Given
        final Advertisement advertisement = new Advertisement();
        //When
        advertisement.setAdvertisementId(10);
        // Then
        final Field field = advertisement.getClass().getDeclaredField("advertisementId");
        field.setAccessible(true);
        assertEquals(10, field.get(advertisement));
    }
}