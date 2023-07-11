package com.Luma.project.utils;

import java.io.*;
import java.util.Properties;

public  class PropertiesUtil {
    public static Properties loadProperties()  {
        File file=new File("src/test/java/com/Luma/project/config/production.properties");
        try {
            InputStream inputStream=new FileInputStream(file);
            Properties properties=new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found");
        } catch (IOException e) {
            throw new RuntimeException("can't find property");
        }
    }
}
