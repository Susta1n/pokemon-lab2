package moves.physical;

import ru.ifmo.se.pokemon.*;

public final class Peck extends PhysicalMove {

    public Peck() {
        super(Type.FLYING, 35, 1);
    }

    @Override
    protected String describe() {
        return "использует Peck";
    }
}