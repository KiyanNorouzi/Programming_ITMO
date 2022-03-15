package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Deino extends Pokemon {
	
	public Deino(String name, int level){
		super(name,level);
		setStats(52.00d, 65.00d, 50.00d, 45.00d, 50.00d, 38.00d);
		setType(Type.DARK);
		setMove(new HyperVoice(), new Swagger());
	}

}