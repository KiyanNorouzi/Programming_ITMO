package Moves;
import ru.ifmo.se.pokemon.*;


public class Venoshock extends SpecialMove{
	

	Effect e = new Effect();
	
	public Venoshock() {
		super(Type.POISON, 65.00d, 100.00d);
	}
	
	protected void applyOpptEffects(Pokemon p) {
		p.setMod(Stat.ATTACK, 2);
		Effect.confuse(p);
	}

}
