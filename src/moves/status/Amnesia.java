package moves.status;

import ru.ifmo.se.pokemon.*;

public final class Amnesia extends StatusMove {

    public Amnesia() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, 2);
    }

    @Override
    protected String describe() {
        return "использует Amnesia";
    }
}