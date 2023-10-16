package partie3;
import java.util.ArrayList;

public class Voiture34 {
    int puissance = 10;
    int vitesse = 0;
    boolean estDemarre = false;
    String nom;
    // Variables statiques, accessibles partout
    private static int nbVoitures = 0;
    private static Voiture34[] listeVoitures = new Voiture34[10];
    private static ArrayList<Voiture34> listeVoitures2 = new ArrayList<Voiture34>();

    public Voiture34() {
        //listeVoitures[nbVoitures] = this;
        listeVoitures2.add(this);
        nbVoitures++;
    }

    public Voiture34(int p) {
        this();
        puissance = p;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public static int getNbVoitures() {
        return nbVoitures;
    }

    public static Voiture34[] getListeVoitures() {
        return listeVoitures;
    }

    public static ArrayList<Voiture34> getListeVoitures2() {
        return listeVoitures2;
    }

    public String getNom(){
        return this.nom;
    }

    public boolean isDemarre() {
        return this.estDemarre;
    }

    public void setPuissance(int p) {
        this.puissance = p;
    }

    public void setVitesse(int v) {
        if (v <= this.puissance) {
            this.vitesse = v;
        } else {
            System.out.println("La vitesse(" + v + ") est supérieure à la puissance(" + this.puissance + ").");
        }
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void demarre() {
        this.estDemarre = true;
    }

    public void demarre(int v) {
        if (v <= this.puissance) {
            this.vitesse = v;
            this.estDemarre = true;
        } else {
            System.out.println("La vitesse(" + v + ") est supérieure à la puissance(" + this.puissance + ").");
        }
    }
}
