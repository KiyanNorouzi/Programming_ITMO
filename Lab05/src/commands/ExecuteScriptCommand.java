package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.opencsv.CSVReader;

import data.LabWork;
import run.App;

public class ExecuteScriptCommand {
	
	
	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
	
    public String st  ;
  	int num = 0;
 
 
    
	public ExecuteScriptCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	
	
	 public void main(String args[ ]) throws IOException {
		
	        String string = args[1];
	        String[] parts = string.split(" ");
	        String fileName = parts[0];  
	        
	        
		       // File path is passed as parameter
	        File file = new File(
	            "C:\\Users\\Kane\\eclipse-workspace\\Lab05\\" + fileName);
	 
	 
	 
	        BufferedReader br
	            = new BufferedReader(new FileReader(file));
	 

	 
	        while ((st = br.readLine()) != null)
	        {
	        	
	            System.out.println(st);
	   	     
		     	if(st.contains("show")) {
		    		//_headCommand.execute();
		    		System.out.println("yes");
		    		execute();
		
		    	}
	        }
	 




	 
	 }
	 
	 
		public void execute() {
			
			try {
			    System.out.println(gson.toJson(labWorkArrayDeque));
			}
			catch (Exception e) {
				 System.out.println("there is no something to show");
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
			

		}
		
	
 
 	
	}

 


