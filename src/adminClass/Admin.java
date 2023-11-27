
package adminClass;

import java.util.ArrayList;
import java.util.List;
import studentBackend.FileHandling;


public class Admin extends User{
    //declare private variable
    private String adminID;
    private String adminPassword;
   
    //constructor
    public Admin(String username, String password, String adminID, String adminPassword){
        super(username,password);
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }
    
    //constructor
    public Admin(){}
    
    @Override
    //admin login function
    public boolean login(){
        //if admin input username and password equal to the default admin username and admin password, return true
        if(super.getUsername().equals(adminID) && super.getPassword().equals(adminPassword)){      
            return true;       
        }else{
            return false;          
        }  
    }
    
    
    //view student information
    public String accessStudentInfo(String studentID) {
        StringBuilder sb = new StringBuilder();     //create string builder to store data
        List<Object> reservationInfo = new ArrayList<>();   //craete object List 
        WriteAndReadFile data = new WriteAndReadFile("reservationData.txt");    
        data.read(reservationInfo);     //read data from file

        Permission p = new Permission();
        p.outstandingCalculate();   //call outstandingCalculate() method

        List<Object> outstanding = new ArrayList<>();
        WriteAndReadFile data2 = new WriteAndReadFile("outstanding.txt");
        data2.read(outstanding);    //read data from file

        FileHandling f = new FileHandling();
        ArrayList<String[]> registerInfo = f.convertData(f.readFile("studentData.txt"));

        //for loop to store student data into sb string builder
        for (int i = 0; i < reservationInfo.size(); i += 6) {
            if (studentID.equals(reservationInfo.get(i + 1))) {
                for (String[] str : registerInfo) {
                    if (studentID.equals(str[0])) {
                        sb.append("Name: ").append(reservationInfo.get(i));
                        sb.append("\nStudent ID: ").append(reservationInfo.get(i + 1));
                        sb.append("\nIC: ").append(reservationInfo.get(i + 2));
                        sb.append("\nEmail: ").append(reservationInfo.get(i + 3));
                        sb.append("\nPhone: ").append(reservationInfo.get(i + 4));
                        sb.append("\nRoom Type: ").append(reservationInfo.get(i + 5));
                        sb.append("\nGender: ").append(str[2]);

                        boolean hasOutstanding = false;
                        for (int j = 0; j < outstanding.size(); j += 3) {
                            if (studentID.equals(outstanding.get(j))) {     //if have outstanding, save the value
                                sb.append("\nOutstanding: ").append(outstanding.get(j + 2));
                                hasOutstanding = true;
                                break;
                            }
                        }
                        if (!hasOutstanding) {
                            sb.append("\nOutstanding: 0.00");   //if no outstanding, save RM0.00
                        }
                    }
                }
            }
        }
        return sb.toString();   //return sb
    }
    
    //check if the student ID exist
    public boolean checkStudentID(String id) {
        List<Object> student = new ArrayList<>();
        WriteAndReadFile w = new WriteAndReadFile("reservationData.txt");
        w.read(student);        //raed data from file
        for (int i = 0; i < student.size(); i += 6) {
            if (id.equals(student.get(i+1))) {
                return true; // Found the student ID
            }
        }
        return false; // Student ID not found
    }
    

    
}

   