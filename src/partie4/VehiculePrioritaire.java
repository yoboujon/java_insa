package partie4;

public class VehiculePrioritaire extends partie4.Voiture {
    boolean gyrophare;

    public VehiculePrioritaire() {
        super(4);
    }

    public void allumeGyrophare() {
        this.gyrophare = true;
        System.out.println("Gyrophare allumé!");
        super.accelere(10);
    }
}
