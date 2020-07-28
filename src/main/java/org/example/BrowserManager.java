package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
//  Browser manager class extends with util1
public class BrowserManager extends Util1 {

    // Create load prp class object
    LoadProp loadProp=new LoadProp();

    public void setBrowser() {
        // store multi Browser
        String browserName = loadProp.getProperty("BrowserName");
        // store browser name in String
        if (browserName.equalsIgnoreCase("chrome")) {
            // use if else to test multi browser
            System.setProperty("webdriver.chrome.driver", "src\\Test\\Resources\\BrowserDriver\\chromedriver.exe");
            // Google Driver
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            // Internet Explorer
            System.setProperty("webdriver.ie.driver", "C:\\Soft\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //FireFox (gekodriver)
            System.setProperty("webdriver.gecko.driver", "src\\Test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            // for wrong browser name
            System.out.println("Your browser name is empty or wrong" + browserName);
        }
        // implicitly wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // maximize window
        driver.manage().window().maximize();
        // demo nopcommerce  url
        driver.get("https://demo.nopcommerce.com/ ");

    }


}






