package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestConfig {

    public static WebDriver driver = new FirefoxDriver();
    WebDriverWait delay = new WebDriverWait(driver, 5);

    @BeforeSuite
    public void setup() throws Exception {
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}