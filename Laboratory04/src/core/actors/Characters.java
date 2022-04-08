package core.actors;
import utility.Eatable;
import utility.Flight;
import utility.Holdable;
import utility.Shortmen;
import java.util.Objects;
import utility.WrongNameException;

public class Characters extends Shortmen {
    private  String name = "Shorties";
     
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) throws WrongNameException {
        if (name == "Shorties") {
            this.name = name;
            joinStory();
       } else {
           throw new WrongNameException("Wrong name of character");
       }
    }

    public Characters(String name) {
    	   super();
    }

    private void joinStory() {
        System.out.println(name + " join in story");
    }



    public void Holding(String _rope){
        System.out.println(name + " holding " + _rope);
    }
    
    public void Dragging(String _object , String _Resone){
        System.out.println(name + " dragging " + _object + "" + _Resone);
    }
    
  
    public void State(String _state , String _Resone){
        System.out.println(name + _state + " " + _Resone);
    }
    
    // non-static class (inner classes)
    public class Action {
    	
    	 public void Feed(String name,String food){
    		 Eatable action = new Eatable() {
    		 @Override
    		    public int hashCode() {
    		        return super.hashCode();
    		    }

    		    @Override
    		    public boolean equals(Object obj) {
    		        return super.equals(obj);
    		    }

    		    @Override
    		    public String toString() {
    		        return super.toString();
    		    }

    		    @Override
    		    public void eat(String _name,String _food) {
    		        System.out.println(_name + " eats " + _food);
    		    }
    		 
    		 };
    		 action.eat(name,food);
    	 }
    
    	 public void Flying(String name,String destenation){
    		 Flight action = new Flight() {
    		    @Override
    		    public int hashCode() {
    		        return super.hashCode();
    		    }

    		    @Override
    		    public boolean equals(Object obj) {
    		        return super.equals(obj);
    		    }

    		    @Override
    		    public String toString() {
    		        return super.toString();
    		    }

    		 

    			@Override
    			public void fly(String _name, String _destenation) {
    				   System.out.println(_name + " is flying to " + _destenation);
    				
    			}
    	 };
    	 action.fly(name,destenation);
    }
    	 
    	 public void Holding(String name,String obj){
             // Declare local class --  Anonymous
    		 Holdable action = new Holdable() {
    			 
    			 @Override
    			    public int hashCode() {
    			        return super.hashCode();
    			    }

    			    @Override
    			    public boolean equals(Object obj) {
    			        return super.equals(obj);
    			    }

    			    @Override
    			    public String toString() {
    			        return super.toString();
    			    }


    				@Override
    				public void hold(String _name,String _obj) {
    					System.out.println( _name + " holds " + _obj);
    					
    				}
    				
    				@Override
    				public void tied(String _name,String _obj) {
    					System.out.println( _name + " tied himself to " + _obj);
    					
    				}
    		 };
    		 action.hold(name, obj);
    		
             }
    	 
    	 public void Tied(String name,String obj){
             // Declare local class --  Anonymous
    		 Holdable action = new Holdable() {
    			 
    			 @Override
    			    public int hashCode() {
    			        return super.hashCode();
    			    }

    			    @Override
    			    public boolean equals(Object obj) {
    			        return super.equals(obj);
    			    }

    			    @Override
    			    public String toString() {
    			        return super.toString();
    			    }

    				
    				@Override
    				public void tied(String _name,String _obj) {
    					System.out.println( _name + " tied himself to " + _obj);
    					
    				}

					@Override
					public void hold(String name, String _obj) {
						// TODO Auto-generated method stub
						
					}
    		 };
    		 action.tied(name, obj);
    		
             }
    	 
    	 
    	 
             
            }
    
    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Characters man = (Characters) object;
        return Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
