package nl.avans.drivio.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Test if toString() works
class PasswordTest {

    @Test
    void testToString() {
        Password password = new Password("test 123");
        String expected = "Password{passwordId=null, password='test 123'}";
        assertEquals(expected, password.toString());
    }
}
