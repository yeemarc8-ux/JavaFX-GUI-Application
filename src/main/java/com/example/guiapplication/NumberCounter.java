package com.example.guiapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberCounter extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(NumberCounter.class.getResource("numbercounter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        stage.setTitle("Number Counter");
        stage.setScene(scene);
        stage.show();
    }
}
