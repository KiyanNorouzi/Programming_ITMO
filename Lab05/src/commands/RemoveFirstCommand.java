package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.google.gson.Gson;

import data.LabWork;

public class RemoveFirstCommand {
	
	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
	
	public RemoveFirstCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	
	
	public void execute() {
		 
		
		try {
		    labWorkArrayDeque.removeFirst();
		    System.out.println("After: " + gson.toJson(labWorkArrayDeque));	
		}catch (Exception e) {
			 System.out.println("The list is null and the remove_first operation is not executed");
		}
		

	}
}
