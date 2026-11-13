package moves.status;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {

    public TailWhip() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "использует Tail Whip";
    }
}
