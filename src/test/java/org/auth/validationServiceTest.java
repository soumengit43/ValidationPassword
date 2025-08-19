package org.auth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class validationServiceTest {

    // Helper for custom exception assertion
    private void assertInvalidException(String password, String message){
        InvalidPassException iEx= assertThrows(InvalidPassException.class, () -> validationService.validatePassword(password));
        assertTrue(iEx.getMessage().contains(message));
    }

    // invalid test case
    @Test
    void testPassowordNull(){
        assertInvalidException(null, "Password should not be empty");
    }
    @Test
    void testPassowordEmpty(){
        assertInvalidException(null, "Password should not be empty");
    }

    @Test
    void testPassowordLowerCase(){
        assertInvalidException("SSSS", "Password should have at least one lowercase letter");
    }

    // Valid Test case
    @Test
    void testPasswordLength(){
        assertDoesNotThrow(() -> validationService.validatePassword("soum"));
    }

    @Test
    void testPasswordDigit(){
        assertDoesNotThrow(() -> validationService.validatePassword("soum1"));
    }
    @Test
    void testPasswordUppercase(){
        assertDoesNotThrow(() -> validationService.validatePassword("soumD"));
    }

    @Test
    void testPasswordMultipleCondition(){
        assertDoesNotThrow(() -> validationService.validatePassword("soumDD11"));
    }

}