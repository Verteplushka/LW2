package pokemons;

import attacks.Bite;
import attacks.CrushClaw;
import attacks.FocusBlast;
import attacks.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kangaskhan extends Pokemon {
    public Kangaskhan (String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(105,95,80,40, 80, 90);
        setMove(new FocusBlast(), new TailWhip(), new CrushClaw(), new Bite());
    }
}
