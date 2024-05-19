module com.example.tp6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.tp6 to javafx.fxml;
    exports com.example.tp6;
    exports ma.projet.connexion;
    opens ma.projet.connexion to javafx.fxml;
    exports ma.projet.entite;
    opens ma.projet.entite to javafx.fxml;
    exports ma.projet.manager;
    opens ma.projet.manager to javafx.fxml;
    exports ma.projet.presentation;
    opens ma.projet.presentation to javafx.fxml;
    exports ma.projet;
    opens ma.projet to javafx.fxml;
}