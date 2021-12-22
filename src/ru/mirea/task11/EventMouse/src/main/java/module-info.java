module com.example.eventmouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventmouse to javafx.fxml;
    exports com.example.eventmouse;
}