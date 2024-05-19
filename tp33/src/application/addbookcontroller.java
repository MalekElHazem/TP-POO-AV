package application;



import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import application.person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class addbookcontroller implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField email;
    @FXML
    private Button addBtn;
    @FXML
    private Button exportBtn;
    @FXML
    private Button importBtn;
    @FXML
    private Button removeBtn;
    @FXML
    private Button quitBtn;
    @FXML
    private TableView<person> table;
    private TableColumn<person, String> emailCol;
    private TableColumn<person, String> firstNameCol;
    private TableColumn<person, String> lastNameCol;
    private dataclass data;

    @SuppressWarnings("unchecked")
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        data = new dataclass();

        emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        firstNameCol = new TableColumn<>("Nom");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
        
        lastNameCol = new TableColumn<>("Prénom");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        ObservableList<person> observableList = FXCollections.observableList(data.getImportList());
        table.setItems(observableList);
    }

    @FXML
    private void remove() {
       
        person selectedPerson = table.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            data.getImportList().remove(selectedPerson);
        } else {
           
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Aucune sélection");
            alert.setHeaderText("Veuillez sélectionner une personne à supprimer.");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleAddButtonAction() {
        String vnom = nom.getText();
        String vprenom = prenom.getText();
        String vemail = email.getText();
        if (!vnom.isEmpty() && !vprenom.isEmpty() && !vemail.isEmpty()) {
            person newPerson = new person(vnom, vprenom, vemail);
            
           
            data.getImportList().add(newPerson);
            
           
            ObservableList<person> observableList = FXCollections.observableList(data.getImportList());
            table.setItems(observableList);
                
        }else {
            
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Champs vides");
            alert.setHeaderText("Veuillez remplir tous les champs");
            alert.showAndWait();
        }
        
        }

    
    @FXML
    public void handleImportButtonClick() {
        
        List<person> importedPersons = data.getImportList();
        
      
        ObservableList<person> observableList = FXCollections.observableList(importedPersons);
        
                table.setItems(observableList);
    }

    
    
    
    
    
    
    public void handleExportButtonClick() {
        
        ObservableList<person> displayedPersons = table.getItems();
        
        
        data.setExportList(displayedPersons);
    }

    
    @FXML
    public void handleQuitButtonClick() {
      
        Platform.exit();
    }
}
