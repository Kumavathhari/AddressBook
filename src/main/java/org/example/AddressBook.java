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
        }

        public void displayAllContacts() {
            System.out.println("\nAll Contacts in Address Book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nAddress Book Menu:");
                System.out.println("1. Add Contact");
                System.out.println("2. Display All Contacts");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline after integer input

                switch (choice) {
                    case 1:
                        addressBook.addContactFromConsole();
                        break;
                    case 2:
                        addressBook.displayAllContacts();
                        break;
                    case 3:
                        System.out.println("Exiting Address Book.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
