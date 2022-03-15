package core.actors;
import core.actions.Holding;
import core.actions.Feed;
import core.actions.Flying;
import core.sources.OrientationState;
import utility.Flight;
import utility.Shortmen;


public class RollPlayer extends Shortmen {
    private  String name;

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
    
    public void stopWorking() {
    	System.out.println(name + " stop working");    	
    }
    
    public void hanging(String _from) {
    	System.out.println(name + " hangs from " + _from);    	
    }
    
    public void flying(String _where) {
    	System.out.println(name + " flying in " + _where);    	
    }
    
    
  public void LostOrientatopn() {
	   OrientationState orientationState =  new OrientationState();
	   orientationState.LostOrientaton(name);
  }
  
  public void Addapted() {
	   OrientationState orientationState =  new OrientationState();
	   orientationState.AdaptedOrientaton(name);
 }
   

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
    



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return name +" was a famous astronomer";
    }

    @Override
    public String getName() {
        return name;
    }
}
