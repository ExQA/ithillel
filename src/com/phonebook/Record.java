package com.phonebook;

import java.util.ArrayList;

public class Record {
    private final String name;
    private final ArrayList<String> phone;

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

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
