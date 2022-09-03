package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import data.LabWork;

public class RemoveIdCommand {
	
 
	public 	Scanner myObj = new Scanner(System.in);

	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
	
	public RemoveIdCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	

	 public void main(String args[ ]){
		 
	        try {
	        String string = args[1];
	        String[] parts = string.split(" ");
	        
	        String IdNumStr = parts[0];  
		 
			Long IdNum = Long.parseLong(IdNumStr);
			
			//labWorkArrayList.remove(new Long(IdNum));

			labWorkArrayDeque.removeIf(LabWork -> LabWork.getId() == IdNum);
			System.out.println(gson.toJson(labWorkArrayDeque));
	        }catch (Exception e) {
	         System.out.println("This ID is not valid or not supported");
	       } 
		    
	        
	 }

}
