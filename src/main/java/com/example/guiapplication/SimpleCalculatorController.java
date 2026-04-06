package com.example.guiapplication;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SimpleCalculatorController {
    @FXML private TextField tfNumber1, tfNumber2;
    @FXML private ComboBox<String> cbOperations;
    @FXML private Label lblResult;
    @FXML private Button btnCompute;

    @FXML
    public void initialize() {
        tfNumber1.setId("tfNumber1");
        tfNumber2.setId("tfNumber2");
        cbOperations.setId("cbOperations");
        lblResult.setId("lblResult");
        btnCompute.setId("btnCompute");

        cbOperations.getItems().addAll("+", "-", "*", "/");
        cbOperations.getSelectionModel().selectFirst();
    }

    @FXML
    protected void onCompute() {
        try {
            double n1 = Double.parseDouble(tfNumber1.getText());
            double n2 = Double.parseDouble(tfNumber2.getText());
            String op = cbOperations.getValue();
            double result = 0;

            switch (op) {
                case "+" -> result = n1 + n2;
                case "-" -> result = n1 - n2;
                case "*" -> result = n1 * n2;
                case "/" -> result = (n2 != 0) ? n1 / n2 : 0;
            }
            lblResult.setText(String.format("%.2f", result));
        } catch (Exception e) {
            lblResult.setText("Error");
        }
    }
}
