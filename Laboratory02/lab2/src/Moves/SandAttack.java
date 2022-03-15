package Moves;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends SpecialMove{
	

	Effect e = new Effect();
	
	public SandAttack() {
		super(Type.GROUND, 0.00d, 100.00d);
	}
	
	protected void applyOpptEffects(Pokemon p) {
		p.setMod(Stat.ACCURACY, 1);
		Effect.confuse(p);
	}

}