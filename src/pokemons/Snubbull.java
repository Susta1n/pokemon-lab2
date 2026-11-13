package pokemons;

import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public final class Snubbull extends Pokemon {

    public Snubbull(String name, int level) {
        super(name, level);

        setStats(60, 80, 50, 40, 40, 30);
        setType(Type.FAIRY);

        addMove(new Overheat());
        addMove(new Rest());
        addMove(new Twister());
        addMove(new Amnesia());
    }
}