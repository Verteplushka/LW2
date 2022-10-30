package pokemons;

import attacks.FairyWind;
import attacks.Moonblast;
import attacks.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Floette extends Pokemon {
    public Floette(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(54, 45, 47, 75, 98, 52);
        setMove(new Moonblast(), new Psychic(), new FairyWind());
    }
}
