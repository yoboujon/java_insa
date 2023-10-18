package partie5;

public class Avion extends Object {
    public double vitesse;
    public double puissance;

    public Avion(double v, double p) {
        this.vitesse = v;
        this.puissance = p;
    }

    // @Override n'est pas necessaire.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avion)) {
            return false;
        }
        Avion a = (Avion) o;
        return (a.vitesse == vitesse) && (a.puissance == puissance);
    }
}
