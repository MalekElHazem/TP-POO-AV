package ma.projet.entite;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private String filiere;

    // Constructeur avec id
    public Etudiant(int id, String nom, String prenom, String sexe, String filiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.filiere = filiere;
    }

    // Constructeur sans id (id auto-incrément)
    public Etudiant(String nom, String prenom, String sexe, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.filiere = filiere;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getFiliere() {
        return filiere;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
