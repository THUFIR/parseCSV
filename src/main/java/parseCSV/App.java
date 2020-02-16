package parseCSV;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void run() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/properties.xml"));
        log.fine(properties.toString());
        FileHelper myFileReader = new FileHelper(properties);
        myFileReader.readFile();
        myFileReader.processLines();
    }

    public static void main(String[] args) throws IOException {
        new App().run();
    }

}
