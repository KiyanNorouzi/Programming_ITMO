package commands;

import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.google.gson.Gson;
import com.opencsv.CSVReader;

import data.LabWork;

public class ShowCommand {

	//public ArrayList<LabWork> labWorkArrayList;
	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
  	int num = 0;
	public ShowCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
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
