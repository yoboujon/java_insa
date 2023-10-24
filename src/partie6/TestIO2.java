package partie6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIO2 {
    public static void main(String[] args) {
        System.out.println("Veuillez saisir votre nom:");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputLine = reader.readLine();
            reader.close();
            System.out.println("Votre nom est " + inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
