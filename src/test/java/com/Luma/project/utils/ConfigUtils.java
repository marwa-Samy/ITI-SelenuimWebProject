package com.Luma.project.utils;

import java.util.Properties;

public class  ConfigUtils {
    private Properties properties;
    private static ConfigUtils configUtils;

    private ConfigUtils() {
        properties = PropertiesUtil.loadProperties();

    }

    public static ConfigUtils getInstance() {
        if (configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find baseUrl");
    }

    public String getFirstName() {
        String prop = properties.getProperty("firstName");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find firstName");
    }

    public String getLastName() {
        String prop = properties.getProperty("lastName");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find lastName");
    }

    public String getPassword() {
        String prop = properties.getProperty("password");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find password");
    }

    public String getEmail() {
        String prop = properties.getProperty("email");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find email");
    }

    public String getItem() {
        String prop = properties.getProperty("item");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find item ");
    }

    public String getNumberOfItemes() {
        String prop = properties.getProperty("numberOfItemes");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find numberOfItemes");
    }

    public String getCompany() {
        String prop = properties.getProperty("company");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find company");

    }

    public String getstreet0() {
        String prop = properties.getProperty("street0");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find street0");

    }
    public String getstreet1() {
        String prop = properties.getProperty("street1");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find street1");

    }

    public String getstreet2() {
        String prop = properties.getProperty("street2");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find street2");

    }
    public String getcity() {
        String prop = properties.getProperty("city");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find city");

    }

    public String getpostalCode() {
        String prop = properties.getProperty("postalCode");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find postalCode");

    }
    public String getphone() {
        String prop = properties.getProperty("phone");
        if (prop != null) {
            return prop;
        }
        throw new RuntimeException("can't find phone");

    }

}