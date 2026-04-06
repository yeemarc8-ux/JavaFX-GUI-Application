package com.example.guiapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(SimpleCalculator.class.getResource("calculator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 250);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }
}