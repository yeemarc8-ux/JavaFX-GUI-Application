package com.example.guiapplication;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FoodOrderingSystemController {
    @FXML private CheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    @FXML private RadioButton rbNone, rb5, rb10, rb15;
    @FXML private Button btnOrder;

    @FXML
    public void initialize() {
        ToggleGroup group = new ToggleGroup();
        rbNone.setToggleGroup(group);
        rb5.setToggleGroup(group);
        rb10.setToggleGroup(group);
        rb15.setToggleGroup(group);

        btnOrder.setId("btnOrder");
        cPizza.setId("cPizza");
        cSoftDrinks.setId("cSoftDrinks");
        rb5.setId("rb5");
        rbNone.setId("rbNone");
    }

    @FXML
    protected void handleOrder() {
        double total = 0;
        if (cPizza.isSelected()) total += 100;
        if (cBurger.isSelected()) total += 80;
        if (cFries.isSelected()) total += 65;
        if (cSoftDrinks.isSelected()) total += 55;
        if (cTea.isSelected()) total += 50;
        if (cSundae.isSelected()) total += 40;

        double discount = 0;
        if (rb5.isSelected()) discount = 0.05;
        else if (rb10.isSelected()) discount = 0.10;
        else if (rb15.isSelected()) discount = 0.15;

        total -= total * discount;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("The total price is Php " + String.format("%.2f", total));
        alert.showAndWait();
    }
}