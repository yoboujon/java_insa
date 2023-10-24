package partie6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO3 {
    public static void main(String[] args) throws IOException {
        FileReader fileIn;
        FileWriter fileOut;
        // Copie le fichier a_lire.txt dans a_ecrire2.txt.
        // Si le fichier n'existe pas renvoi une exception.
        try {
            fileIn = new FileReader("a_lire.txt");
            fileOut = new FileWriter("a_ecrire2.txt");
            int c;
            while ((c = fileIn.read()) != -1) {
                fileOut.write(c);
            }
            fileIn.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
