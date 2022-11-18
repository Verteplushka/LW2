package pokemons;

import attacks.BodySlam;

public class Avalugg extends Bergmite {
    public Avalugg(String name, int level){
        super(name, level);
        setStats(95, 117, 184, 44, 46, 28);
        addMove(new BodySlam());
    }
}
