package com.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/doubleNumber")
public class DoubleNumberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberStr = request.getParameter("number");
        try {
            int number = Integer.parseInt(numberStr);
            int result = number * 2;
            request.setAttribute("result", result);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Please enter a valid number.");
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
