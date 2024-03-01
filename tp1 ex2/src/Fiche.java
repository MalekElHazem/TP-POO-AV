public class Fiche {
    String nom;
    int num;
    String adress;

    Fiche(String nom, int num, String adress){
        this.nom = nom;
        this.num = num;
        this.adress = adress;
    }


    public int getNum() {
        return num;
    }

    public String getAdress() {
        return adress;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Fiche{" +
                "nom='" + nom + '\'' +
                ", num=" + num +
                ", adress='" + adress + '\'' +
                '}';
    }
}
