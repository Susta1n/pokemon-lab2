package moves.special;

import ru.ifmo.se.pokemon.*;

public final class WaterGun extends SpecialMove {

    public WaterGun() {
        super(Type.WATER, 40, 1);
    }

    @Override
    protected String describe() {
        return "использует Water Gun";
    }
}