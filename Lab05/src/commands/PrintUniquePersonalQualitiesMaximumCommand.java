package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import data.LabWork;
import run.App;

public class PrintUniquePersonalQualitiesMaximumCommand {

	
	App app;
	Gson gson;	
	public Scanner myObj;
	
 
	public ArrayDeque<LabWork> labWorkArrayDeque;
    ArrayList<Long> Numbers= new ArrayList<Long>();
   	AddCommand addCommand;
   	
	
	public PrintUniquePersonalQualitiesMaximumCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson,AddCommand _addCommand) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;	
		this.addCommand = _addCommand;
 
	}
	
	
	public void execute() {
		
		try {
		    List<Long> UniqueNumbers = addCommand.Numbers.stream().distinct().collect(Collectors.toList());  
	        System.out.println("Unique Values of ArrayList");
	  
	        // iterate through List
	        for (int i = 0; i < UniqueNumbers.size(); ++i) {
	            System.out.println(UniqueNumbers.get(i));
	        }
		}catch (Exception e) {
			 System.out.println("The list is null and the print_unique_personal_qualities_maximum operation is not executed");
		}
		

	}
	
	
}
