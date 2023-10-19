import partie6.ErrConst;
import partie6.ErrDepl;
import partie6.Point;

// TestPoint
public class exercice6part3 {
    public static void main(String[] args) {
        try {
            Point a = new Point(Integer.parseInt(args[0]), 4);
            a.affiche();
            a.deplace(10,Integer.parseInt(args[1]));
            a.affiche();
        } catch (ErrConst e) {
            System.out.println("Value of y: " + e.getOrd());
            System.out.println("Value of x: " + e.getAbs());
            e.printStackTrace();
            System.exit(-1);
        } catch (ErrDepl e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
