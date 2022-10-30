package pokemons;

import attacks.Facade;
import attacks.FairyWind;
import attacks.Moonblast;
import attacks.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Florges extends Pokemon {
    public Florges(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(78, 65, 68, 112, 154, 75);
        setMove(new Moonblast(), new Psychic(), new FairyWind(), new Facade());
    }
}
