package com.example.musiclibrary;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/musiclibrary";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
}



