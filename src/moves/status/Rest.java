package moves.status;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.restore();
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}