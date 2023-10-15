import partie3.Voiture;

public class exercice3part1 {
    public static void main(String[] argv)
    {
        Voiture volkswagen = new Voiture(30);
        volkswagen.estDemarre = false;
        Voiture renault = new Voiture(500,true);

        System.out.println(renault.puissance);
        System.out.println(renault.vitesse);
        System.out.println(renault.estDemarre);
        System.out.println(volkswagen.puissance);
        System.out.println(volkswagen.vitesse);
        System.out.println(volkswagen.estDemarre);
    }
}