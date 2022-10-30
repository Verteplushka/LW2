package pokemons;

import attacks.FlashCannon;
import attacks.IceBeam;
import attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bergmite extends Pokemon {
    public Bergmite(String name, int level){
        super(name, level);
        setType(Type.ICE);
        setStats(55, 69, 85, 32, 35, 28);
        setMove(new Swagger(), new FlashCannon(), new IceBeam());
    }
}
