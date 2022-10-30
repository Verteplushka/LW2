package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if(pokemon.getCondition() == Status.BURN | pokemon.getCondition() == Status.PARALYZE | pokemon.getCondition() == Status.POISON){
            this.power*=2;
        }
    }

    @Override
    protected String describe(){
        return "использует Facade";
    }
}
