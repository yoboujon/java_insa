package partie3;

public class Voiture {
    public int puissance;
    public int vitesse;
    public boolean estDemarre;

    public Voiture()
    {
        this.puissance = 10;
        this.vitesse = 0;
        this.estDemarre = false;
    }

    public Voiture(int p)
    {
        this();
        puissance = p;
    }

    public Voiture(int p, boolean e)
    {
        this(p);
        this.vitesse = (int)(p/3);
        this.estDemarre = e;
    }
}
