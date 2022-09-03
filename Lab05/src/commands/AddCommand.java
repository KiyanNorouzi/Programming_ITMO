package commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import data.Color;
import data.Coordinates;
import data.Difficulty;
import data.LabWork;
import data.Location;
import data.Person;
import run.App;

public class AddCommand {
	
	App app;
	Gson gson;	
	public Scanner myObj;
	
  	int num = 0;
  	
	ArrayDeque<LabWork> labWorkArrayDeque = new ArrayDeque<LabWork>();
	
	public Long id = (long) 0;

	
    ArrayList<Long> Numbers= new ArrayList<Long>();
	
	//public ArrayList<LabWork> labWorkArrayList;
	public String dataStorage; 
	
	  
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	Date date = new Date(System.currentTimeMillis());

    
   	public Integer MinimalPointAverage = 0;
	public Long MaximumValue = (long) 0 ;
	
    // ArrayList of Numbers
    ArrayList<Long> myList = new ArrayList<Long>();  //new 

	//public Coordinates coordinates = new Coordinates(0, 0);
	public Person person;
	
	 long idNum = Long.valueOf(labWorkArrayDeque.size()); 

		
	 
	//////////////////
    public String LabNameSim = "";
    public String CordinatesXSim = "";
    public String CordinatesYSim  = "";
    public String enterMinimalPointSim = "";      
    public String personalQualitiesMaximumSim = ""; 
    public String descriptionSim  = "";
    public String difficultySim  = "";	        
    public String authorNameSim  = "";
    public String authorHeightSim  = "";
    public String authorEyeColorSim  = "";
    public String authorLocationXSim = ""; 
    public String authorLocationYSim = ""; 
    public String authorLocationZSim  = "";
    public String formattedDateTime = "";
    public String IdStr = "";
	///////////////////////
    
    
	public AddCommand(Scanner _myObj,ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson  ) {
			
			this.myObj =  _myObj;
			this.labWorkArrayDeque = _labWorkArrayDeque;
			this.gson = _gson;
	}
	 
	public void main(String args[ ])
	    {		
	    	
	        try {
		    	id = (long) idCounter() ;// id + 1;
		    	
		        String string = args[1];
		        String[] parts = string.split(" ");
		        
		        String LabName = parts[0];  
		        String CordinatesX = parts[1]; 
		        String CordinatesY = parts[2]; 
		        String enterMinimalPoint = parts[3]; 	      
		        String personalQualitiesMaximum = parts[4]; 
		        String description = parts[5]; 
		        String difficulty = parts[6]; 	        
		        String authorName = parts[7]; 
		        String authorHeight = parts[8]; 
		        String authorEyeColor = parts[9]; 
		        String authorLocationX = parts[10]; 
		        String authorLocationY = parts[11]; 
		        String authorLocationZ = parts[12]; 
		        
		        
		        
		         IdStr = String.valueOf(id);
		         LabNameSim = LabName;
		         CordinatesXSim = CordinatesX;
		         CordinatesYSim  = CordinatesY;
		         enterMinimalPointSim = enterMinimalPoint;      
		         personalQualitiesMaximumSim = personalQualitiesMaximum; 
		         descriptionSim  = description;
		         difficultySim  = difficulty;	        
		         authorNameSim  = authorName;
		         authorHeightSim  = authorHeight;
		         authorEyeColorSim  = authorEyeColor;
		         authorLocationXSim = authorLocationX; 
		         authorLocationYSim = authorLocationY; 
		         authorLocationZSim  = authorLocationZ;
		        
				//Long _id = Long.parseLong(IdNum); 	
		  		String _labName = LabName;   		
		  		Long _CordinatesX = Long.parseLong(CordinatesX);
		  		Long _CordinatesY = Long.parseLong(CordinatesY);
		  	    final Coordinates _cordinates = new Coordinates(_CordinatesX, _CordinatesY); 	
		  	    
		  	    
		  	  
		  		 
				// Get current date time
				LocalDateTime currentDateTime = LocalDateTime.now();
				
				// Inbuilt format
				DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

				// Format LocalDateTime
				 formattedDateTime = currentDateTime.format(formatter);  
				
	    		Integer _minimalPoint = Integer.parseInt(enterMinimalPoint);	
	    		Long _personalQualitiesMaximum = Long.parseLong(personalQualitiesMaximum);   		
	    		String _description = description; 
			    Difficulty _difficulty =  Difficulty.valueOf(difficulty);
			    Color _eyeColor = Color.valueOf(authorEyeColor);  
			    double _x = Double.parseDouble(authorLocationX);
			    Long _y  = Long.parseLong(authorLocationY);
			    Integer _z = Integer.parseInt(authorLocationZ); 
			    Location _location = new Location(_x,_y,_z); 
	    		Person _author = new Person(authorName, authorHeight, _eyeColor, _location);
	    	
			    LabWork labWork =  new LabWork(id, _labName, _cordinates, formattedDateTime, _minimalPoint, _personalQualitiesMaximum, _description, _difficulty, _author);

			    //labWorkArrayList.add(labWork);
				//MinimalPointAverage +=LabWork.getMinimalPoint();
				 
			    Numbers.add(labWork.getPersonalQualitiesMaximum());
			    labWorkArrayDeque.add(labWork);

			    //app.arraySize = labWorkArrayDeque.size();
			    System.out.println(gson.toJson(labWorkArrayDeque));
			    System.out.println("Size: " + gson.toJson(labWorkArrayDeque.size()));
		    
			    //MinimalPointAverage = MinimalPointAverage + labWork.getMinimalPoint();
			    MinimalPointAverage = MinimalPointAverage + labWork.getMinimalPoint();
			    MaximumValue = labWork.getPersonalQualitiesMaximum();

			    myList.add(MaximumValue);
		
		        
	          } catch (Exception e) {
	            System.out.println("Something is null");
	          } 
	        
	        
	        
	        
	        
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
			

	    		
	        List<String[]> csvData = createCsvDataSimple(
	        		 IdStr,
	        		 LabNameSim ,
	    		     CordinatesXSim ,
			         CordinatesYSim ,
			         formattedDateTime,
			         enterMinimalPointSim , 	      
			         personalQualitiesMaximumSim  ,
			         descriptionSim,
			         difficultySim ,       
			         authorNameSim ,
			         authorHeightSim,
			         authorEyeColorSim ,
			         authorLocationXSim ,
			         authorLocationYSim ,
			         authorLocationZSim);
	        
	        try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Kane\\eclipse-workspace\\Lab05\\itmo.csv",true))) {
	            writer.writeAll(csvData);
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }

	private static List<String[]> createCsvDataSimple(
	    		String _ID,
	    		String _Name,
	    		String _CordinatesX,
	    		String _CordinatesY,
	    		String _CreationDate,
	    		String _MinimalPoint,
	    		String _PersonalQualitiesMaximum,
	    		String _Description,
	    		String _Difficulty,
	    		String _authorName,
	    		String _authorHeight,
	    		String _authorEyeColor, 
	    		String _authorLocationX ,  
	    		String _authorLocationY , 
	    		String _authorLocationZ) {
	        String[] record = {_ID, _Name, _CordinatesX,_CordinatesY, _CreationDate,_MinimalPoint,_PersonalQualitiesMaximum,_Description,_Difficulty,_authorName,_authorHeight,_authorEyeColor , _authorLocationX ,   _authorLocationY ,   _authorLocationZ};
	        List<String[]> list = new ArrayList<>();
	        list.add(record);
	        return list;
	    }
       
	private int idCounter() {
	    	String path = "/Users/Kane/eclipse-workspace/Lab05/itmo.csv";
	    	String line = "";
	 
	    	int num = 0 ;
	    	
	    	try {
	    		BufferedReader br =  new BufferedReader(new FileReader(path));
	    		while((line = br.readLine())!= null) {
	    			
	    			ArrayDeque<LabWork> labWorkArrayDeque = new ArrayDeque<LabWork>();
	 
	    			String[] val = line.split(",");

	    			System.out.print(" ID:" + val[0]);
	    			num ++ ;
	 
	    		}

	    		
	    	}catch (FileNotFoundException e) {
	    		e.printStackTrace();
			}
	    	
	    	catch(IOException e){
	    		e.printStackTrace();
	    	}
			
	 
	    	System.out.println("Testssss: " + num);
	    	
	    	
	    	return num;
	    	  
	    }
	    	    
}
