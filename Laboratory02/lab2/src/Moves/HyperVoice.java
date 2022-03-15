package Moves;
import ru.ifmo.se.pokemon.*;

public class HyperVoice extends SpecialMove{
	

	public HyperVoice(){
		super(Type.NORMAL, 90.00d, 100.00d);
		describe();
	}

	 
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.SPEED, -1);
	}


}