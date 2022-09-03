package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.google.gson.Gson;

import data.LabWork;

public class RemoveHeadCommand {
	
	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
	
	public RemoveHeadCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	
	
	public void execute() {
		
		try {
			LabWork first = labWorkArrayDeque.getFirst();
		    System.out.println(gson.toJson(first));
		    labWorkArrayDeque.removeFirst();
		    System.out.println("After: " + gson.toJson(labWorkArrayDeque));
		}catch (Exception e) {
			 System.out.println("List is Null and remove_head operation not possible");
		}

	}
}
