package com.phonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        //Adding persons to the PhoneBook
        phoneBook.add(new Record("Apple", "+3806325666"));
        phoneBook.add(new Record("Tom", "+111111111"));
        phoneBook.add(new Record("Mike", "+222222222"));
        phoneBook.add(new Record("Android", "+3806325666"));
        phoneBook.add(new Record("Apple", "+3806325666"));
        phoneBook.add(new Record("iPhone", "+3806325666"));
        phoneBook.add(new Record("iPhone", "+99999999"));

        //Finding the persons in the PhoneBook  by name
        Record record = phoneBook.find("test");
        System.out.println(record);

        //Finding all persons in the PhoneBook  by name
        ArrayList<Record> records = phoneBook.findAll("Tom");
        System.out.println(records);

    }
}
