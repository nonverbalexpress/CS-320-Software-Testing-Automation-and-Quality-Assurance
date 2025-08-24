package CS320_ContactService;

//Author Name: Melissa Chessa
//Date: July 20, 2025
//Course ID: CS-320-15986-M01
//Instructor: Professor Angel Cross
//Description: This class manages a list of contacts. It lets you add new ones, delete them, and update their details—while making sure each contact ID stays unique.

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // Using a HashMap to store contacts by their ID
    private final Map<String, Contact> contacts = new HashMap<>();

    // Adds a new contact only if the ID doesn't already exist
    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact already exists or is invalid.");
        }
        contacts.put(contact.getContactId(), contact);
    }

    // Deletes a contact by ID, if it exists
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.remove(contactId);
    }

    // Updates first name if the contact exists
    public void updateFirstName(String contactId, String firstName) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.get(contactId).setFirstName(firstName);
    }

    // Updates last name if the contact exists
    public void updateLastName(String contactId, String lastName) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.get(contactId).setLastName(lastName);
    }

    // Updates phone number if the contact exists
    public void updatePhone(String contactId, String phone) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.get(contactId).setPhone(phone);
    }

    // Updates address if the contact exists
    public void updateAddress(String contactId, String address) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.get(contactId).setAddress(address);
    }
}