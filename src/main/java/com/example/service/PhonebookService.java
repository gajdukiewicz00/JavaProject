package com.example.service;

import com.example.doa.PhonebookDao;
import com.example.model.PhonebookEntry;

import java.sql.SQLException;
import java.util.List;

public class PhonebookService {
    private PhonebookDao phonebookDao = new PhonebookDao();

    public void addEntry(PhonebookEntry entry) throws SQLException {
        phonebookDao.addEntry(entry);
    }

    public List<PhonebookEntry> getAllEntries() throws SQLException {
        return phonebookDao.getAllEntries();
    }
}
