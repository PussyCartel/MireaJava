package com.example.eventmouse;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloController{
    @FXML
    private Label text;
    private Stage north, south, west, east, center;

    public HelloController() {
        north= new Stage();
        north.initStyle(StageStyle.UTILITY);
        Scene sceneNorth = new Scene(new Group(new Text(25, 25, "Hello North")));
        north.setScene(sceneNorth);

        south= new Stage();
        south.initStyle(StageStyle.UTILITY);
        Scene sceneSouth = new Scene(new Group(new Text(25, 25, "Hello South")));
        south.setScene(sceneSouth);

        west= new Stage();
        west.initStyle(StageStyle.UTILITY);
        Scene sceneWest = new Scene(new Group(new Text(25, 25, "Hello West")));
        west.setScene(sceneWest);

        east= new Stage();
        east.initStyle(StageStyle.UTILITY);
        Scene sceneEast = new Scene(new Group(new Text(25, 25, "Hello East")));
        east.setScene(sceneEast);

        center= new Stage();
        center.initStyle(StageStyle.UTILITY);
        Scene sceneCenter = new Scene(new Group(new Text(25, 25, "Hello Center")));
        center.setScene(sceneCenter);
    }

    @FXML
    public void onEnteredCenter(){
        text.setText("Center");
        south.hide();
        east.hide();
        west.hide();
        north.hide();

        center.show();
    }
    public void onEnteredNorth(){
        text.setText("North");
        south.hide();
        east.hide();
        west.hide();
        center.hide();

        north.show();
    }
    public void onEnteredSouth(){
        text.setText("South");
        north.hide();
        east.hide();
        west.hide();
        center.hide();

        south.show();
    }
    public void onEnteredEast(){
        text.setText("East");
        north.hide();
        south.hide();
        west.hide();
        center.hide();

        east.show();
    }
    public void onEnteredWest(){
        text.setText("West");
        north.hide();
        south.hide();
        east.hide();
        center.hide();

        west.show();
    }
}