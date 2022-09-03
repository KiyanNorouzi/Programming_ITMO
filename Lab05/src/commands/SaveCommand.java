package commands;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import data.Color;
import data.Coordinates;
import data.Difficulty;
import data.LabWork;
import data.Person;

public class SaveCommand {
	
	public ArrayList<LabWork> labWorkArrayList;
	Gson gson;	
	
	public ArrayDeque<LabWork> labWorkArrayDeque;
	
  	int num = 0;
  	LabWork first;

	
  	static String ID ="";
  	static String Name ="";
  	static String Coordinates ="";
  	static String CreationDate ="";
  	static String MinimalPoint ="";
  	static String PersonalQualitiesMaximum ="";
  	static String Description ="";
  	static String Difficulty ="";
  	
  	static String authorName = ""; 
  	static String authorHeight = "";
  	static String authorEyeColor = "";
  	static String authorLocationX = "";
  	static String authorLocationY = "";
  	static String authorLocationZ = "";
  	
  	
  	
  	
	public SaveCommand(ArrayList <LabWork> _labWorkArrayList,ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayList = _labWorkArrayList;
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	

	
	public void execute() throws IOException {
		
		try {
			first = labWorkArrayDeque.getFirst();
			 
		    System.out.println(gson.toJson(first.getId()));
		    System.out.println(gson.toJson(first.getName()));
		    System.out.println(gson.toJson(first.getDescription()));
		    System.out.println(gson.toJson(first.getDifficulty()));
		    System.out.println(gson.toJson(first.getMinimalPoint()));
		    System.out.println(gson.toJson(first.getPersonalQualitiesMaximum()));
		    System.out.println(gson.toJson(first.getCoordinates()));
		    System.out.println(gson.toJson(first.getCreationDate()));
		    
		   
		    ID = gson.toJson(first.getId());
		  	Name = gson.toJson(first.getName());
		  	Coordinates = gson.toJson(first.getCoordinates());
		  	CreationDate = gson.toJson(first.getCreationDate());
		  	MinimalPoint = gson.toJson(first.getMinimalPoint());
		  	PersonalQualitiesMaximum = gson.toJson(first.getPersonalQualitiesMaximum());
		  	Description = gson.toJson(first.getDescription());
		  	Difficulty = gson.toJson(first.getDifficulty());
		  	
		  	authorName = gson.toJson( first.getAuthor());
		  	

		  	
	    	try {
	    		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Kane\\eclipse-workspace\\Lab05\\itmo.csv"));
	    		String[] nextLine ;
	    		while((nextLine = reader.readNext()) != null)
	    		{
	    			if(nextLine!= null) {
	    				System.out.println(Arrays.toString(nextLine)); 
	    				num = (int) reader.getLinesRead();
	    				

	    			}
	    		}
	    	}catch (Exception e) {
				// TODO: handle exception
	    		System.out.println(e);
			}
			
	    		
	        List<String[]> csvData = createCsvDataSimple();
	        
	        try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Kane\\eclipse-workspace\\Lab05\\itmo.csv",true))) {
	            writer.writeAll(csvData);
	        }
		    
			
		}
		catch (Exception e) {
			 System.out.println("The list is null and the save operation is not executed");
		}

       
	}
	
    private static List<String[]> createCsvDataSimple() {
        String[] record = {ID, Name, Coordinates, CreationDate,MinimalPoint,PersonalQualitiesMaximum,Description,Difficulty,authorName,authorHeight,authorEyeColor,authorName};
        List<String[]> list = new ArrayList<>();
        list.add(record);
        return list;
        
    }
	
}
