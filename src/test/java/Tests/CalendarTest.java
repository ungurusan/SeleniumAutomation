package Tests;
import Selectors.LoginPageSelectors;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Alin on 10/10/2016.
 */
public class CalendarTest extends TestConfig{

    @Test
    public void calendarTest(){

        driver.findElement(By.cssSelector(LoginPageSelectors.calendar)).click();

    }
}
