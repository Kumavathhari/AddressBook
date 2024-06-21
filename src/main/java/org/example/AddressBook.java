package org.example;
import java.util.ArrayList;
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

        public void addContactFromConsole() {
            Scanner scanner = new Scanner(System.in);

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
            String zip = scanner.nextLine().trim();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine().trim();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine().trim();

            Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            contacts.add(newContact);

            System.out.println("Contact added successfully:");
            System.out.println(newContact);

            scanner.close();
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();

            // Adding initial contacts for testing
            Contact initialContact1 = new Contact("Akash", "Kumar", "123 Elm St", "Springfield", "MH", "8642323", "934749242", "AkashKumar@example.com");
            Contact initialContact2 = new Contact("Satvik", "Nair", "456 Maple Ave", "Springfield", "PJ", "827622", "904492222", "SatvikNair@example.com");

            addressBook.addContact(initialContact1);
            addressBook.addContact(initialContact2);

            // Adding a new contact from console
            addressBook.addContactFromConsole();

            // Display all contacts in address book
            List<Contact> allContacts = addressBook.getContacts();
            System.out.println("\nAll Contacts in Address Book:");
            for (Contact contact : allContacts) {
                System.out.println(contact);
            }
        }
    }
