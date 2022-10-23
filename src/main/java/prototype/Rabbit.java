package prototype;

public class Rabbit extends AnimalPrototype {

    public Rabbit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void say() {
        System.out.println("Rabbit name: " + name + ", weight: " + weight);
    }
}
