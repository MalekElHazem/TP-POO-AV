package ma.projet.entite;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Etudiant {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty nom;
    private final SimpleStringProperty prenom;
    private final SimpleStringProperty sexe;
    private final SimpleStringProperty filiere;

    public Etudiant(int id, String nom, String prenom, String sexe, String filiere) {
        this.id = new SimpleIntegerProperty(id);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.sexe = new SimpleStringProperty(sexe);
        this.filiere = new SimpleStringProperty(filiere);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public SimpleStringProperty nomProperty() {
        return nom;
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public SimpleStringProperty prenomProperty() {
        return prenom;
    }

    public String getSexe() {
        return sexe.get();
    }

    public void setSexe(String sexe) {
        this.sexe.set(sexe);
    }

    public SimpleStringProperty sexeProperty() {
        return sexe;
    }

    public String getFiliere() {
        return filiere.get();
    }

    public void setFiliere(String filiere) {
        this.filiere.set(filiere);
    }

    public SimpleStringProperty filiereProperty() {
        return filiere;
    }
}
