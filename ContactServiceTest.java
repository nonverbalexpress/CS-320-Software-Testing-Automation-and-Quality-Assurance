package CS320_ContactService;

//Author Name: Melissa Chessa
//Date: July 20, 2025
//Course ID: CS-320-15986-M01
//Instructor: Professor Angel Cross
//Description: This test file checks that the ContactService class can add, delete, and update contacts the way it’s supposed to.

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;
    private Contact contact;

    // Set up a fresh ContactService and Contact before each test runs
    @BeforeEach
    public void setUp() {
        service = new ContactService();
        contact = new Contact("123", "Jane", "Doe", "1234567890", "123 Elm Street");
    }

    // Test if a contact can be added
    @Test
    public void testAddContact() {
        service.addContact(contact);
        assertEquals("Jane", contact.getFirstName());
    }

    // Test that adding the same contact twice throws an error
    @Test
    public void testAddDuplicateContactThrowsException() {
        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact);
        });
    }

    // Test deleting a contact
    @Test
    public void testDeleteContact() {
        service.addContact(contact);
        service.deleteContact("123");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("123");
        });
    }

    // Test updating the first name
    @Test
    public void testUpdateFirstName() {
        service.addContact(contact);
        service.updateFirstName("123", "Emily");
        assertEquals("Emily", contact.getFirstName());
    }

    // Test updating the last name
    @Test
    public void testUpdateLastName() {
        service.addContact(contact);
        service.updateLastName("123", "Smith");
        assertEquals("Smith", contact.getLastName());
    }

    // Test updating the phone number
    @Test
    public void testUpdatePhone() {
        service.addContact(contact);
        service.updatePhone("123", "0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    // Test updating the address
    @Test
    public void testUpdateAddress() {
        service.addContact(contact);
        service.updateAddress("123", "456 Oak Street");
        assertEquals("456 Oak Street", contact.getAddress());
    }

    // Test updating a non-existent contact throws an error
    @Test
    public void testUpdateNonexistentContactThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("999", "Name");
        });
    }
}