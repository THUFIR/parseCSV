package parseCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class MyFileReader {

    private static final Logger log = Logger.getLogger(MyFileReader.class.getName());
    private Properties properties = null;

    private MyFileReader() {
    }

    public MyFileReader(Properties properties) {
        this.properties = properties;
    }

    public void readFile() throws IOException {
          BufferedReader reader = new BufferedReader(new FileReader(properties.getProperty("dataFile")));       
          reader.lines().forEach(line -> processLine(line));
    }

    private void processLine(String line) {
        log.info(line);
    }
}
