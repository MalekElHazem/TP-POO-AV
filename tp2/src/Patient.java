import java.util.HashSet;
import java.util.Set;

public class Patient  {
	private String nom ;
	private Set <String > ordonnance ;
	public Patient ( String n){
	nom = n ;
	ordonnance = new HashSet <String >();
	}
	public String getNom () { return nom ;}
	public boolean ordonnanceVide (){
		// A completer 
		return ordonnance.isEmpty();
		
	}
	public Set<String> getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(HashSet<String> ordonnance) {
		this.ordonnance = ordonnance;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void ajoutMedicament ( String m) {
		// A completer 
		ordonnance.add(m);
	}
	public String ListOrodnnace() {
		String ch="";
			for(String i:ordonnance) {
			ch=ch+i+",";
		}
		return ch;
	}
	@Override
	public String toString() {
		
		return "Patient[nom:"+this.nom+" ordonnance["+this.ListOrodnnace()+" ]]";
		
	}
	public void affiche(){
		System.out.println(this);
	}
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
		}



	public void trieOrdonnace() {
		// A compléter
		Set<String> ordonnanceTrie = new HashSet<String>();
		ordonnanceTrie.addAll(ordonnance);
		ordonnance=ordonnanceTrie;

	
	}
	
	
	
	
	
}
