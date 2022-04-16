package core.actors;
import utility.Shortmen;
import java.util.Objects;

public class Characters extends Shortmen {
    private String name;

    public Characters(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " join in story");
    }

    @Override
    public String getName() {
        return name;
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
