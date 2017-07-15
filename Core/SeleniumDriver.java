package Core;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import test.Data.IO;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by brahmanandakar on 11/03/17.
 */
public class SeleniumDriver {
    public WebDriver driver;


    private WebDriver getDriver(String browserName) {

        String os=System.getProperty("os.name");

        if(os.contains("Window")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        }else
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
            case "grid":
                String Node = "http://localhost:4444/wd/hub";
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                try {
                    driver = new RemoteWebDriver(new URL(Node), cap);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        return driver;
    }

}
