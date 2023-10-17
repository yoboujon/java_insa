package partie4;

import java.util.ArrayList;

public class Voiture {
    int puissance = 10;
    double vitesse = 0;
    boolean estDemarre = false;
    String nom;

    private static ArrayList<Voiture> listeVoitures = new ArrayList<Voiture>();

    public Voiture(double v) {
        this.vitesse = v;
        listeVoitures.add(this);
    }

    public double getVitesse() {
        return this.vitesse;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public static ArrayList<Voiture> getListeVoitures() {
        return listeVoitures;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean isDemarre() {
        return this.estDemarre;
    }

    public void setPuissance(int p) {
        this.puissance = p;
    }

    public void accelere(double a) {
        if ((a + this.vitesse) <= this.puissance) {
            this.vitesse += a;
        } else {
            System.out.println("La vitesse(" + (a + this.vitesse) + ") voulue est supérieure à la puissance("
                    + this.puissance + ").");
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
