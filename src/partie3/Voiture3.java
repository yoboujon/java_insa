package partie3;

public class Voiture3 {
    int puissance;
    int vitesse;
    boolean estDemarre;

    public Voiture3() {
        this.puissance = 10;
        this.vitesse = 0;
        this.estDemarre = false;
    }

    public Voiture3(int p) {
        this();
        puissance = p;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public int getVitesse() {
        return this.vitesse;
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
