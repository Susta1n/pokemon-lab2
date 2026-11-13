package pokemons;

import ru.ifmo.se.pokemon.*;

public class Shroomish extends Pokemon {

    public Shroomish(String name, int level) {
        super(name, level);

        setStats(60, 40, 60, 40, 60, 35);
        setType(Type.GRASS);
    }
}