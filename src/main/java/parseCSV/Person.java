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
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : attributes) {
            stringBuilder.append(s);
        }
        return "\n\n\nname\n" + stringBuilder.toString();
    }
}
