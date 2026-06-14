package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

    protected WebDriver driver;
    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}