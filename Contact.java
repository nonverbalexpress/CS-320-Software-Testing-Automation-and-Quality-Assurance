package CS320_ContactService;

//Author Name: Melissa Chessa
//Date: July 20, 2025
//Course ID: CS-320-15986-M01
//Instructor: Professor Angel Cross
//Description: This class defines what a Contact should look like. It checks that all values are valid before storing them and makes sure the contact ID can’t be changed later.

public class Contact {
    // contactId is final to prevent updates after creation
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor with validation logic for each field
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Contact ID: must be non-null, unique, and ≤ 10 characters
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException("Invalid Contact ID");

        // First name: required and ≤ 10 characters
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid First Name");

        // Last name: required and ≤ 10 characters
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid Last Name");

        // Phone number: must be exactly 10 digits (no dashes or spaces)
        if (phone == null || phone.length() != 10)
            throw new IllegalArgumentException("Invalid Phone Number");

        // Address: required and ≤ 30 characters
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid Address");

        // Set values if all validations pass
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters allow read-only access to data
    public String getContactId() { return contactId; } // ID cannot be changed

    public String getFirstName() { return firstName; }
    // Setter validates first name rules before updating
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid First Name");
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    // Setter validates last name rules before updating
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid Last Name");
        this.lastName = lastName;
    }

    public String getPhone() { return phone; }
    // Setter ensures phone remains exactly 10 digits
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10)
            throw new IllegalArgumentException("Invalid Phone Number");
        this.phone = phone;
    }

    public String getAddress() { return address; }
    // Setter ensures address length and null check
    public void setAddress(String address) {
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid Address");
        this.address = address;
    }
}