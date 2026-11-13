package pokemons;

import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public final class Floatzel extends Buizel {
    public Floatzel(String name, int level) {
        super(name, level);

        setStats(85, 105, 55, 85, 50, 115);
        setType(Type.WATER);

        addMove(new Whirlpool());
        addMove(new Rest());
    }
}