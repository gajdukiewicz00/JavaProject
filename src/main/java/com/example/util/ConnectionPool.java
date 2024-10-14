package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPool {
    private static ConnectionPool instance;
    private static final Lock lock = new ReentrantLock();

    private final String jdbcUrl = "jdbc:postgresql://localhost:5432/your_db_name"; // Замените на ваше имя базы данных
    private final String username = "your_username"; // Замените на ваше имя пользователя
    private final String password = "your_password"; // Замените на ваш пароль

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}
