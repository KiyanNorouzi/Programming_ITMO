package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.google.gson.Gson;

import data.LabWork;

public class ClearCommand {
	
 
	public ArrayDeque<LabWork> labWorkArrayDeque;
 

	
	public ClearCommand(ArrayDeque<LabWork> _labWorkArrayDeque) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
	}
	
	public void execute() {
		
		
		try {
			// using clear() method
			labWorkArrayDeque.clear();
	 
	        // Displaying ArrayList elements
	        // after using clear() method
	        System.out.println(
	            "The list after using clear() method: " + labWorkArrayDeque);
		}catch (Exception e) {
			 System.out.println("List is Null and Clear operation not possible");
		}

	}

}
