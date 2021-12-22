module com.example.cardsgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cardsgame to javafx.fxml;
    exports com.example.cardsgame;
}