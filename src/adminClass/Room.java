
package adminClass;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

//Room class inherits Hostel class
public class Room extends Hostel{
    //Declare private class variable
    private String roomNumber;
    private double rental;
    private String type;
    private int capacity;
    
    //Declare normal class variable
    public List<Object> roomInfo = new ArrayList<>();
    int num;
    
    //Constructor
    public Room(){}
    
    //Constructor
    public Room(String hostelID, String hostelName, int Hostelcapacity, String roomNumber, double rental, String type, int capacity){
        super(hostelID,hostelName,Hostelcapacity);
        this.roomNumber = roomNumber;
        this.rental = rental;
        this.type = type;
        this.capacity = capacity;   
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    //write data to file
    @Override
    public void WriteToFile(String filename){
        WriteAndReadFile data = new WriteAndReadFile(filename);
        data.write(roomInfo);
    }
    
    //read data from file
    @Override
    public void ReadFromFile(String filename){
        WriteAndReadFile data = new WriteAndReadFile(filename);
        data.read(roomInfo);  
    }
    
    //check if the room exist. Save the data if exist.
    public boolean checkRoom(String roomNumber){
        boolean match = false;
        for(int i=0;i<roomInfo.size();i+=5){
            if(roomInfo.get(i).equals(roomNumber)){
                this.roomNumber = (String) roomInfo.get(i);
                rental = (double) roomInfo.get(i+1);
                type = (String) roomInfo.get(i+2);
                capacity = (int) roomInfo.get(i+3);
                super.setHostelID((String) roomInfo.get(i+4));

                num = i;
                match = true;   //room exist
            }  
        }
        return match;   //room not found
    }
    
    //search room information 
    @Override
    public void search(String roomNumber){
        for(int i=0;i<roomInfo.size();i+=5){
            if(roomInfo.get(i).equals(roomNumber)){     //compare room ID
                this.roomNumber = (String) roomInfo.get(i); //save data
                rental = (double) roomInfo.get(i+1);
                type = (String) roomInfo.get(i+2);
                capacity = (int) roomInfo.get(i+3);
                super.setHostelID((String) roomInfo.get(i+4));
                num = i;
            }  
        }       
    }
    
    //add room information
    @Override
    public void add() {
        roomInfo.add(roomNumber);   //add room number
        roomInfo.add(rental);   //add rental
        roomInfo.add(type);     //add room type
        roomInfo.add(capacity);     //add room capacity
        roomInfo.add(super.getHostelID());      //add hostel ID
    }
    
    //update room information
    @Override
    public void update(){
        roomInfo.set(num, roomNumber);
        roomInfo.set(num+1, rental);
        roomInfo.set(num+2, type);
        roomInfo.set(num+3,capacity);  
        roomInfo.set(num+4, super.getHostelID()); 
    } 
    
    //delete room information
    @Override
    public void delete(){
        roomInfo.remove(num);
        roomInfo.remove(num); // remove rental
        roomInfo.remove(num); // remove type
        roomInfo.remove(num); // remove capacity
        roomInfo.remove(num); // remove hostel ID
    }
    
    //view room information
    @Override
    public String view() {
        // Populate the HashSet with Hostel IDs from the roomInfo
        HashSet<String> storeHostelID = new HashSet<>();
        for (int i = 0; i < roomInfo.size(); i += 5){
            storeHostelID.add((String)roomInfo.get(i+4));
        }

        // Create a StringBuilder to build the output string
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------------------------\n")
            .append("                        Rooms in the Hostel\n")
            .append("----------------------------------------------------------------------\n");

        // Loop through the Hostel IDs and append the room information for each Hostel
        for(String id : storeHostelID){
            sb.append("\nHostel ID: "+ id +"\n\n");
            sb.append(String.format("%-15s %-15s %-15s %-15s\n", "Room Number", "Rental(RM)", "Type", "Capacity"));
            for (int i = 0; i < roomInfo.size(); i += 5) {
                if (id.equals(roomInfo.get(i+4))) {
                    sb.append(String.format("%-15s %-20.2f %-20s %-20d\n", roomInfo.get(i), (double)roomInfo.get(i+1), roomInfo.get(i+2), (int)roomInfo.get(i+3)));
                }
            } 
        }
        return sb.toString();
    }
    
    /*
    public void availability(){
        ReadFromFile("room.txt");
        List<Object> roomCapacity = new ArrayList<>();
        for(int i=0;i<roomInfo.size();i+=5){
            roomCapacity.add(roomInfo.get(i));
            roomCapacity.add(roomInfo.get(i+3));
        }
        System.out.println(roomCapacity);
 
    }*/
    
    
}