package prototype;

public abstract class AnimalPrototype implements Cloneable {

    protected String name;
    protected  double weight;

    public AnimalPrototype clone() {
        AnimalPrototype animalPrototype = null;

        try {
            animalPrototype = (AnimalPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return animalPrototype;
    }
}
