package com.example.thegame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    Integer a = 0, b = 0;
    @FXML
    private Label text1, text2, text3;

    @FXML
    protected void onClick1() {
        a+=1;
        text3.setText("Last Scorer: AC Milan");
        text1.setText("Result: " + a.toString() + " x " + b.toString());
        if(a > b){
            text2.setText("Winner: AC Milan winner!");
        }
        else if (a == b){
            text2.setText("Winner: Draw!");
        }
    }

    @FXML
    protected void onClick2() {
        b+=1;
        text3.setText("Last Scorer: Real Madrid");
        text1.setText("Result: " + a.toString() + " x " + b.toString());
        if(a < b){
            text2.setText("Winner: Real Madrid winner!");
        }
        else if (a == b){
            text2.setText("Winner: Draw!");
        }

    }
}