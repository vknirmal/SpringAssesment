package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ReadConfigFile {

    Properties properties;
    String path = System.getProperty("user.dir") + "/src/test/resources/properties/config.properties";

    public ReadConfigFile(){
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            try {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public String readValue(String key){
        String value = properties.getProperty(key.toLowerCase(Locale.ROOT));
        if (value!=null)
            return value;
        else
            throw new RuntimeException(key+ " is not specified in config file");

    }
}
