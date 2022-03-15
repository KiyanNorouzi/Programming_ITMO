package Moves;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
	

	public Bulldoze(){
		super(Type.GROUND, 60.00d, 100.00d);
		describe();
	}

	 
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.SPEED, -1);
	}


}