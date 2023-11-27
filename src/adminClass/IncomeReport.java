
package adminClass;

import com.itextpdf.text.pdf.PdfPTable;
import java.util.ArrayList;
import java.util.List;

//Inherit Report class
public class IncomeReport extends Report{
    
    //create header for table in PDF
    @Override
    public PdfPTable pdfHeader(){
        PdfPTable tb= new PdfPTable(3);
        String[] headers = {"Date", "Student ID", "Payment (RM)"};
        for (String header : headers) {  //for loop for adding header
            tb.addCell(header);  //add header
        }
        return tb;
    }
    
    //add data to table
    public void passData(PdfPTable tb, String date, String studentID, String payment){
        tb.addCell(date);
        tb.addCell(studentID);
        tb.addCell(payment);
    }
   
    
    //find data that match the choosen month and year
    public void searchByMonth(List<Object> paymentInfo, String targetMonth, String targetYear) {
        List<Object> info = new ArrayList<>();
        WriteAndReadFile data = new WriteAndReadFile("payment.txt");
        data.read(info);    //read data

        for (int i = 0; i < info.size(); i += 3) {
            //separate the month and date in a string
            if (info.get(i + 2) instanceof String && ((String) info.get(i + 2)).matches("\\d{2}-\\d{2}-\\d{4}")) {
                String dateString = (String) info.get(i + 2);
                String[] parts = dateString.split("-");
                String itemMonth = parts[1];
                String itemYear = parts[2];
                
                //find the data related to required month and year
                if (itemMonth.equals(targetMonth) && itemYear.equals(targetYear)) {
                    paymentInfo.add(dateString);
                    paymentInfo.add(info.get(i));
                    paymentInfo.add(info.get(i + 1));
                }
            }
        }
    }
    
    //find data accoring the choosen year
    public void searchByYear(List<Object> paymentInfo, String targetYear) {
        List<Object> info = new ArrayList<>();
        WriteAndReadFile data = new WriteAndReadFile("payment.txt");
        data.read(info);    //read data
        //separate the month and date in a string
        for (int i = 0; i < info.size(); i += 3) {
            if (info.get(i + 2) instanceof String && ((String) info.get(i + 2)).matches("\\d{2}-\\d{2}-\\d{4}")) {
                String dateString = (String) info.get(i + 2);
                String[] parts = dateString.split("-");
                String itemMonth = parts[1];
                String itemYear = parts[2];

                //find the data related to required year
                if (itemYear.equals(targetYear)) {
                    paymentInfo.add(dateString);
                    paymentInfo.add(info.get(i));
                    paymentInfo.add(info.get(i + 1));
                }
            }
        }
    }
    
    
    
    
}
