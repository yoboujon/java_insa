import partie3.Voiture2;

public class exercice3part2 {
    public static void main(String[] Argv)
    {
        Voiture2 peugeot = new Voiture2(200);
        peugeot.setVitesse(500);
        peugeot.demarre();
        printVoiture(peugeot);

        peugeot.setVitesse(200);
        peugeot.demarre();
        printVoiture(peugeot);
    }

    public static void printVoiture(Voiture2 v)
    {
        System.out.println("VOITURE:\tPuissance: "+v.getPuissance()+"\tVitesse: "+v.getVitesse());
    }
}
