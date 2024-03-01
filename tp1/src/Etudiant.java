
import java.util.ArrayList;

public class Etudiant implements Statisticable,Comparable<Etudiant> {

    private String matricule;
    private String nom;
    ArrayList <Note> notes;


    public Etudiant(String matricule, String nom, ArrayList<Note> notes) {
        super();
        this.matricule = matricule;
        this.nom = nom;
        this.notes = notes;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public int compareTo(Etudiant o) {
        // TODO Auto-generated method stub
        if(this.getValue()==o.getValue()) {
            return 0;
        }
        else if(this.getValue()<o.getValue())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    @Override
    public float getValue() {
        // TODO Auto-generated method stub
        float s=0;
        for(Note n:notes) {
            s=s+n.getNote();
        }
        return s/notes.size();
    }
    @Override
    public String toString() {
        return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", Moyenne=" + getValue() + "]";
    }





}
