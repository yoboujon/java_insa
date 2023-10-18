import partie5.Avion;
import partie5.AvionElectrique;
import partie4.Voiture;

public class exercice5part1 {
    public static void main(String[] args) {
        Avion avion1 = new Avion(50, 60);
        AvionElectrique avion2 = new AvionElectrique();
        Avion avion3 = new Avion(10, 20);
        // voiture1 a la même vitesse et accéleration que avion3.
        Voiture voiture1 = new Voiture(10);
        voiture1.setPuissance(20);

        System.out.println("avion2 == avion1 ? " + avion1.equals(avion2));
        System.out.println("avion3 == avion1 ? " + avion1.equals(avion3));
        System.out.println("avion3 == avion2 ? " + avion2.equals(avion3));
        System.out.println("avion1 == avion1 ? " + avion1.equals(avion1));
        // Avertissement. Cas prévu car le recast ne peut être fait.
        System.out.println("voiture1 == avion3 ? " + avion3.equals(voiture1));
    }
}
