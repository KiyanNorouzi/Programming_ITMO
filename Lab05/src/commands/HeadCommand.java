package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.google.gson.Gson;

import data.LabWork;

public class HeadCommand {
	public ArrayDeque<LabWork> labWorkArrayDeque;
	Gson gson;	
	
	public HeadCommand(ArrayDeque<LabWork> _labWorkArrayDeque,Gson _gson) {
		
		this.labWorkArrayDeque = _labWorkArrayDeque;
		this.gson = _gson;
	}
	
	
	public void execute() {
		try {
			LabWork first = labWorkArrayDeque.getFirst();
		    System.out.println(gson.toJson(first));
		}catch (Exception e) {
			// TODO: handle exception
			 System.out.println("The list is null and the head operation is not executed");
		}

	}
}
