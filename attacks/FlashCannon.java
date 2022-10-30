package attacks;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    public FlashCannon(){
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует FlashCannon";
    }

}
