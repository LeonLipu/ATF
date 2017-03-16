package Core;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import test.Data.IO;

/**
 * Created by brahmanandakar on 11/03/17.
 */
public class SeleniumDriver {
    public WebDriver driver;


    private WebDriver getDriver(String browserName) {

        System.setProperty("web.chrome.driver","chromedriver");

        switch (browserName.toLowerCase()) {
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                System.out.println("chrome");
                break;
            default:
                System.out.println("Browser(ie,firefox,chrome) not found ");

        }
      return driver;
    }


    public WebDriver initializeDriver() {
        IO io = new IO();
      //  PropertyConfigurator.configure("log4j.properties");
        String url = (String) io.loadPropertyFile("config.properties").get(
                "url");
        WebDriver driver = new SeleniumDriver().getDriver((String) io
                .loadPropertyFile("config.properties").get("browser"));
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

}
