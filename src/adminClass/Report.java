
package adminClass;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//create abstract class for Report class
public abstract class Report {
    
    //abstarct method
    public abstract PdfPTable pdfHeader();
    
    //generate PDF and save to desktop
    public void generateReport(String filename, PdfPTable content, String title) {
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\yuwei_\\OneDrive\\Desktop\\" + filename));
            document.open();
           
            // Add the title as a separate paragraph
            Paragraph reportTitle = new Paragraph(title + " Report");
            document.add(reportTitle);
            Paragraph emptyLine = new Paragraph("\n");
            document.add(emptyLine); // Add an empty line
            document.add(content); // Add the PdfPTable to the Document
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}