package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Arceus extends Pokemon {

	public Arceus(String name, int level){
		super(name,level);
		setStats(120.00d, 120.00d, 120.00d, 120.00d, 120.00d, 720.00d);
		setType(Type.NORMAL);
		setMove(new Bulldoze(), new ShadowBall(),new Waterfall(),new DreamEater());
	}

}


