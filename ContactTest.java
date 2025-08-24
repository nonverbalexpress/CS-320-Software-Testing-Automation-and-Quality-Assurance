package CS320_ContactService;

//Author Name: Melissa Chessa
//Date: July 20, 2025
//Course ID: CS-320-15986-M01
//Instructor: Professor Angel Cross
//Description: This test file checks that the Contact class works like it’s supposed to. It verifies that the fields are stored correctly and invalid values are rejected.

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    // Test that a valid contact is created successfully
    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("001", "Melissa", "Chessa", "1234567890", "123 Main St");
        assertEquals("Melissa", contact.getFirstName());
        assertEquals("Chessa", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
        assertEquals("001", contact.getContactId());
    }

    // Test that invalid contact ID throws an error
    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Test", "User", "1234567890", "Somewhere");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Test", "User", "1234567890", "Somewhere");
        });
    }

    // Test updating first name with valid and invalid values
    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("002", "Old", "Name", "1234567890", "Test");
        contact.setFirstName("NewName");
        assertEquals("NewName", contact.getFirstName());

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("TooLongFirstName");
        });
    }

    // Test updating last name with valid and invalid values
    @Test
    public void testSetLastName() {
        Contact contact = new Contact("003", "Test", "OldLast", "1234567890", "Test");
        contact.setLastName("NewLast");
        assertEquals("NewLast", contact.getLastName());

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName("TooLongLastName");
        });
    }

    // Test setting phone number
    @Test
    public void testSetPhone() {
        Contact contact = new Contact("004", "Test", "User", "1234567890", "Test");
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("12345"); // too short
        });
    }

    // Test setting address
    @Test
    public void testSetAddress() {
        Contact contact = new Contact("005", "Test", "User", "1234567890", "Old Address");
        contact.setAddress("New Address");
        assertEquals("New Address", contact.getAddress());

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress("This address is way too long and should definitely fail the check");
        });
    }
}