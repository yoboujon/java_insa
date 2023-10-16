import partie3.Voiture34;

public class exercice3part4 {
    public static void main(String[] args) {
        Voiture34 voiture1 = new Voiture34();
        voiture1.setNom("Renault");
        voiture1.setPuissance(150);
        voiture1.demarre(70);
        Voiture34 voiture2 = new Voiture34();
        voiture2.setNom("Peugeot");
        voiture2.setPuissance(200);
        voiture2.demarre(100);

        // Affiche le nom et les stats des voitures créées
        for(int i=0; i<Voiture34.getNbVoitures() ; i++)
        {
            printVoiture(Voiture34.getListeVoitures()[i]);
        }
    }

    public static void printVoiture(Voiture34 v) {
        if(v.getNom() != null)
        {
            System.out.println(v.getNom()+":\tPuissance: " + v.getPuissance() + "\tVitesse: " + v.getVitesse());
        }
    }
}
