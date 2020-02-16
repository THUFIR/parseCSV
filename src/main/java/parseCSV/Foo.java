package parseCSV;

import java.util.Properties;
import java.util.logging.Logger;

public class Foo {

    private static final Logger log = Logger.getLogger(Foo.class.getName());
    private Properties properties = null;

    private Foo() {
    }

    public Foo(Properties properties) {
        this.properties = properties;
    }

    public void bar() {
    }
}
