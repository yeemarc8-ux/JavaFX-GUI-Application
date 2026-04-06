package com.example.guiapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FoodOrderingSystem extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(FoodOrderingSystem.class.getResource("food-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 400);
        stage.setTitle("Food Ordering System");
        stage.setScene(scene);
        stage.show();
    }
}