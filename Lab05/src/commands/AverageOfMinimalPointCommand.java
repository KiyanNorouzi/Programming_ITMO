package commands;

import java.util.ArrayDeque;
import java.util.Scanner;

import com.google.gson.Gson;

import data.LabWork;
import run.App;

public class AverageOfMinimalPointCommand {

	App app;
	Gson gson;	
	public Scanner myObj;
	
 
	public ArrayDeque<LabWork> labWorkArrayDeque;
 
	
	
   	public Integer GetMinimalPoint = 0;

   	AddCommand addCommand;
   	
	//public static int arraySize = 0;
	

	
	public AverageOfMinimalPointCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson,AddCommand _addCommand) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
		this.addCommand = _addCommand;
	}
	
	
	public void execute() {
		 
		try {
			GetMinimalPoint = addCommand.MinimalPointAverage;	    
		    System.out.println("average_of_minimal_point:" + GetMinimalPoint);
		    System.out.println("average of minimal point:" + GetMinimalPoint / labWorkArrayDeque.size() );
		}catch (Exception e) {
			 System.out.println("The list is null and the average_of_minimal_point operation is not executed");
		}
		

	     
	}
	
	
}
