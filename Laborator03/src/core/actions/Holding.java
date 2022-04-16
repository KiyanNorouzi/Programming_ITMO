package core.actions;

import utility.Holdable;

public class Holding implements Holdable {

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


}
