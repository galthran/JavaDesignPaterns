package composite;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    private Integer age;

    private List<Person> children = new ArrayList<>();

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void add(Person child) {
        this.children.add(child);
    }

    public void remove(Person person) {
        this.children.remove(person);
    }
}
