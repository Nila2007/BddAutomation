package org.example;

import com.google.common.annotations.VisibleForTesting;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
     //Load prop class to input file location and name
public class LoadProp {
    static Properties prop;
    static FileInputStream input;
    static  String fileName = "TestDataConfig.properties";
       // path for Test Data config
    static String fileLocation = "src\\Test\\Resources\\TestData\\";


    public String getProperty(String key) {

        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }


    public void getMethod(){
        System.out.println(getProperty("url"));
    }



    }


