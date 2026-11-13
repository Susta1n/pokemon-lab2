package pokemons;

import moves.physical.*;
import moves.special.*;
import ru.ifmo.se.pokemon.*;

public final class Yanma extends Pokemon {

    public Yanma(String name, int level) {
        super(name, level);

        setStats(65, 65, 45, 75, 45, 95);
        setType(Type.BUG, Type.FLYING);

        addMove(new RazorLeaf());
        addMove(new Peck());
        addMove(new WaterGun());
    }
}