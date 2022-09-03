package run;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import commands.AddCommand;
import commands.AverageOfMinimalPointCommand;
import commands.ClearCommand;
import commands.CountGreaterThanAuthorCommand;
import commands.ExecuteScriptCommand;
import commands.HeadCommand;
import commands.InfoCommand;
import commands.PrintUniquePersonalQualitiesMaximumCommand;
import commands.RemoveFirstCommand;
import commands.RemoveHeadCommand;
import commands.RemoveIdCommand;
import commands.RuntimeCommand;
import commands.SaveCommand;
import commands.ShowCommand;
import commands.UpdateCommand;
import data.LabWork;
import data.Person;
import utilities.DispalyMenu;

public class App {
	
	public static String tst = "";
	   
	    public static void main(String[] args) throws IOException {
	    

	    	
			Gson gson = new Gson();
			ArrayList <LabWork> arrayList = new ArrayList<LabWork>();
			
			ArrayDeque<LabWork> labWorkArrayDeque = new ArrayDeque<LabWork>();
		
			
			Scanner myObj = new Scanner(System.in);
		
			
			
		    AddCommand addCommand = new AddCommand(myObj, labWorkArrayDeque, gson);
		    UpdateCommand updateCommand = new UpdateCommand(myObj, labWorkArrayDeque, gson);
		    
		    InfoCommand infoCommand = new InfoCommand(labWorkArrayDeque);
		    ClearCommand clearCommand = new ClearCommand(labWorkArrayDeque);
	    	RemoveIdCommand removeIdCommand = new RemoveIdCommand(labWorkArrayDeque,gson);
	    	ShowCommand showCommand = new ShowCommand(labWorkArrayDeque,gson);
	    	HeadCommand headCommand =  new HeadCommand(labWorkArrayDeque, gson);
	    	RemoveFirstCommand  removeFirstCommand = new RemoveFirstCommand(labWorkArrayDeque, gson);
	    	RemoveHeadCommand removeHeadCommand =  new RemoveHeadCommand(labWorkArrayDeque, gson);
	    	SaveCommand saveCommand = new SaveCommand(arrayList,labWorkArrayDeque, gson);
	    	ExecuteScriptCommand executeScriptCommand = new ExecuteScriptCommand(labWorkArrayDeque, gson);
	    	AverageOfMinimalPointCommand averageOfMinimalPointCommand = new AverageOfMinimalPointCommand(labWorkArrayDeque, gson,addCommand);
	    	PrintUniquePersonalQualitiesMaximumCommand printUniquePersonalQualitiesMaximumCommand =  new  PrintUniquePersonalQualitiesMaximumCommand(labWorkArrayDeque,gson,addCommand);
	    	CountGreaterThanAuthorCommand greaterThanAuthorCommand =  new CountGreaterThanAuthorCommand(labWorkArrayDeque, gson,addCommand);
	    	
	    	
	    	RuntimeCommand runtimeCommand = new RuntimeCommand( );
	    	
	    	
	    	
		   	System.out.println("**************** Welcome To Interactive Console****************");
	    	DispalyMenu.displayMenu();

					
	    	InteractiveMenu(arrayList,myObj,addCommand,updateCommand,  infoCommand,clearCommand,removeIdCommand,
	    			showCommand,headCommand,removeFirstCommand,removeHeadCommand,saveCommand,executeScriptCommand,
	    			averageOfMinimalPointCommand,printUniquePersonalQualitiesMaximumCommand,greaterThanAuthorCommand
	    			,runtimeCommand);
		   
	    }
	
	
	    public static void InteractiveMenu(ArrayList <LabWork> _arrayList,Scanner myObj,AddCommand _addCommand ,
	    		UpdateCommand _updateCommand,InfoCommand _command,
	    		ClearCommand _clearCommand,RemoveIdCommand _removeIdCommand,ShowCommand _showCommand ,HeadCommand _headCommand,
	    		RemoveFirstCommand  _removeFirstCommand,RemoveHeadCommand _removeHeadCommand,SaveCommand _saveCommand,
	    		ExecuteScriptCommand _executeScriptCommand,AverageOfMinimalPointCommand _averageOfMinimalPointCommand,
	    		PrintUniquePersonalQualitiesMaximumCommand _print_unique_personal_qualities_maximum,
	    		CountGreaterThanAuthorCommand _greaterThanAuthorCommand,
	    		RuntimeCommand _runtimeCommand
	    		
	    		) throws IOException {
		 	   String userCommand = "";
			   String[] finalUserCommand;
			   Scanner commandReader = new Scanner(System.in); 
			   
			   while (!userCommand.equals("exit")) {
	           	
	          	 userCommand = commandReader.nextLine();
		                finalUserCommand = userCommand.trim().split(" ", 2);
		            
		                    switch (finalUserCommand[0]) {
		                        case "": break;
		                        
		                        case "head":
		                        case "Head":	
		                        	_headCommand.execute();
		                            break;
		                            
		                        case "add":
		                        case "Add":
		                        	_addCommand.main(finalUserCommand);      
		                        	break;
		                        	
		                        case "show":
		                        case "Show":    	
		                            _showCommand.execute();
		                            break;
		                            
		                        case "clear":
		                        case "Clear":
		                        	_clearCommand.execute();
		                            break;
		                            
		                        case "info": 
		                        case "Info":	                        	
		                        	_command.execute();
		                            break;
		                            
		                        case "remove_head":
		                        	_removeHeadCommand.execute();
		                            break;
		                            
		                        case "remove":
		                        case "Remove":     	
		                        	_removeIdCommand.main(finalUserCommand);	
		                            break;
		                            
		                        case "remove_first":
		                        	_removeFirstCommand.execute();
		                            break;
		                            
		                        case "help":
		                        case "Help":          	
		                        	DispalyMenu.displayMenu();
		                            break;
		                            
		                        case "exit":
		                        case "Exit":
		                            //manager.save();	
		                            break;
		                            
		                        case "Save":
		                        case "save":
		                            _saveCommand.execute();
		                            break;
		                            
		                        case "execute":
		                        case "Execute":		                        	
		                        	_executeScriptCommand.main(finalUserCommand);	     	
		                        	
		                            break;
		                            
		                        case "update":
		                        case "Update":                	
		                        	_updateCommand.main(finalUserCommand);	
		                            break;
		                            
		                            
		                        case "average_of_minimal_point":                   	
		                        	_averageOfMinimalPointCommand.execute();							
		                            break;
		                            
		                        case "print_unique_personal_qualities_maximum":                   	
		                        	_print_unique_personal_qualities_maximum.execute();							
		                            break;
		                           
		                            
		                        case "count_greater_than_author":                   	
		                        	_greaterThanAuthorCommand.execute();							
		                            break;
		                            
		                        case "runtimeCommand":                   	
		                        	_runtimeCommand.main(finalUserCommand);							
		                            break;
		                                     
		                        default:
		                            System.out.println("Not valid command");
		                           
		                    }
		                    
                        	 
		                
		            }
	    	
	    }
	    
			
}
	           

		        

	            	
	    
	               	    	
		
	        

