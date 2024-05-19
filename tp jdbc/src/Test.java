import ma.projet.beans.Client;
import ma.projet.service.ClientService;

public class Test {
    public static void main(String[] args) {
        ClientService cs = new ClientService();

        cs.create(new Client("SAFI", "ali"));
        cs.create(new Client("ALAOUI", "widane"));
        cs.create(new Client("RAMI", "amine"));
        cs.create(new Client("ALAMI", "kamal"));
        cs.create(new Client("SELAMI", "mohamed"));

        Client c = cs.findById(3);
        if (c != null) {
            System.out.println("Client avec id 3 : " + c.getNom() + " " + c.getPrenom());
        } else {
            System.out.println("Aucun client trouvé avec l'id 3");
        }

        cs.delete(cs.findById(3));

        Client cc = cs.findById(2);
        if (cc != null) {
            cc.setNom("nouveau nom");
            cc.setPrenom("nouveau prénom");
            cs.update(cc);
        } else {
            System.out.println("Aucun client trouvé avec l'id 2");
        }

        System.out.println("Liste des clients après modification et suppression :");
        for (Client cl : cs.findAll()) {
            System.out.println(cl.getNom() + " " + cl.getPrenom());
        }
    }
}
