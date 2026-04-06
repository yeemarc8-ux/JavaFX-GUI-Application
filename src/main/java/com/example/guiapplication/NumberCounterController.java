package com.example.guiapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NumberCounterController {
    @FXML private Label countLabel;
    @FXML private Button increaseButton;
    @FXML private Button decreaseButton;

    private int count = 0;

    @FXML
    public void initialize() {
        countLabel.setId("countLabel");
        increaseButton.setId("increaseButton");
        decreaseButton.setId("decreaseButton");
    }

    @FXML protected void onIncrease() {
        count++;
        countLabel.setText(String.valueOf(count));
    }

    @FXML protected void onDecrease() {
        count--;
        countLabel.setText(String.valueOf(count));
    }
}
