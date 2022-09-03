package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import data.LabWork;
import run.App;

public class CountGreaterThanAuthorCommand {
	
	App app;
	Gson gson;	
	public Scanner myObj;
	
 
	public ArrayDeque<LabWork> labWorkArrayDeque;
 
	
	
   	public ArrayList<Long> GetMax;

   	AddCommand addCommand;
   	
   	
   	public CountGreaterThanAuthorCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson,AddCommand _addCommand) {
		// TODO Auto-generated constructor stub
   		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
		this.addCommand = _addCommand;
	}
   	
	public void execute() {
		
		
		try {
			 GetMax = addCommand.myList;
				
			 
		        Long maximum = GetMax.get(0);
		        for (int i = 1; i < GetMax.size(); i++) {
		            if (maximum < GetMax.get(i))
		                maximum = GetMax.get(i);
		        }
		        System.out.println("Maximum Element in ArrayList = "
		                           + maximum);
		}
		catch (Exception e) {
			 System.out.println("The list is null and the count_greater_than_author operation is not executed");
		}

		 
 
		  

	}
	

}
