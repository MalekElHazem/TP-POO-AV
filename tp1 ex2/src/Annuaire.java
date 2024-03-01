import java.util.HashMap;
import java.util.Map;

public class Annuaire {
    private Map<String, Fiche> fiches;

    Annuaire(){
        this.fiches = new HashMap<>();
    }

    public void ajout(String nom, int num, String adress){
        fiches.put(nom, new Fiche(nom, num, adress));
    }

    public void affiche(){
        fiches.values().forEach(System.out::println);
    }

    public Fiche Recherche(String nom){
        return fiches.get(nom);
    }

}
