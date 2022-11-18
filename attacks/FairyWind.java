package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FairyWind extends SpecialMove {
    public FairyWind(){
        super(Type.FAIRY, 40, 100);
    }

    @Override
    protected String describe(){
        return "использует FairyWind";
    }
}
