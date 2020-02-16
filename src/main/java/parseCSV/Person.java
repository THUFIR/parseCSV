package parseCSV;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name = null;
    private List<String> attributes = new ArrayList<>();

    private Person() {
    }

    Person(String name, List<String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "\n\n\nname\n" + attributes.toString();
    }
}
