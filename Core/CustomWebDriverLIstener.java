package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * Created by brahmanandakar on 11/03/17.
 */
public class CustomWebDriverLIstener extends AbstractWebDriverEventListener {


    public void beforeClickOn(WebElement element, WebDriver driver) {
        // Do nothing.

        System.out.println("beore click on ");
    }

    public void afterClickOn(WebElement element, WebDriver driver) {

        System.out.println("after click on ");
    }


}
