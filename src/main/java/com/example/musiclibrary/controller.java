package com.example.musiclibrary;

import java.sql.*;

//jdbc connectivity: this is used to connect to the database 
public class controller {
    public static void main(String[] args) {
        String sql = "select title from songs where song_id=2";
        String url = "jdbc:mysql://127.0.0.1:3306/Music_Library";
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



