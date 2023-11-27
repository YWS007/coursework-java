package studentBackend;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileHandling {
    
    public ArrayList<String> readFile(String file){ //read the contents of a file into an ArrayList
        
        ArrayList<String> fileData = new ArrayList<String>(); //create an empty array list object that will store strings
        
        try{
            
            File obj = new File(file); // create an object of the class 
            Scanner reader = new Scanner(obj); //use the Scanner class to read the contents of the text file
            
            while(reader.hasNextLine()){ //used to check if there is another line in the input of this scanner
                String data = reader.nextLine(); //used to read Strings line by line
                fileData.add(data); //to add elements to the ArrayList
            }
            
            reader.close();
            
            return fileData;
        
        }catch (FileNotFoundException e){
            e.printStackTrace();  //pinpoint the exact line in which the method raised the exception
            
            return null;
        }
    }
    
    public void writeFile(String file,String data){
        try{
            FileWriter obj = new FileWriter(file,true); //Constructs a FileWriter object given a File object.
            obj.write(data);
            obj.write("\n");
            obj.close();
        
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<String[]> convertData(ArrayList<String> data){
        
        ArrayList<String[]> convertedData = new ArrayList<String[]>();
        
        for(String str:data){
            convertedData.add(str.split("\\s+"));
        }
        
        return convertedData;
    }
    
    public void removeData(String file,String id){
        ArrayList<String[]> data = this.convertData(this.readFile(file));
        
        for(int i=0;i<data.size();i++){
            if(data.get(i)[0].equals(id)){
                data.remove(i);
            }
        }
        
        try{
            FileWriter obj = new FileWriter(file,false);
            obj.write("");
            obj.close();
        
        }catch (IOException e){
            e.printStackTrace();
        }
        
        try{
            FileWriter obj = new FileWriter(file,true);
            
            for(int i=0;i<data.size();i++){
                String newString = data.get(i)[0];
                
                for(int j=1;j<data.get(i).length;j++){
                    newString = newString +" "+ data.get(i)[j];
                }
                
                obj.write(newString);
                obj.write("\n");
            }
            
            obj.close();
        
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    
}
