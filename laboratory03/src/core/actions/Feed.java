package core.actions;

import utility.Eatable;

public class Feed implements Eatable {
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

 

 
}
