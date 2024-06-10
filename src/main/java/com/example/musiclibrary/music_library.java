package com.example.musiclibrary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class music_library extends Application {




    @Override
    public void start(Stage primaryStage) {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("music_library.fxml"));
        Scene scene = new Scene(loader.load(), 1000, 600);
        // Set the initial scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Music_Library");
        primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}