package decorator;

import java.util.List;

public class DecoratorPattern {

    public static void main(String[] args) {
        Character character =
                new Character("Bradley", "Soldier", 75, 25);
        PlayerDecorator player = new ArmedPlayer(character, List.of("rifle", "shotgun"));
        player.playerSummary();

    }
}
