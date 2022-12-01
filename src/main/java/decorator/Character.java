package decorator;

public class Character {

    private String name;

    private String type;

    private Integer strength;

    private Integer speed;

    public Character(String name, String type, Integer strength, Integer speed) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void characterSummary() {
        System.out.println("Nasza postać to: " + this.name
                + ", jego typ to: " + this.type
                + ", posiada " + this.strength + " punktów siły"
                + " oraz " + this.speed + " punktów prędkości"
                );
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                '}';
    }
}
