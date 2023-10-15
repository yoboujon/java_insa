import partie3.Voiture3;

public class exercice3part3 {
    public static void main(String[] args) {
        Voiture3 voiture1 = new Voiture3(50);
        Voiture3 voiture2 = new Voiture3(100);
        voiture1.demarre();
        voiture2.demarre(90);

        // Affichage du type et de l'adresse
        System.out.println(voiture1);
        // Verification du type et affichage des attribus des objets instanciés
        if (voiture1 instanceof Voiture3 && voiture2 instanceof Voiture3) {
            printVoiture(voiture1);
            printVoiture(voiture2);
        }

        // Voiture1 n'est plus instancié + Appel du garbage collector pour supprimer les
        // instances nulles
        voiture1 = null;
        System.gc();
        // Erreur si appel de cette fonction
        // printVoiture(voiture1);
    }

    public static void printVoiture(Voiture3 v) {
        System.out.println("VOITURE:\tPuissance: " + v.getPuissance() + "\tVitesse: " + v.getVitesse());
    }
}
