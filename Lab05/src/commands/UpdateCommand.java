package commands;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;

import data.Color;
import data.Coordinates;
import data.Difficulty;
import data.LabWork;
import data.Location;
import data.Person;
import run.App;


public class UpdateCommand {
	
	App app;
	Gson gson;	
	public Scanner myObj;

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
	
	public UpdateCommand(Scanner _myObj,ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson  ) {
		
		this.myObj =  _myObj;
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
}
	
	 
	 
	 public void main(String args[ ])
	    {		
	    	
	        try {
		    	id = id + 1;
		    	
		        String string = args[1];
		        String[] parts = string.split(" ");
		        String IdNum = parts[0];  
		        String LabName = parts[1];  
		        String CordinatesX = parts[2]; 
		        String CordinatesY = parts[3]; 
		        String enterMinimalPoint = parts[4]; 	      
		        String personalQualitiesMaximum = parts[5]; 
		        String description = parts[6]; 
		        String difficulty = parts[7]; 	        
		        String authorName = parts[8]; 
		        String authorHeight = parts[9]; 
		        String authorEyeColor = parts[10]; 
		        String authorLocationX = parts[11]; 
		        String authorLocationY = parts[12]; 
		        String authorLocationZ = parts[13]; 
		        
		        
				Long _id = Long.parseLong(IdNum); 	
		  		String _labName = LabName;   		
		  		Long _CordinatesX = Long.parseLong(CordinatesX);
		  		Long _CordinatesY = Long.parseLong(CordinatesY);
		  	    final Coordinates _cordinates = new Coordinates(_CordinatesX, _CordinatesY); 	
		  	    
		  	    
		  	  
		  		 
				// Get current date time
				LocalDateTime currentDateTime = LocalDateTime.now();
				
				// Inbuilt format
				DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

				// Format LocalDateTime
				String formattedDateTime = currentDateTime.format(formatter);  
				
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
	    	
			    //LabWork labWork =  new LabWork(_id, _labName, _cordinates, formattedDateTime, _minimalPoint, _personalQualitiesMaximum, _description, _difficulty, _author);
			    //labWorkArrayList.add(labWork);
				//MinimalPointAverage +=LabWork.getMinimalPoint();
				 
			    //Numbers.add(labWork.getPersonalQualitiesMaximum());
			    //labWorkArrayDeque.add(labWork);

			    //app.arraySize = labWorkArrayDeque.size();
			  //  System.out.println(gson.toJson(labWorkArrayDeque));
			   // System.out.println("Size: " + gson.toJson(labWorkArrayDeque.size()));
		    
			    //MinimalPointAverage = MinimalPointAverage + labWork.getMinimalPoint();
			    //MinimalPointAverage = MinimalPointAverage + labWork.getMinimalPoint();
			    //MaximumValue = labWork.getPersonalQualitiesMaximum();

			    //myList.add(MaximumValue);
			    
			    
			    
			    
			    
		        for (Iterator iter = labWorkArrayDeque.iterator(); iter.hasNext();) {
		        	LabWork o = (LabWork)iter.next();
		            if (o.getId() == _id ) {
		                o.setName(_labName); 
		                o.setCoordinates(_cordinates);
		                o.setMinimalPoint(_minimalPoint);
		                o.setPersonalQualitiesMaximum(_personalQualitiesMaximum);
		                o.setDifficulty(_difficulty);
		                o.setDescription(_description);
		                o.setAuthor(person);
		                o.setCreationDate(formattedDateTime);     
		            }     
		            System.out.println(o.getId());     
		        }
		        
			    System.out.println(gson.toJson(labWorkArrayDeque));
			    
		
		        
	          } catch (Exception e) {
	 			 System.out.println("The list is null and the update operation is not executed");
	          } 
	        
		
	    }
	  	 
	 
}


	


