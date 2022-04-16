package core.actions;
import utility.Flight;

public class Flying implements Flight{

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
    
}


 