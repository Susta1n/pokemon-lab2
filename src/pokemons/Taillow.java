package pokemons;

import ru.ifmo.se.pokemon.*;

public class Taillow extends Pokemon {

    public Taillow(String name, int level) {
        super(name, level);

        setStats(40, 55, 30, 30, 30, 85);
        setType(Type.NORMAL, Type.FLYING);
    }
}