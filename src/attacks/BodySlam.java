package attacks;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect condition = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.setCondition(condition);
    }

    @Override
    protected String describe(){
        return "использует BodySlam";
    }

}
