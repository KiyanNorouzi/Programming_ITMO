package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Golisopod extends Pokemon {
	
	public Golisopod(String name, int level){
		super(name,level);
		setStats(75.00d, 125.00d, 140.00d, 60.00d, 90.00d, 40.00d);
		setType(Type.BUG);
		setMove(new Swagger(), new SandAttack(),new Facade(),new Venoshock());
	}

}
