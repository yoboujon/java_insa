package partie5;

public class Cercle extends Forme {
    double rayon;

    public Cercle(double r)
    {
        this.rayon = r;
    }

    public double perimetre()
    {
        return rayon*2*Math.PI;
    }

    public double surface()
    {
        return rayon*rayon*Math.PI;
    }
}
