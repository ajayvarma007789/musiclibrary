module com.example.musiclibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.musiclibrary to javafx.fxml;
    exports com.example.musiclibrary;
}