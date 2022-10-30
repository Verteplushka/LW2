package pokemons;

import attacks.BodySlam;
import attacks.FlashCannon;
import attacks.IceBeam;
import attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Avalugg extends Pokemon {
    public Avalugg(String name, int level){
        super(name, level);
        setType(Type.ICE);
        setStats(95, 117, 184, 44, 46, 28);
        setMove(new Swagger(), new FlashCannon(), new IceBeam(), new BodySlam());
    }
}
