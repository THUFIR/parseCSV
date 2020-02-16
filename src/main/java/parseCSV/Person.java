package parseCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Person {

    private static final Logger log = Logger.getLogger(Person.class.getName());
    private String name = null;
    private List<String> attributes = new ArrayList<>();

    private Person() {
    }

    Person(String name, List<String> attributes) {
        this.name = name;
        this.attributes = attributes;
        log.info(this.toString());
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
