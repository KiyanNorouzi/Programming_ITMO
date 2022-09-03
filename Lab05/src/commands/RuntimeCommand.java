package commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import data.Color;
import data.LabWork;
import data.Location;
import run.App;

public class RuntimeCommand {

 
 
   	
    public static void main(String args[ ])
    {
 
    	String path = "/Users/Kane/eclipse-workspace/Lab05/itmo.csv";
    	String line = "";
 
    	int num = 0 ;
    	
    	try {
    		BufferedReader br =  new BufferedReader(new FileReader(path));
    		while((line = br.readLine())!= null) {
    			
    			ArrayDeque<LabWork> labWorkArrayDeque = new ArrayDeque<LabWork>();
 
    			String[] val = line.split(",");
    			/*
    			System.out.print(" ID:" + val[0] + ", Name:" + val[1] + ", CordinatesX: " + val[2] +
    					", CordinatesY: " + val[3] + ", CreationDate: " + val[4] + ", MinimalPoint: "+ val[5] + 
    					", Personal Qualities Maximum : " + val[6] + " , Description :" + val [7] + 
    					", Difficulty :" + val [8] + " , authorName" + val[9] + 
    					" , authorHeight: " + val [10] + ", authorEyeColor :" +val [11] + 
    					", author Location X: " + val[12] + ", author Location Y: " + val[13] + 
    					" , author Location Z: " + val [14]  ) ;
    			*/

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
    	  
    	
    	
   

   
  

    
	  

	
    }
 
	   
	   
}
