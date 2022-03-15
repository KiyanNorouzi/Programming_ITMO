package core.sources;
import utility.Adaption;

public class OrientationState implements Adaption {

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
    public void LostOrientaton(String name) {
        System.out.println(name + " Lost his orientaton");
    }
    
    
    @Override
    public void AdaptedOrientaton(String name) {
        System.out.println(name + " Adapted in space. ");
    }
    
    
	
}
