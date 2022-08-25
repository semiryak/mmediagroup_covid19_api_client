package kz.vissayev.mmediagroup.covid19.client;

import kz.vissayev.mmediagroup.covid19.client.api.ApiException;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.System.getProperty;

public final class Configuration {
    private static volatile Configuration instance;
    final String PROPERTIES_FILE = "config.properties";
    InputStream inputStream;
    Properties prop;

    private Configuration() throws ApiException {
        try {
            this.prop = new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + PROPERTIES_FILE + "' not found in the classpath");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    public static Configuration getInstance() throws ApiException {
        Configuration result = instance;
        if(result!=null) {
            return result;
        }
        synchronized (Configuration.class) {
            if(instance == null) {
                instance = new Configuration();
            }
            return instance;
        }
    }

    public String propertyByName(String name) {
        return prop.getProperty(name);
    }
}
