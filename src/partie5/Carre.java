package partie5;

public class Carre extends Forme {
    double cote;

    public Carre(double c)
    {
        this.cote = c;
    }

    public double perimetre() {
        return this.cote*4;
    }

    public double surface() {
        return this.cote*this.cote;
    }
}
