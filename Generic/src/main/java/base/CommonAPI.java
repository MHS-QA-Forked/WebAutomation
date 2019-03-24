package base;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters ({"url"})
    @BeforeMethod
    public void setUp (String url) throws IOException {
        System.setProperty ("webdriver.chrome.driver", "/Users/arif_chowdhuary/IdeaProjects/TeamApple1/driverOfBrowser/chromedriver");
        driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        driver.manage ().timeouts ().pageLoadTimeout (25, TimeUnit.SECONDS);
        driver.get (url);
        driver.manage ().window ().maximize ();
    }

    @AfterMethod
    public void cleanUP () {
        driver.quit ();
    }

    //type
    public void typeOnCss (String locator, String value) {
        driver.findElement (By.cssSelector (locator)).sendKeys (value);
    }

    public void typeOnID (String locator, String value) {
        driver.findElement (By.id (locator)).sendKeys (value);
    }

    public void typeOnElement (String locator, String value) {
        try {
            driver.findElement (By.cssSelector (locator)).sendKeys (value);
        } catch (Exception ex1) {
            try {
                System.out.println ("First Attempt was not successful");
                driver.findElement (By.name (locator)).sendKeys (value);
            } catch (Exception ex2) {
                try {
                    System.out.println ("Second Attempt was not successful");
                    driver.findElement (By.xpath (locator)).sendKeys (value);
                } catch (Exception ex3) {
                    System.out.println ("Third Attempt was not successful");
                    driver.findElement (By.id (locator)).sendKeys (value);
                }
            }
        }
    }

    public void typeOnElementNEnter (String locator, String value) {
        try {
            driver.findElement (By.cssSelector (locator)).sendKeys (value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println ("First Attempt was not successful");
                driver.findElement (By.name (locator)).sendKeys (value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println ("Second Attempt was not successful");
                    driver.findElement (By.xpath (locator)).sendKeys (value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println ("Third Attempt was not successful");
                    driver.findElement (By.id (locator)).sendKeys (value, Keys.ENTER);
                }
            }
        }
    }

    public void clearField (String locator) {
        driver.findElement (By.id (locator)).clear ();
    }

    public void navigateBack () {
        driver.navigate ().back ();
    }
}
