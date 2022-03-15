package Moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove{
	

	public DreamEater() {
		super(Type.PSYCHIC, 100.00d, 100.00d);
	}
	
	protected void applyOppEffects(Pokemon p) {
		Effect.confuse(p);
	}
}