module com.example.guiapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.guiapplication to javafx.fxml;
    exports com.example.guiapplication;
}