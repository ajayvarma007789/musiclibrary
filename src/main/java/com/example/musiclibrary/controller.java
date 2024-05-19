package com.example.musiclibrary;

import java.sql.*;

public class controller {
    public static void main(String[] args) {
        String sql = "select title from songs where id=2";
        String url = "jdbc:mysql://localhost:3306/music_library_management_system";
        String username = "root";
        String password = "password";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            st.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}



