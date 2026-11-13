package pokemons;

import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public final class Breloom extends Shroomish {

    public Breloom(String name, int level) {
        super(name, level);

        setStats(60, 130, 80, 60, 60, 70);
        setType(Type.GRASS, Type.FIGHTING);

        addMove(new Overheat());
        addMove(new Rest());
        addMove(new Twister());
    }
}