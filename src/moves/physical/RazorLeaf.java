package moves.physical;

import ru.ifmo.se.pokemon.*;

public final class RazorLeaf extends PhysicalMove {

    public RazorLeaf() {
        super(Type.GRASS, 55, 0.95);
    }

    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }
}