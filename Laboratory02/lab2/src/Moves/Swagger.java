package Moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove{
	

	Effect e = new Effect();
	
	public Swagger() {
		super(Type.NORMAL, 0.00d, 85.00d);
	}
	
	protected void applyOpptEffects(Pokemon p) {
		p.setMod(Stat.ATTACK, 2);
		Effect.confuse(p);
	}

}