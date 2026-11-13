package pokemons;

import moves.physical.*;
import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public final class Swellow extends Taillow {

    public Swellow(String name, int level) {
        super(name, level);

        setStats(60, 85, 60, 75, 50, 125);
        setType(Type.NORMAL, Type.FLYING);

        addMove(new FakeOut());
        addMove(new Swagger());
        addMove(new Whirlpool());
    }
}