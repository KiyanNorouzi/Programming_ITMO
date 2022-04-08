package run;

import core.actors.Characters;
import core.actors.Characters.Action;
import core.actors.Environment;
import core.actors.RollPlayer;
import utility.CharState;
import utility.Eatable;
import utility.WrongInstanceException;
import utility.WrongNameException;

public class Story {
    public static void main(String[] args) {
   
    	try {
    		RollPlayer Pilyulkin = new RollPlayer("Pilyulkin");
    		Pilyulkin.went("bread", "jam");
    		
     	
     	} 	
    		catch (WrongNameException e) {
            e.printStackTrace();
        }
    	
    	
    	try {
    		RollPlayer Shpuntik = new RollPlayer("Shpuntik");
    		Shpuntik.went("end of the yard",CharState.Tied);
    		Shpuntik.shout("shorties");
     	
     	} 	
    		catch (WrongNameException e) {
            e.printStackTrace();
        }
    	
        try {
        	Characters character = new Characters("Shorties");
        	Environment environment = new Environment("weightlessness");
        	
        	
        	
        	Characters characters = new Characters(null);
            try {
            	characters.setName("Shorties");
            } catch (WrongNameException e) {
                e.printStackTrace();
            }
        	
       
        	
        	character.Holding("Rope");	
        	
        	environment.HomeArea(20,30);
        	environment.StateActivated();
        	
        	character.Dragging("Shpuntik ", "for preparing dinner. ");
        	character.State(" Working ", " for eating (Hunger) ");
        	
        	
        	RollPlayer screw = new RollPlayer("Screw");
        	RollPlayer donut = new RollPlayer("donut");   	
        	
     
        	
        	screw.stopWorking();
        	donut.stopWorking();
        	
        	
            try {
            	screw.hanging("roof");
            	donut.hanging("roof");
            } catch (WrongInstanceException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
       
        	
  
        	
        	RollPlayer znayka = new RollPlayer("znayka");
        	RollPlayer ponchik =  new RollPlayer("ponchik");
        	znayka.LostOrientatopnOfCharacter();  //Using static classes
        	ponchik.LostOrientatopnOfCharacter(); //Using static classes 
        	donut.AddaptedStateOfCharacter();  //Using static classes
        	
        	
        	donut.flying("room");
        	
         	Action eat = characters.new Action();
        	eat.Feed("donut", "semolina");
        	eat.Feed("donut", "porridge");
        	 
        	Action hold = characters.new Action();
        	hold.Holding("znayka", "rope");
        	
        	Action fly = characters.new Action();
        	fly.Flying("znayka", "gravity zone");
        	
        	Action tied = characters.new Action();
        	tied.Tied("znayka", "rope");
         
        	

        } catch (Exception e) {
            System.out.println("It doesn't variable");
        }
    }
}



