package ru.mirea.task8.opt1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root);

        Image image = new Image("https://andreyex.ru/wp-content/uploads/2018/05/Kak-ustanovit-Java-s-apt-na-Ubuntu-18.04.jpg");

        Circle circle = new Circle(60);
        circle.setCenterX(60);
        circle.setCenterY(60);
        circle.setFill(new ImagePattern(image, 0, 0, 120, 120, false));

        root.getChildren().add(circle);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}