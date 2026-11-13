import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        // команда союзников
        b.addAlly(new Yanma("Янма", 1));
        b.addAlly(new Breloom("Брелум", 1));
        b.addAlly(new Snubbull("Снаббул", 1));

        // команда противников
        b.addFoe(new Buizel("Буйзел", 1));
        b.addFoe(new Swellow("Свеллоу", 1));
        b.addFoe(new Floatzel("Флоатзел", 35));

        b.go();
    }
}