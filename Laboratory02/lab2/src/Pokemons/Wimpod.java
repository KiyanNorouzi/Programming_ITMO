package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Wimpod extends Pokemon {

	public Wimpod(String name, int level){
		super(name,level);
		setStats(25.00d, 35.00d, 40.00d, 20.00d, 30.00d, 80.00d);
		setType(Type.BUG);
		setMove(new Swagger(), new SandAttack(),new Facade());
	}

}