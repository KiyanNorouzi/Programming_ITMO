package Moves;
import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove{
	
	public DoubleHit() {
		super(Type.NORMAL, 35.00d, 90.00d);
	}
	
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.ATTACK, 2);
	}
}
