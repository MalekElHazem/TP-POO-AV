
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Note> n1=new ArrayList<>();
        n1.add(new Note("zz", 15));
        n1.add(new Note("ee", 17.5f));
        n1.add(new Note("zz", 18));
        n1.add(new Note("zz", 10));



        ArrayList<Note> n2=new ArrayList<>();
        n2.add(new Note("ss", 11));
        n2.add(new Note("ss", 10));
        n2.add(new Note("ss", 12));
        n2.add(new Note("ss", 15.25f));



        Etudiant e1=new Etudiant("CC", "john", n1);
        Etudiant e2=new Etudiant("VV", "moral", n2);



        ArrayList<Etudiant> dsi2=new ArrayList<>();
        dsi2.add(e1);
        dsi2.add(e2);


        Stats s=new Stats(dsi2);



        System.out.println("Moyenness        de l'etudiant e1:"+Stats.MoyenneEtudiant(e1));
        System.out.println("Meilleur note de l'etudiant e1:"+Stats.MeilleurNoteEtudiant(e1).getNote());
        System.out.println("Moyenne de l'etudiant e1:"+Stats.MoinsBonNoteEtudiant(e1).getNote());
        System.out.println("Moyenne de classe dsi2 :"+Stats.MoyenneGroupe(dsi2));
        System.out.println("Meilleur etudiant de classe dsi2:"+Stats.MeilleurEtudtiant(dsi2).getNom());
        System.out.println("Moins etudiant de classe dsi2:"+Stats.MoinsBonEtudtiant(dsi2).getNom());



        Collections.sort(dsi2,new MatriculeComparator());
        System.out.println("Liste des etudiants trie par matricule :"+dsi2.toString());


        Collections.sort(dsi2,new NomComparator());
        System.out.println("Liste des etudiants trie par nom :"+dsi2.toString());


        Collections.sort(dsi2);
        System.out.println("Liste des etudiants trie par moyenne :"+dsi2.toString());


    }

}
