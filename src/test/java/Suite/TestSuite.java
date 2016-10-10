package Suite;
import TestSuite1.LoginTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alin on 10/10/2016.
 */
@RunWith(Suite.class)
@SuiteClasses({
        LoginTest.class
})
public class TestSuite {

    public static WebDriver driver;
    public static WebDriverWait delay = new WebDriverWait(driver, 5);

    @BeforeClass
    public static void setUp() {
        System.out.println("setting up");
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("tearing down");
        driver.close();
        driver.quit();
    }

}

