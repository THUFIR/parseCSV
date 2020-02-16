package parseCSV;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void foo() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/properties.xml"));
        log.info(properties.toString());
        MyFileReader myFileReader = new MyFileReader(properties);
        myFileReader.readFile();
        myFileReader.foo();
    }

    public static void main(String[] args) throws IOException {
        new App().foo();
    }

}
