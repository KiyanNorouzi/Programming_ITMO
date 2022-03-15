package Moves;
import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove{
	

	public Waterfall() {
		super(Type.WATER, 80.00d, 100.00d);
	}
	
	 protected void applySelfEffects(Pokemon p) {
		if (Math.random() < 0.2){
		 p.setMod(Stat.EVASION, 1);
		}
	 
 }
}