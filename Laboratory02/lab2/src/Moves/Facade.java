package Moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
	

	public Facade(){
		super(Type.NORMAL, 70.00d, 100.00d);
		describe();
	}

	 
	protected void applyOppEffects(Pokemon p, double damage) {
		Status PokCon = p.getCondition();
	       if (PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) || PokCon.equals(Status.PARALYZE)) {
	            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
	        }

	}

	
}


