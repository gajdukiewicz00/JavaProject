package com.example.controller;

import com.example.doa.PhonebookDao;
import com.example.model.PhonebookEntry;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/addEntry")
public class AddEntryServlet extends HttpServlet {
    private PhonebookDao phonebookDao = new PhonebookDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lastname = request.getParameter("lastname");
        String phoneNumber = request.getParameter("phone");

        PhonebookEntry entry = new PhonebookEntry(lastname, phoneNumber);

        try {
            phonebookDao.addEntry(entry);
            List<PhonebookEntry> phonebook = phonebookDao.getAllEntries();
            request.setAttribute("phonebook", phonebook);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", "Unable to add entry.");
        }
        request.getRequestDispatcher("/phonebook.jsp").forward(request, response);
    }
}
