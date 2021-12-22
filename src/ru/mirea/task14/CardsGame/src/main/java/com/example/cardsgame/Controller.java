package com.example.cardsgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    private Cards cards = new Cards();
    private Integer a=0;
    @FXML
    private TextField addText1, addText2;
    @FXML
    private Label cardsFirst, cardsSecond, textWinner;
    @FXML
    public void onClickFirst(ActionEvent actionEvent) {
        cards.inputPlayerCard(1, Integer.parseInt(addText1.getText()));
        cardsFirst.setText(cardsFirst.getText()+" "+ addText1.getText());
    }
    @FXML
    public void onClickSecond(ActionEvent actionEvent) {
        cards.inputPlayerCard(2, Integer.parseInt(addText2.getText()));
        cardsSecond.setText(cardsSecond.getText()+" "+ addText2.getText());
    }
    @FXML
    public void onClickStart(ActionEvent actionEvent) {
        textWinner.setText(cards.playGame());
        System.out.println(cards.playGame());
    }
}