package intro;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationTest {

    public static final String DEMO_URL = "http://demo.guru99.com/";

    //We should add @Test annotation that JUnit will run below method
    @Test
    //Start to write our test method. It should ends with "Test"
    public void firefoxTest() {
        WebDriver driver = new FirefoxDriver();
        executeTest(driver);
    }

    @Test
    public void chromeTest() {
        WebDriver driver = new ChromeDriver();
        executeTest(driver);
    }

    private void executeTest(WebDriver driver) {
        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();

        Assert.assertEquals("assertion failed", "Guru99 Bank Home Page", driver.getTitle());

        driver.close();
        driver.quit();
    }
}
