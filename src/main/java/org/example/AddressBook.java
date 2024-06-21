package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
        private List<Contact> contacts;

        public AddressBook() {
            this.contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public void deleteContactByName(String firstName, String lastName) {
            Iterator<Contact> iterator = contacts.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                Contact contact = iterator.next();
                if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                    iterator.remove();
                    found = true;
                    System.out.println("Contact deleted successfully:");
                    System.out.println(contact);
                    break;
                }
            }

            if (!found) {
                System.out.println("Contact not found with name: " + firstName + " " + lastName);
            }
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            Scanner scanner = new Scanner(System.in);

            // Example initial contacts for testing
            addressBook.addContact(new Contact("Akash", "Kumar", "123 Elm St", "Springfield", "MH", "8642323", "934749242", "AkashKumar@example.com"));
            addressBook.addContact(new Contact("Satvik", "Nair", "456 Maple Ave", "Springfield", "PJ", "827622", "904492222", "SatvikNair@example.com"));

            while (true) {
                System.out.println("\nAddress Book Menu:");
                System.out.println("1. Add Contact");
                System.out.println("2. Delete Contact by Name");
                System.out.println("3. Display All Contacts");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline after integer input

                switch (choice) {
                    case 1:
                        System.out.print("Enter First Name: ");
                        String firstName = scanner.nextLine().trim();

                        System.out.print("Enter Last Name: ");
                        String lastName = scanner.nextLine().trim();

                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine().trim();

                        System.out.print("Enter City: ");
                        String city = scanner.nextLine().trim();

                        System.out.print("Enter State: ");
                        String state = scanner.nextLine().trim();

                        System.out.print("Enter Zip Code: ");
                        String zipCode = scanner.nextLine().trim();

                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scanner.nextLine().trim();

                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine().trim();

                        Contact newContact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
                        addressBook.addContact(newContact);
                        System.out.println("Contact added successfully:");
                        System.out.println(newContact);
                        break;
                    case 2:
                        System.out.print("Enter First Name of the contact to delete: ");
                        String deleteFirstName = scanner.nextLine().trim();

                        System.out.print("Enter Last Name of the contact to delete: ");
                        String deleteLastName = scanner.nextLine().trim();

                        addressBook.deleteContactByName(deleteFirstName, deleteLastName);
                        break;
                    case 3:
                        List<Contact> allContacts = addressBook.getContacts();
                        System.out.println("\nAll Contacts in Address Book:");
                        for (Contact contact : allContacts) {
                            System.out.println(contact);
                        }
                        break;
                    case 4:
                        System.out.println("Exiting Address Book. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
