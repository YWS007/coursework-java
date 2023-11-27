
package adminClass;

import java.util.ArrayList;
import java.util.List;

// Implements the HostelManagement interface
public class Hostel implements HostelManagement{
    // Declare private calss variable
    private String hostelID, hostelName;
    private int capacity;
    
    //Declare normal class variable
    public List<Object> hostelInfo = new ArrayList<>();
    int count;
    
    //constructor
    public Hostel(){}
    
    //constructor
    public Hostel(String hostelID, String hostelName, int capacity){
        this.hostelID = hostelID;
        this.hostelName = hostelName;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHostelID() {
        return hostelID;
    }

    public void setHostelID(String hostelID) {
        this.hostelID = hostelID;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }
    
    //add hostel information
    @Override
    public void add(){  
        hostelInfo.add(hostelID);
        hostelInfo.add(hostelName);
        hostelInfo.add(capacity);
    }
    
    //update hostel information
    @Override
    public void update(){
        hostelInfo.set(count, hostelID);
        hostelInfo.set(count+1, hostelName);
        hostelInfo.set(count+2,capacity);     
    }
    
    //delete hostel information
    @Override
    public void delete(){
        hostelInfo.remove(count); // remove hostel ID
        hostelInfo.remove(count); // remove hostel name
        hostelInfo.remove(count); // remove capacity  
    }
    
    //search hostel information
    @Override
    public void search(String hostelID){
        for(int i=0;i<hostelInfo.size();i+=3){
            if(hostelInfo.get(i).equals(hostelID)){     //if the Hostel ID match, save data
                this.hostelID = (String) hostelInfo.get(i);
                hostelName = (String) hostelInfo.get(i+1);
                capacity = (int) hostelInfo.get(i+2);
                count = i;
            }  
        }       
    }
    
    //view hostel information
    @Override
    public String view(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hostelInfo.size(); i += 3) {
            sb.append(String.format("%-15s %-15s %-40d \n", hostelInfo.get(i), 
                    hostelInfo.get(i+1), (int)hostelInfo.get(i+2)));
        }
        return sb.toString(); 
    }
    
    //check if the Hostel ID exist
    public boolean checkHostel(String hostelID){
        boolean match = false;
        for(int i=0;i<hostelInfo.size();i+=3){
            if(hostelInfo.get(i).equals(hostelID)){
                this.hostelID = (String) hostelInfo.get(i);
                hostelName = (String) hostelInfo.get(i+1);
                capacity = (int) hostelInfo.get(i+2);
                count = i;
                match = true;   //ID found
                break;
            }  
        }
        // If no matching hostelID is found, return false
        return match;
    }
    
    //write data to text file
    public void WriteToFile(String filename){
        WriteAndReadFile data = new WriteAndReadFile(filename);
        data.write(hostelInfo);
    }
    
    //read data from text file
    public void ReadFromFile(String filename){
        WriteAndReadFile data = new WriteAndReadFile(filename);
        data.read(hostelInfo);  
    }

}
