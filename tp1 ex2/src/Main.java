import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Scanner scanner = new Scanner(System.in);

        String commande;
        do {
            System.out.print("Commande (+nom, ?nom, !, .): ");
            commande = scanner.nextLine();

            switch (commande.charAt(0)) {
                case '+':
                    String[] parts = commande.substring(1).split(",");
                    String nomToAdd = parts[0];
                    int num = Integer.parseInt(parts[1]);
                    String adress = parts[2];
                    annuaire.ajout(nomToAdd, num, adress);
                    break;
                case '?':
                    String nomToSearch = commande.substring(1);
                    Fiche fiche = annuaire.Recherche(nomToSearch);
                    if (fiche != null) {
                        System.out.println(fiche);
                    } else {
                        System.out.println("Fiche non trouvée.");
                    }
                    break;
                case '!':
                    annuaire.affiche();
                    break;
                case '.':
                    break;
                default:
                    System.out.println("Commande invalide");
            }
        } while (!commande.equals("."));

        scanner.close();
    }
}
