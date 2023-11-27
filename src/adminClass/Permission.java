
package adminClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

//extend room class
public class Permission extends Room{

    //declare private variable
    private boolean available;
    //declare normal variable
    List<Object> roomCapacity = new ArrayList<>();
    
    //constructor
    public Permission(){}

    //constructor
    public Permission(boolean available) {
        super();    // Invokes the constructor of the superclass
        this.available = available;
    }
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //check room capacity
    public void checkCapacity() {
        super.ReadFromFile("room.txt");  
        for(int i=0; i<roomInfo.size(); i+=5){  //add roomID, capacity, Hostel ID
            roomCapacity.add(roomInfo.get(i));
            roomCapacity.add(roomInfo.get(i+3));
            roomCapacity.add(roomInfo.get(i+4));
        }
        checkOccupiedRoom(roomCapacity);    //call checkOccupiedRoom() function
        WriteAndReadFile data = new WriteAndReadFile("roomAvailability.txt");
        data.write(roomCapacity);   //write data to file
    }
   
    //check if the room is occupied 
    public void checkOccupiedRoom(List<Object>availableRoom) {
        List<Object> approveInfo = new ArrayList<>();
        WriteAndReadFile data = new WriteAndReadFile("Approve.txt");
        data.read(approveInfo);     //read data
        for (int i = 0; i < availableRoom.size(); i += 3) {
            for (int j = 0; j < approveInfo.size(); j += 5) {
                if (approveInfo.get(j+2).equals(availableRoom.get(i))) {
                        int count = (int) availableRoom.get(i + 1) - 1;     //if there is a student in the room, capacity minus 1
                        availableRoom.set(i + 1, count);
                        String checkOutDate = (String)approveInfo.get(j+4);
                        boolean checkout = roomCheckedOut(checkOutDate);       //call roomCheckedOut() function
                        //if checked out, capacity plus 1
                        if(checkout){   
                            System.out.println(checkOutDate);
                            count = count +1;
                            availableRoom.set(i + 1, count);
                        }
                }
            }
        }
    }
    
    //check the availability of room
    public void checkAvailability(String roomNum, List<Object> availableRoom){
        for(int i=0; i<availableRoom.size();i+=3){
            if(roomNum.equals(availableRoom.get(i))){
                if((int)availableRoom.get(i+1)== 0){
                    available = false;  //room not available
                }
                else{
                    available = true;   //room available
                }
            }
        }
    }
    
    
    
    //check the room if it is already checked out
    public boolean roomCheckedOut(String checkOutDate) {
        LocalDate currentDate = LocalDate.now(); // Get the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Define the desired format for the date
        try {
            LocalDate parsedCheckOutDate = LocalDate.parse(checkOutDate, formatter);
            return parsedCheckOutDate.isBefore(currentDate);    //return already checked out
        } catch (DateTimeParseException e) {
            // Handle parsing error
            System.out.println("Invalid date format: " + checkOutDate);
        }

        return false;
    }
    
    // calculate the yearly rental
    public double yearlyRentalCalculate(String roomID){
        double rentalYear = 0.00;
        super.ReadFromFile("room.txt");
        for(int i=0; i<roomInfo.size();i+=5){
            if(roomID.equals(roomInfo.get(i))){
                rentalYear = (double)roomInfo.get(i+1)*12;      //multiply the monthly rental by 12
            } 
        }
        return rentalYear;
    }
   
    //calculate the outstanding
    public void outstandingCalculate() {
        List<Object> paymentInfo = new ArrayList<>();
        WriteAndReadFile data = new WriteAndReadFile("payment.txt");
        data.read(paymentInfo);

        List<Object> outstandingInfo = new ArrayList<>();
        WriteAndReadFile data2 = new WriteAndReadFile("outstanding.txt");
        data2.read(outstandingInfo);
        
        //for loop to get the payment and minus by outstanding
        for (int i = 0; i < paymentInfo.size(); i += 3) {
            for (int j = 0; j < outstandingInfo.size(); j += 3) {
                if (paymentInfo.get(i).equals(outstandingInfo.get(j))) {
                    double paymentAmount = (double) paymentInfo.get(i + 1);     //get payment
                    double outstanding = (double) outstandingInfo.get(j + 1) - paymentAmount;   //outstanding - payment
                    outstandingInfo.set(j + 2, outstanding);        //set outstanding amount
                }
            }
        }
        data2.write(outstandingInfo);       //write data
    }
    
}




