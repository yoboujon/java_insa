import partie4.VehiculePrioritaire;
import partie4.Voiture;

public class exercice4part1 {
    public static void main(String[] args) {
        VehiculePrioritaire vehiculePrioritaire1 = new VehiculePrioritaire();
        vehiculePrioritaire1.setNom("Octane");
        vehiculePrioritaire1.setPuissance(60);
        vehiculePrioritaire1.accelere(50);
        vehiculePrioritaire1.allumeGyrophare();
        for(Voiture v : VehiculePrioritaire.getListeVoitures())
        {
            printVoiture(v);
        }

        System.out.println("Amélioration du moteur...");
        vehiculePrioritaire1.setPuissance(100);
        vehiculePrioritaire1.allumeGyrophare();
        for(Voiture v : VehiculePrioritaire.getListeVoitures())
        {
            printVoiture(v);
        }
    }

    public static void printVoiture(Voiture v) {
        if(v.getNom() != null)
        {
            System.out.println(v.getNom()+":\tPuissance: " + v.getPuissance() + "\tVitesse: " + v.getVitesse());
        }
    }
}
