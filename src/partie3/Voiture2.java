package partie3;

public class Voiture2 {
    int puissance;
    int vitesse;
    boolean estDemarre;

    public Voiture2()
    {
        this.puissance = 10;
        this.vitesse = 0;
        this.estDemarre = false;
    }

    public Voiture2(int p)
    {
        this();
        puissance = p;
    }

    public int getPuissance()
    {
        return this.puissance;
    }

    public void setPuissance(int p)
    {
        this.puissance = p;
    }

    public int getVitesse()
    {
        return this.vitesse;
    }

    public void setVitesse(int v)
    {
        if (v <= this.puissance)
        {
            this.vitesse = v;
        }
        else
        {
            System.out.println("Vitesse trop élevée !!");
        }
    }

    public void demarre()
    {
        if(vitesse > 0)
        {
            this.estDemarre = true;
        }
        else
        {
            System.out.println("Ne démarre que si une vitesse est initialisée.");
        }
    }
}
