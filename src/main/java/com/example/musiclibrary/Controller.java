package com.example.musiclibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private  TableView<songs> TableView;
    @FXML
    private ToggleButton toggleButton;
    @FXML
    private TableColumn<songs, Integer> songIdColumn;
    @FXML
    private TableColumn<songs, String> titleColumn;
    @FXML
    private TableColumn<songs, String> artistNameColumn;
    @FXML
    private TableColumn<songs, String> genreColumn;
    @FXML
    private TableColumn<songs, Time> durationColumn;
    @FXML
    private TableColumn<songs, String> languageColumn;

    Connection connection = Database.getConnection();

    public Controller() throws SQLException {
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<songs> userList = FXCollections.observableArrayList();

        try {
            // Connect to your database
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM songs");
            PreparedStatement pstmt2 = connection.prepareStatement("SELECT artist_name FROM artists WHERE artist_id IN (SELECT artist_id FROM songs)");
            ResultSet resultSet = pstmt.executeQuery();
            ResultSet resultSet2 = pstmt2.executeQuery();


            // Populate the list
            while (resultSet.next() && resultSet2.next()) {
                int song_id = resultSet.getInt("song_id");
                String title = resultSet.getString("title");
                String artist_Name  = resultSet2.getString("artist_Name");
                String genre = resultSet.getString("genre");
                String duration= resultSet.getString("duration");
                String language = resultSet.getString("language");

                songIdColumn.setCellValueFactory(new PropertyValueFactory<songs, Integer>("song_id"));
                titleColumn.setCellValueFactory(new PropertyValueFactory<songs, String>("title"));
                artistNameColumn.setCellValueFactory(new PropertyValueFactory<songs, String>("artist_Name"));
                genreColumn.setCellValueFactory(new PropertyValueFactory<songs, String>("genre"));
                languageColumn.setCellValueFactory(new PropertyValueFactory<songs, String>("language"));
                durationColumn.setCellValueFactory(new PropertyValueFactory<songs, Time>("duration"));
                userList.add(new songs(song_id,title,artist_Name,genre,language,duration));
            }

            // Close connections
            resultSet.close();
            resultSet2.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the items to the ListView
        TableView.setItems(userList);
    }

    @FXML
    private TableView<playlist> TableView2;
    @FXML
    private TableColumn<playlist, Integer> songIdColumnp;
    @FXML
    private TableColumn<playlist, String> titleColumnp;
    @FXML
    private TableColumn<playlist, String> artistNameColumnp;
    @FXML
    private TableColumn<playlist, String> genreColumnp;
    @FXML
    private TableColumn<playlist, Time> durationColumnp;
    @FXML
    private TableColumn<playlist, String> languageColumnp;
    

    public void changeTable(ActionEvent actionEvent) {

        try{
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("playlist.fxml"));
            Scene scene = new Scene(loader.load(), 1000, 600);
            // Set the initial scene
            stage.setScene(scene);
            stage.setTitle("Playlist");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObservableList<playlist> userList2 = FXCollections.observableArrayList();

        try {
            // Connect to your database
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM playlist");
            PreparedStatement pstmt2 = connection.prepareStatement("SELECT artist_name FROM artists WHERE artist_id IN (SELECT artist_idp FROM playlist)");
            ResultSet resultSet1 = pstmt.executeQuery();
            ResultSet resultSet3 = pstmt2.executeQuery();


            // Populate the list
            while (resultSet1.next() && resultSet3.next()) {
                int song_idp = resultSet1.getInt("song_idp");
                String titlep = resultSet1.getString("titlep");
                String artist_Name  = resultSet3.getString("artist_Name");
                String genrep = resultSet1.getString("genrep");
                String durationp= resultSet1.getString("durationp");
                String languagep = resultSet1.getString("languagep");

                songIdColumnp = new TableColumn<>("Song ID");
                songIdColumnp.setCellValueFactory(new PropertyValueFactory<playlist, Integer>("song_idp"));
                titleColumnp = new TableColumn<>("title");
                titleColumnp.setCellValueFactory(new PropertyValueFactory<playlist, String>("titlep"));
                artistNameColumnp = new TableColumn<>("artist_Name");
                artistNameColumnp.setCellValueFactory(new PropertyValueFactory<playlist, String>("artist_Name"));
                genreColumnp = new TableColumn<>("Genre");
                genreColumnp.setCellValueFactory(new PropertyValueFactory<playlist, String>("genrep"));
                languageColumnp = new TableColumn<>("language");
                languageColumnp.setCellValueFactory(new PropertyValueFactory<playlist, String>("languagep"));
                durationColumnp = new TableColumn<>("duration");
                durationColumnp.setCellValueFactory(new PropertyValueFactory<playlist, Time>("durationp"));



                userList2.add(new playlist(song_idp,titlep,artist_Name,genrep,languagep,durationp));
            }

            // Close connections
            resultSet1.close();
            resultSet3.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the items to the TableView
        TableView2.setItems(userList2);
    }
}
