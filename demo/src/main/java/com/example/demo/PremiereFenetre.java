package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        // Création d'une ligne
        Line ligne = new Line(50, 50, 200, 50);
        ligne.setStroke(Color.BLUE);
        root.getChildren().add(ligne);


        // Création d'un rectangle
        Rectangle rectangle = new Rectangle(100, 100, 150, 100);
        rectangle.setFill(Color.GREEN);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle);



        // Création d'un cercle
        Circle cercle = new Circle(300, 200, 50);
        cercle.setFill(Color.RED);
        cercle.setStroke(Color.BLACK);
        root.getChildren().add(cercle);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Ma première fenêtre avec formes géométriques");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
