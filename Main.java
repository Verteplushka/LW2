import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon avalugg = new Avalugg("Покемон 1", 1);
        Pokemon bergmite = new Bergmite("Покемон 2", 1);
        Pokemon flabebe = new Flabebe("Покемон 3", 1);
        Pokemon floette = new Floette("Покемон 4", 1);
        Pokemon florges = new Florges("Покемон 5", 1);
        Pokemon kangaskhan = new Kangaskhan("Покемон 6", 1);
        b.addAlly(avalugg);
        b.addAlly(bergmite);
        b.addAlly(flabebe);
        b.addFoe(floette);
        b.addFoe(florges);
        b.addFoe(kangaskhan);
        b.go();

    }
}