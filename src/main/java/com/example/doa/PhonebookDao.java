package com.example.doa;

import com.example.model.PhonebookEntry;
import com.example.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhonebookDao {
    private static final String INSERT_ENTRY_SQL = "INSERT INTO phonebook (lastname, phone_number) VALUES (?, ?)";
    private static final String SELECT_ALL_ENTRIES_SQL = "SELECT * FROM phonebook";

    public void addEntry(PhonebookEntry entry) throws SQLException {
        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ENTRY_SQL)) {
            preparedStatement.setString(1, entry.getLastname());
            preparedStatement.setString(2, entry.getPhoneNumber());
            preparedStatement.executeUpdate();
        }
    }

    public List<PhonebookEntry> getAllEntries() throws SQLException {
        List<PhonebookEntry> entries = new ArrayList<>();
        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ENTRIES_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastname = resultSet.getString("lastname");
                String phoneNumber = resultSet.getString("phone_number");
                entries.add(new PhonebookEntry(id, lastname, phoneNumber));
            }
        }
        return entries;
    }
}

