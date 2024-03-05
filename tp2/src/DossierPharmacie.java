import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DossierPharmacie {

	private String nom ;
	private HashMap <String , Patient > patients ;
	public DossierPharmacie ( String n){
	nom =n;
	patients = new HashMap <String , Patient >();
	}
	void nouveauPatient ( String nom , String [] ord ){
		
		Patient p=new Patient(nom);
		//p.setOrdonnance(ord);
		
		patients.put(nom, p);
	}
	public boolean ajoutMedicament (String nom, String m){
		// A completer
		if(patients.containsKey(nom))
		{
			patients.get(nom).ajoutMedicament(m);
			return true;
		}
		else
		{
			return false;
		}
	}
	public void affichePatient (String nom){
		
		patients.get(nom).affiche();
		}
	public void affiche (){
		System.out.println("Nom:"+this.nom);
		for(String p:patients.keySet()) {
			patients.get(p).affiche();
		}
		
	}
	public Collection <String > affichePatientAvecMedicament (String m){
		// A completer
		Set < String >c =new HashSet <String >() ;
		for(String p:patients.keySet()) {
			if(patients.get(p).contientMedicament(m)) {
				c.add(p);
			}
		}
		return c;
		}
	
}
