package commands;

import java.util.ArrayDeque;
import java.util.ArrayList;

import data.LabWork;
import data.Person;

public class InfoCommand {

	//ArrayList <LabWork> personArrayList;
	ArrayDeque<LabWork> labWorkArrayDeque = new ArrayDeque<LabWork>();
	
	public String dataStorage; 

	
	
		public InfoCommand(ArrayDeque<LabWork> _labWorkArrayDeque) {
			this.labWorkArrayDeque = _labWorkArrayDeque;
		}
	
		
		public void execute() {
			
		try {
   	 		System.out.println("Date of object creation is : " + labWorkArrayDeque.getFirst().getCreationDate());
   	 		
   	 		
   	 		System.out.println("collection has " + labWorkArrayDeque.size()  + " member");
   	 		Class<?> clazz = labWorkArrayDeque.getClass();
   	 		System.out.println("clazz = " + clazz);
			 }
			 catch (Exception e) {
				 System.out.println("there is no information");
			}
		}
	
}
