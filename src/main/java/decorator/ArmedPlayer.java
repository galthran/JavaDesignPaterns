package decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmedPlayer extends PlayerDecorator {

    private List<String> weapons = new ArrayList<>();

    public ArmedPlayer(Character character, List<String> weapons) {
        this.character = character;
        this.weapons = weapons;
    }

    @Override
    public void playerSummary() {
        character.characterSummary();
        System.out.println("Gracz ma następujący zestaw broni: "
                + String.join(", ", this.weapons));
    }
}
