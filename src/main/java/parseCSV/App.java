package parseCSV;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties props = new Properties();

    private void foo() throws IOException {
        props.loadFromXML(App.class.getResourceAsStream("/properties.xml"));
        log.info(props.toString());
    }

    public static void main(String[] args) throws IOException {
        new App().foo();
    }

}
