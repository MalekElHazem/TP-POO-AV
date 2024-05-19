package ma.projet.presentation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ma.projet.entite.Etudiant;
import ma.projet.manager.EtudiantM;

import java.util.List;

public class ControllerEtudiant {

    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private ComboBox<String> sexeComboBox;

    @FXML
    private TextField filiereField;

    @FXML
    private TableView<Etudiant> etudiantTableView;

    @FXML
    private TableColumn<Etudiant, Integer> idColumn;

    @FXML
    private TableColumn<Etudiant, String> nomColumn;

    @FXML
    private TableColumn<Etudiant, String> prenomColumn;

    @FXML
    private TableColumn<Etudiant, String> sexeColumn;

    @FXML
    private TableColumn<Etudiant, String> filiereColumn;

    private EtudiantM etudiantManager = new EtudiantM();

    private ObservableList<Etudiant> etudiantList = FXCollections.observableArrayList();

    public void initialize() {
        // Initialiser la ComboBox de sexe
        sexeComboBox.getItems().addAll("M", "F");

        // Initialiser les colonnes de la TableView
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nomColumn.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        prenomColumn.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
        sexeColumn.setCellValueFactory(cellData -> cellData.getValue().sexeProperty());
        filiereColumn.setCellValueFactory(cellData -> cellData.getValue().filiereProperty());

        // Charger les données dans la TableView
        loadEtudiants();
    }

    private void loadEtudiants() {
        etudiantList.clear();
        etudiantList.addAll(etudiantManager.findAll());
        etudiantTableView.setItems(etudiantList);
    }

    @FXML
    void handleAjouter(ActionEvent event) {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String sexe = sexeComboBox.getValue();
        String filiere = filiereField.getText();

        if (nom.isEmpty() || prenom.isEmpty() || sexe == null || filiere.isEmpty()) {
            showAlert("Veuillez remplir tous les champs.");
            return;
        }

        Etudiant newEtudiant = new Etudiant(nom, prenom, sexe, filiere);
        boolean success = etudiantManager.create(newEtudiant);
        if (success) {
            showAlert("Étudiant ajouté avec succès.");
            loadEtudiants();
            clearFields();
        } else {
            showAlert("Erreur lors de l'ajout de l'étudiant.");
        }
    }

    @FXML
    void handleSupprimer(ActionEvent event) {
        Etudiant selectedEtudiant = etudiantTableView.getSelectionModel().getSelectedItem();
        if (selectedEtudiant != null) {
            boolean success = etudiantManager.delete(selectedEtudiant);
            if (success) {
                showAlert("Étudiant supprimé avec succès.");
                loadEtudiants();
            } else {
                showAlert("Erreur lors de la suppression de l'étudiant.");
            }
        } else {
            showAlert("Veuillez sélectionner un étudiant à supprimer.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        nomField.clear();
        prenomField.clear();
        sexeComboBox.setValue(null);
        filiereField.clear();
    }
}
