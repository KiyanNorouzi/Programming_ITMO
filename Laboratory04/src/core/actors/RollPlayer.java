package core.actors;
import core.sources.OrientationState;
import utility.CharState;
import utility.Flight;
import utility.Shortmen;
import utility.WrongNameException;
import utility.WrongInstanceException;
 

public class RollPlayer extends Shortmen {
    private  String name;
     
    

    @Override
    public void setName(String name) throws WrongNameException {
        if (name == "Dunno") {
            this.name = name;
            joinStory();
        } else {
            throw new WrongNameException("Wrong name of man");
        }
    }
    
    
    public RollPlayer(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " join in story");
    }

    public void working() {
    	System.out.println(name + " start working");
    }
    
    public void went(String _toX , String _toY ) {
    	System.out.println(name + " went for " + _toX + " and " + _toY );
    }
    
    public void went(String _to ,CharState st ) {
    	System.out.println(name + " went to " + _to + " in mode of " + st + " to rope" );
    }
    
    public void shout(String _whome ) {
    	System.out.println(name + " shouted to " + _whome );
    }
    
    public void stopWorking() {
    	System.out.println(name + " stop working");    	
    }
    
    
    public void flying(String _where) {
    	System.out.println(name + " flying in " + _where);    	
    }
    
    
    
    // Use checked 
    public void hanging(String _from) throws WrongInstanceException{
        if (_from != null) {
            System.out.println(name + " hanging from " +  _from);
        } else {
            throw new WrongInstanceException("Screw and Donut should hanging from roof in this stage");
        }
    }


  
  // static inner class
  static class OrientatopnStatuseInSpace {
      private static void LostOrientatopnOfCharacter (String _name){
    	   OrientationState orientationState =  new OrientationState();
    	   orientationState.LostOrientaton(_name);
      }
      
      private static void AddaptedStateOfCharacter (String _name){
   	   OrientationState orientationState =  new OrientationState();
   	   orientationState.LostOrientaton(_name);
     }
	  
  }
  
  
//Using static classes
  public void LostOrientatopnOfCharacter(){
	  OrientatopnStatuseInSpace.LostOrientatopnOfCharacter(name);
  }

  public void AddaptedStateOfCharacter(){
	  OrientatopnStatuseInSpace.AddaptedStateOfCharacter(name);
  }
  
 

/*
 * 
 * Changes: Old functions
    public void eatingFoods(String _food){
 	
    	Feed action = new Feed();
    	action.eat(name, _food);
    }

    public void holdingSomething(String _obj){
       Holding action = new Holding();
       action.hold(name,_obj);
    }
    
    public void Tied(String _obj){
        Holding action = new Holding();
        action.tied(name,_obj);
     }
    
    public void Fly(String _destnation){
        Flying action = new Flying();
        action.fly(name,_destnation);
     }
    */

  
 

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return name +" is an ordinary shortiey";
    }

    @Override
    public String getName() {
        return name;
    }
}
