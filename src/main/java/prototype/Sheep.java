package prototype;

public class Sheep extends AnimalPrototype {

    public Sheep(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void say() {
        System.out.println("Sheep name: " + name + ", weight: " + weight);
    }
}
