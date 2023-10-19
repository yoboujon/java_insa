import partie5.Cercle;
import partie5.Carre;
import partie5.Forme;

public class exercice5part2 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Carre carre = new Carre(10);

        printForme(cercle);
        printForme(carre);
    }

    public static void printForme(Forme f)
    {
        System.out.println("Cercle\tPerimetre: "+f.perimetre()+"\tSurface/Aire: "+f.surface()+"\tEtalement: "+f.etalement());
    }
}
