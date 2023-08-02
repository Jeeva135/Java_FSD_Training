package org.example;

public interface ContactService {
    void addContact(Contact contact);

    void deleteContact(String first_name,String last_name);

    void updateContact(Contact contact);

    Contact searchContact(String first_name,String last_name);

    void displayContact(SortOption SortOption);

    void print();
}
