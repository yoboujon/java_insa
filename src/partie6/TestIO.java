package partie6;

import java.io.FileWriter;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter myFile = new FileWriter("");
            myFile.write("Super ligne dans mon fichier, waouw.");
            myFile.close();
        } catch (IOException e) {
            FileWriter logFile = new FileWriter("test_io.log");
            logFile.write(e.getMessage());
            logFile.close();
        }
    }
}
