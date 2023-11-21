module com.example.vop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.vop to javafx.fxml;
    exports com.example.vop;
}