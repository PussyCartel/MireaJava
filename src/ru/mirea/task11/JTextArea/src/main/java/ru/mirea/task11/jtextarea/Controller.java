package ru.mirea.task11.jtextarea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller{
    @FXML
    private TextArea textArea;
    private String string ="";
    @FXML
    private Label text;

    public void onClickRed(ActionEvent actionEvent) {
        text.setTextFill(Color.RED);
    }

    public void onClickBlue(ActionEvent actionEvent) {
        text.setTextFill(Color.BLUE);
    }

    public void onClickGreen(ActionEvent actionEvent) {
        text.setTextFill(Color.GREEN);
    }

    public void setFontA(ActionEvent actionEvent) {
        text.setFont(Font.font("Verdana"));
    }

    public void setFontB(ActionEvent actionEvent) {
        text.setFont(Font.font("Arial"));
    }

    public void setFontC(ActionEvent actionEvent) {
        text.setFont(Font.font("TimesRoman"));
    }

    public void inputText(ActionEvent actionEvent) {
        string = textArea.getText();
        text.setText(string);
    }
}