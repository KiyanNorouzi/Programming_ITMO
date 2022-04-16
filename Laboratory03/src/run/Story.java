package run;

import core.actors.Characters;
import core.actors.Environment;
import core.actors.RollPlayer;

public class Story {
    public static void main(String[] args) {
        try {
        	
        	Characters character = new Characters("Shorties");
        	Environment environment = new Environment("weightlessness");
        	
        	character.Holding("Rope");	
        	
        	environment.HomeArea(20,30);
        	environment.StateActivated();
        	
        	character.Dragging("Shpuntik ", "for preparing dinner. ");
        	character.State(" Working ", " for eating (Hunger) ");
        	
        	
        	RollPlayer screw = new RollPlayer("Screw");
        	RollPlayer donut = new RollPlayer("donut");   	
        	screw.stopWorking();
        	donut.stopWorking();
        	screw.hanging("roof");
        	donut.hanging("roof");
        	
        	
        	
        	RollPlayer znayka = new RollPlayer("znayka");
        	RollPlayer ponchik =  new RollPlayer("ponchik");
        	znayka.LostOrientatopn();
        	ponchik.LostOrientatopn();
        	
        	donut.Addapted();
        	donut.flying("Room");
        	
        	donut.eatingFoods("semolina");
        	donut.eatingFoods("porridge");
        	
        	znayka.holdingSomething("rope");
        	znayka.Tied("rope");
        	znayka.Fly("gravity zone");
        	
        	
 
        } catch (Exception e) {
            System.out.println("It doesn't variable");
        }
    }
}



