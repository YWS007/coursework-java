
package adminClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WriteAndReadFile {
    //declare private variable
    private java.io.File file;
  
    //constructor
    public WriteAndReadFile(String filename){
        this.file = new java.io.File(filename);
    }

    //write data into txt file
    public void write(List<Object> data) {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter w = new BufferedWriter(fileWriter)) {
            //iterate over each object in the data list
            for(Object obj : data){
                if (obj != null) {
                    w.write(obj.toString());    //write the string representation of the object
                    w.newLine();    //move to the next line
                }   
            }
        } catch (IOException e) {
            e.printStackTrace();    //print the stack trace if an exception occurs
        }
    }

   
    //read data from txt file
    public void read(List<Object> obj) {
        ArrayList<String> data = new ArrayList<>(); // ArrayList to store the read lines
        try {
            BufferedReader r = new BufferedReader(new FileReader(file));    // Open the file for reading
            String line;
            while ((line = r.readLine()) != null) { // Read each line of the file
                if (!line.trim().isEmpty()) { // Skip empty lines
                    data.add(line); // Add the non-empty line to the data list
                }
            }
            r.close();  // Close the BufferedReader
        } catch (IOException e) {   
            e.printStackTrace();    // Print the stack trace if an exception occurs
            return; // Exit the method if an exception occurs
        }
        convertToObject(data, obj); // Convert the read lines to objects
    }


    //convert object List to String type
    public void convertToObject(List<String> data,List<Object> obj){
        obj.clear();    // Clear the existing objects in the obj list
        ArrayList<String> infoOnly = new ArrayList<>(); // ArrayList to store the cleaned lines
        infoOnly = removeTitle(data);   // Remove any titles or headers from the data list
        for (int j=0;j<infoOnly.size();j++) {   // Iterate over each line
            String temp = infoOnly.get(j);  // Get the current line
            if(temp.matches("-?\\d+(\\.\\d+)?")){
                //value is a number
                if(temp.contains(".")){
                    obj.add(Double.valueOf(temp));  // Convert to Double and add to the obj list
                } else {
                    obj.add(Integer.valueOf(temp)); // Convert to Integer and add to the obj list
                }    
            } else{
                //value is a String
                obj.add(temp);  // Add the String value to the obj list
            }
        }
    }
    
    
    //remove the title in txt file
    public ArrayList<String> removeTitle(List<String> data) {
        ArrayList<String> infoOnly = new ArrayList<>(); // ArrayList to store the cleaned lines
        for (String line : data) { // Iterate over each line in the data list
            int colonIndex = line.indexOf(":"); // Find the index of the first colon character
            if (colonIndex != -1 && colonIndex < line.length() - 1) {
                // If a colon is found and it's not the last character
                String value = line.substring(colonIndex + 1).trim(); // Extract the value after the colon
                infoOnly.add(value); // Add the trimmed value to the infoOnly list
            } else {
                // If no colon is found or it's the last character
                infoOnly.add(line); // Add the entire line as is to the infoOnly list
            }
        }
        return infoOnly; // Return the cleaned lines
    }

    

}
    




    