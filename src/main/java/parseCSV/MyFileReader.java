package parseCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class MyFileReader {

    private static final Logger log = Logger.getLogger(MyFileReader.class.getName());
    private Properties properties = null;
    private List<String> lines = null;//new ArrayList<String>();

    private MyFileReader() {
    }

    public MyFileReader(Properties properties) {
        this.properties = properties;
    }

    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(properties.getProperty("dataFile")));
        lines = new ArrayList();
        reader.lines().forEach(line -> lines.add(line));
        Collections.reverse(lines);
        log.info(lines.toString());
    }

}
