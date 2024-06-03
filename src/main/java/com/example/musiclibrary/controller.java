package com.example.musiclibrary;

import java.sql.*;

//jdbc connectivity: this is used to connect to the database 
public class controller {
    private final Connection conn;

    public Database() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/lifecanvas", "lifecanvas", "lifecanvas");
    }
}



