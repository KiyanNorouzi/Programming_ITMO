package Moves;
import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
	
	public Crunch() {
		super(Type.DARK, 80.00d, 100.00d);
	}
	
	 protected void applyOppEffects(Pokemon p) {
		 if (Math.random() < 0.2){
			 p.setMod(Stat.SPECIAL_DEFENSE, -1);
		 }
	 }
}
