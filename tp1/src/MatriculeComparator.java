import java.util.Comparator;

public class MatriculeComparator implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        // TODO Auto-generated method stub
        return o1.getMatricule().compareTo(o2.getMatricule());

    }

}