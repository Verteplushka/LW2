package attacks;

import ru.ifmo.se.pokemon.*;

public class CrushClaw extends PhysicalMove {
    public CrushClaw(){
        super(Type.NORMAL, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect =  new Effect().chance(0.5).stat(Stat.DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует CrushClaw";
    }
}
