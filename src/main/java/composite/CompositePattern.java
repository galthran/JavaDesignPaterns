package composite;

import java.util.stream.Collectors;

public class CompositePattern {

    public static void main(String[] args) {
        Person father = new Person("Karol" , 56);

        Person child1 = new Person("Maria", 32);
        Person child2 = new Person("Marek", 28);

        father.add(child1);
        father.add(child2);

        System.out.println("Ojciec ma na imię " + father.getName() +
                " a jego dzieci to " +
                father.getChildren()
                        .stream()
                        .map(Person::getName)
                        .collect(Collectors.joining(", "))
        );
    }
}
