public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();

        stock.addNouvArticle(new Article("a", 10), 10);
        stock.addNouvArticle(new Article("b", 20), 20);
        stock.addNouvArticle(new Article("c", 30), 30);

        Facture facture = new Facture(stock);

        facture.addLigne(5, "a");
        facture.addLigne(10, "b");
        facture.addLigne(15, "c");

        System.out.println(facture.getMontantTotal());

        facture.removeLigne(2);

        System.out.println(facture.getMontantTotal());

        stock.sortStock();

        stock.changeQt("a", 50);
        stock.sortStock();
        
        stock.removeArticle("a");
        stock.sortStock();

        
    }
}