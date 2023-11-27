
package adminClass;

import com.itextpdf.text.pdf.PdfPTable;

//inherit Report class
public class RoomReport extends Report{
    
    //create header for table in PDF
    @Override
    public PdfPTable pdfHeader(){
        PdfPTable tb= new PdfPTable(5);
        String[] headers = {"Room ID", "Type", "Rental (RM)", "Capacity", "Spaces Left"};
        for (String header : headers) {  //for loop for adding header
            tb.addCell(header);  //add header
        }
        return tb;
    }
    
    //add data to the table
    public void passData(PdfPTable tb, String id, String type, String rental, String cap, String space){
        tb.addCell(id);
        tb.addCell(type);
        tb.addCell(rental);
        tb.addCell(cap);
        tb.addCell(space);
    }
    
}
