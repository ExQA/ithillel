package com.phonebook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Record> records;

    public PhoneBook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        for (Record existingRecord : records) {
            if (existingRecord.getName().equals(record.getName())) {
                existingRecord.getPhone().add(record.getPhone().get(0));
                return;
            }
        }
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        if (foundRecords.isEmpty()) {
            return null;
        } else {
            return foundRecords;
        }
    }
}

