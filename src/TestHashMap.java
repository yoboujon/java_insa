import java.util.HashMap;
import java.util.Iterator;

import partie6.Point2;

class TestHashmap {
    public static void main(String[] args) {
        Point2 p1 = new Point2(1, 3);
        Point2 p2 = new Point2(2, 2);
        Point2 p3 = new Point2(4, 5);
        HashMap<Point2, Integer> hashMapPoints = new HashMap<Point2, Integer>();
        hashMapPoints.put(p1, 10);
        // Le hashcode de p1 reste le même.
        // L'ajout de p2 fait que la boucle vers l'itérateur s'est incrémenté
        hashMapPoints.put(p2, 20);
        hashMapPoints.put(p3, 30);
        affiche(hashMapPoints);
        System.out.println("hashMapPoints.get(p1): " + hashMapPoints.get(p1) + "\thashMapPoints.containsKey(p1): "
                + hashMapPoints.containsKey(p1) + "\thashMapPoints.containsValue(10): "
                + hashMapPoints.containsValue(10));
        Point2 p4 = new Point2(1, 3);
        System.out.println(
                "hashcode p4: " + p4.hashCode() + "\thashMapPoints.containsKey(p4): " + hashMapPoints.containsKey(p4));
    }

    static void affiche(HashMap<Point2, Integer> ens) {
        Iterator<Point2> it = ens.keySet().iterator();
        while (it.hasNext()) {
            Point2 p = it.next();
            p.affiche();
            System.out.println("key: " + p.hashCode() + "\tvalue: " + ens.get(p));
        }
    }
}