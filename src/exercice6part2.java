import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class exercice6part2 {
    public static void main(String[] args) {
        // création du document
        try {
            // Propriétés du document
            Document document = new Document();

            // Ouverture d'un canal de sortie vers 'fichier1.pdf'
            FileOutputStream fos = new FileOutputStream("fichier1.pdf");
            // Linkage entre le document et le fichier de sortie
            PdfWriter.getInstance(document, fos);
            // Un fois ouvert, on peut écrire dans le fichier pdf souhaité.
            document.open();
            document.addAuthor("Yohan Boujon");
            document.addCreationDate();
            document.addTitle("premier document");
            document.add(new Paragraph("paragraphe 1"));
            document.close();
        } catch (FileNotFoundException e) {
            // Si le nom de FileOutputStream est nul.
            e.printStackTrace();
        } catch (DocumentException de) {
            // Erreur provenant de ItextPDF quelconque.
            System.err.println(de.getMessage());
        }
    }
}