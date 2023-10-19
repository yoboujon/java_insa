package partie6;
import java.util.Date;

import partie4.Voiture;

public class exercice6part1 {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture(10);
        // Date 12/11(-1)/2020(-1900) -> Deprecated. Il vaut mieux utiliser la class Calendar.
        // Date sert visiblement à stocker une date au format Epoch directement.
        voiture1.setDate(new Date(120, 10, 12));
        System.out.println(voiture1.getDate().toString());
        // Print : Thu Nov 12 00:00:00 CET 2020
    }
}
