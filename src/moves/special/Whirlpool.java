package moves.special;

import ru.ifmo.se.pokemon.*;

public final class Whirlpool extends SpecialMove {

    public Whirlpool() {
        super(Type.WATER, 35, 0.85);
    }

    @Override
    protected String describe() {
        return "использует Whirlpool";
    }
}
