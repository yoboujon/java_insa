package partie5;

public abstract class Forme {
    public abstract double perimetre();
    public abstract double surface();
    public double etalement() {
        double peri = perimetre();
        return 16 * surface() / (peri* peri);
    }
}
