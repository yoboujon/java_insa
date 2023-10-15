import partie3.Voiture;

public class exercice3part1 {
    public static void main(String[] argv)
    {
        Voiture volkswagen = new Voiture();
        volkswagen.puissance = 30;
        volkswagen.vitesse = 0;
        volkswagen.estDemarre = false;
        Voiture renault = new Voiture();
        renault.puissance = 500;
        renault.vitesse = 200;
        renault.estDemarre = true;

        System.out.println(renault.puissance);
        System.out.println(renault.vitesse);
        System.out.println(renault.estDemarre);
        System.out.println(volkswagen.puissance);
        System.out.println(volkswagen.vitesse);
        System.out.println(volkswagen.estDemarre);
    }
}