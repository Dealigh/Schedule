package com.solvd.Schedule.util.ConnectionPool;

import com.solvd.Schedule.util.Constants;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.apache.logging.log4j.LogManager.*;

public class DBPropertiesUtil {

    private final static Logger LOG = getLogger(DBPropertiesUtil.class);

    private static Properties properties = new Properties();
    private static DBPropertiesUtil dbPropertiesUtil = new DBPropertiesUtil();

    private DBPropertiesUtil() {
        try {
            properties.load(new FileReader(Constants.PATHPROPERTIES.getConstantValues()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getString(String key) {
        return properties.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }
}

