package org.Utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import static java.awt.SystemColor.text;

public class Property {
    Properties Prop;

    public void Propertyfiledata() {
        try {
            String Currentdir = System.getProperty("user.dir");
            String path = Currentdir + "/src/Property_Files/Propertyfile.properties";
            Prop = new Properties();
            FileInputStream file = new FileInputStream(path);
            Prop.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String Getname(String value) {
        return Prop.getProperty(value);
    }

}
