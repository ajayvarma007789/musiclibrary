package com.example.musiclibrary;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class controller {

    public Stage stage;

    public controller(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void toPlaylist(ActionEvent event){
        try {
            // Load view1.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Playlist.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded FXML file
            Scene scene = new Scene(root);

            // Set the scene to the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void toSongs(ActionEvent event){
        try {
            // Load view2.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("music_library.fxml"));
            Parent root = loader.load();

           // Create a new scene with the loaded FXML file
            Scene scene = new Scene(root);

            // Set the scene to the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}



