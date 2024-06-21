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

        public void editContactByName(String firstName, String lastName) {
            Scanner scanner = new Scanner(System.in);
            boolean found = false;

            for (Contact contact : contacts) {
                if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                    found = true;
                    System.out.println("Found contact:");
                    System.out.println(contact);

                    System.out.print("Enter updated Address:");
                    String address = scanner.nextLine().trim();
                    contact.setAddress(address);

                    System.out.println("Contact updated successfully:");
                    System.out.println(contact);
                    break;
                }
            }

            if (!found) {
                System.out.println("Contact not found with name: " + firstName + " " + lastName);
            }

            scanner.close();
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();

            Contact newContact = new Contact("Akash", "Kumar", "123 Elm St", "Springfield", "MH", "8642323", "934749242", "AkashKumar@example.com");
            addressBook.addContact(newContact);

            addressBook.editContactByName("Akash", "Kumar");

            List<Contact> allContacts = addressBook.getContacts();
            System.out.println("\nAll Contacts in Address Book:");
            for (Contact contact : allContacts) {
                System.out.println(contact);
            }
        }
    }
