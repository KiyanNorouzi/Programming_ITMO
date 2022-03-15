package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Hydreigon extends Pokemon {
	
	public Hydreigon(String name, int level){
		super(name,level);
		setStats(92.00d, 105.00d, 90.00d, 125.00d, 90.00d, 98.00d);
		setType(Type.DRAGON);
		setMove(new  HyperVoice(), new Swagger(),new DoubleHit(),new Crunch());
	}

}
