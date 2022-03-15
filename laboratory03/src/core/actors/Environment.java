package core.actors;

public class Environment {
	
    private String state;
    
    public Environment(String _state) {
        this.state = _state;
        DefaultState();
        
    }
    
    
    
    private void DefaultState() {
        System.out.println(state + " Inactive");
    }
    
    
    public void HomeArea(int _min, int _max){
        System.out.println(state + " mode at a distance of "+ _min + " to " + _max + " steps has been set.");
         
    }
    
    public void StateActivated() {
        System.out.println(state + " Activated");
    }

}
