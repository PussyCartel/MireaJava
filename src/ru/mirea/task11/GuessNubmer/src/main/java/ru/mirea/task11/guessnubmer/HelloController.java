package ru.mirea.task11.guessnubmer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{
    public String num;
    public Integer p  = 0;
    public int n;

    @FXML
    public TextField text4;

    @FXML
    private Label text, text3, text2;

    public HelloController() {
        n = (int)(0+Math.random()*20);
        num = String.valueOf(n);
    }


    @FXML
    protected void onClick() {
        text.setText("Число "+ num);
        int a = Integer.parseInt(text4.getText());
        if(p!=3) {
            if (a == n) {
                text2.setText("Your winner");
            } else {
                text2.setText("Try again");
                p++;
                text3.setText(p.toString());
            }
            if (p == 3) {
                text2.setText("You lose");
            }
        }
    }
}