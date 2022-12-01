package decorator;

import java.util.ArrayList;
import java.util.List;

public class MedicalPlayer extends PlayerDecorator {

    private List<String> equipments = new ArrayList<>();

    public MedicalPlayer(Character character, List<String> equipments) {
        this.character = character;
        this.equipments = equipments;
    }

    @Override
    public void playerSummary() {
        character.characterSummary();
        System.out.println("Gracz ma następujący zestaw wyposażenia: "
                + String.join(", ", this.equipments));
    }
}
