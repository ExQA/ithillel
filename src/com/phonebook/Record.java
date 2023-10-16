package com.phonebook;

import java.util.ArrayList;

public class Record {
    private String name;
    private ArrayList<String> phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }
}
