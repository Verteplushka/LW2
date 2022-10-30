package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        pokemon.addEffect(effect);
        pokemon.confuse();
    }

    @Override
    protected String describe(){
        return "использует Swagger";
    }
}
