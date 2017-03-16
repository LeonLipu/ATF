package src.standalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by brahmanandakar on 11/03/17.
 */
public class hello {

    public static void main(String[] args) {

        System.setProperty("web.chrome.driver","chromedriver");
        WebDriver driver =new ChromeDriver();

    }
}
