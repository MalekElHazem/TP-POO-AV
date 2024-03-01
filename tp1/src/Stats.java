import java.util.ArrayList;
import java.util.Collections;

public class Stats {

    private ArrayList<Etudiant> etudiants;

    public Stats(ArrayList<Etudiant> etudiants) {
        super();
        this.etudiants = etudiants;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public static float MoyenneEtudiant(Etudiant e) {

        return e.getValue();
    }
    public static Note MeilleurNoteEtudiant(Etudiant e) {
        return Collections.max(e.notes);
    }
    public static Note MoinsBonNoteEtudiant(Etudiant e) {
        return Collections.min(e.notes);
    }
    public static float MoyenneGroupe(ArrayList<Etudiant> group) {
        float s=0;
        for(Etudiant e:group) {
            s=s+e.getValue();
        }
        return s/group.size();
    }
    public static Etudiant MeilleurEtudtiant(ArrayList<Etudiant> group) {

        return Collections.max(group);

    }
    public static Etudiant MoinsBonEtudtiant(ArrayList<Etudiant> group) {

        return Collections.min(group);
    }

    @Override
    public String toString() {
        String ch="";
        for(Etudiant e: etudiants) {
            ch=ch+e.toString()+" ";
        }
        return ch;
    }

}
