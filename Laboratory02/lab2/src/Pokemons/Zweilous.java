package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Zweilous extends Pokemon {
	
	public Zweilous(String name, int level){
		super(name,level);
		setStats(120.00d, 120.00d, 120.00d, 120.00d, 120.00d, 720.00d);
		setType(Type.DRAGON);
		setMove(new HyperVoice(), new Swagger(),new  DoubleHit());
	
	}


}
