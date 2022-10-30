package attacks;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect condition = new Effect().chance(0.1).condition(Status.FREEZE);
        pokemon.setCondition(condition);
    }

    @Override
    protected String describe(){
        return "использует IceBeam";
    }
}
