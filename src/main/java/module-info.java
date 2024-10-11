module com.example.calciogui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calciogui to javafx.fxml;
    exports com.example.calciogui;
}