package org.example;
import java.util.ArrayList;
import java.util.List;
public class AddressBook {
        private List<Contact> contacts;

        public AddressBook() {
            this.contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();

            Contact contact1 = new Contact("Hari", "Naik", "123 Elm St", "Mumbai", "MH", "517000", "1234567890", "HariNaik@example.com");
            Contact contact2 = new Contact("Prince", "Haru", "456 Maple Ave", "Bangolore", "KA", "513775", "1213457897", "PrinceHaru@example.com");

            addressBook.addContact(contact1);
            addressBook.addContact(contact2);

            for (Contact contact : addressBook.getContacts()) {
                System.out.println(contact);
            }
        }
    }

