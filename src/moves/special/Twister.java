package moves.special;

import ru.ifmo.se.pokemon.*;

public final class Twister extends SpecialMove {

    public Twister() {
        super(Type.DRAGON, 40, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Twister";
    }
}