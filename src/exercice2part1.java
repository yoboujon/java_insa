public class exercice2part1 {
    public static void main(String[] argv) {
        Short[] ConstTab = { 1, 2, 3, 4, 5 };
        Character[] MonTableau = new Character[5];
        for (int i = 0; i < MonTableau.length; i++) {
            MonTableau[i] = (char) ('a' + (char) (i));
        }
        afficheTableau(ConstTab);
        afficheTableau(MonTableau);
    }

    public static <T> void afficheTableau(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
