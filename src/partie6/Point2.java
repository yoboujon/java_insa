package partie6;

public class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("X: " + x + "\tY: " + y + "\thashCode: " + this.hashCode());
    }

    public boolean equals(Object pp) {
        Point2 p = (Point2) pp;
        return ((this.x == p.x) && (this.y == p.y));
    }

    public int hashCode() {
        // x*2 pour empêcher d'avoir p2=p1
        // ! Cela n'empêche en rien les doublons.
        return (x * 2) + y;
        // ? Une technique possible serait un array statique qui garde en mémoire
        // ? chaque hashcode en fonction d'une coordonnee. Il est aussi possible de le
        // ? faire avec un algorithme mathématique
    }
}
