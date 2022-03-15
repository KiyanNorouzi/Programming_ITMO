import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Warzone {
    public static void main(String[] args) {

        Arceus arceus = new Arceus("Arceus", 100);
        Wimpod wimpod = new Wimpod("Wimpod", 100);
        Golisopod golisopod = new Golisopod("Golisopod", 100);
        Deino deino = new Deino("Deino", 100);
        Zweilous zweilous = new Zweilous("Zweilous", 100);
        Hydreigon hydreigon = new Hydreigon("Hydreigon", 100);
        
        Battle b = new Battle();
        b.addAlly(arceus);
        b.addAlly(wimpod);
        b.addAlly(golisopod);
        b.addFoe(deino);
        b.addFoe(zweilous);
        b.addFoe(hydreigon);

        b.go();
    }
}
