package Tests;
import Constants.CalendarConstants;
import Constants.HomePageConstants;
import Selectors.CalendarSelectors;
import Selectors.HomePageSelectors;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;



/**
 * Created by Alin on 10/10/2016.
 */
public class CalendarTest extends TestConfig{

    @Test
    public void calendarTest(){
// go to homepage and click the calendar button
        driver.findElement(By.cssSelector(HomePageConstants.homePage)).click();
        driver.findElement(By.cssSelector(HomePageSelectors.calendar)).click();
// go to my meetups and verify the correct title is displayed
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CalendarSelectors.myMeetups)));
        driver.findElement(By.cssSelector(CalendarSelectors.myMeetups)).click();
        Assert.assertTrue(driver.getTitle().contains(CalendarConstants.calendarTitle), "Title doesn't contain:" + CalendarConstants.calendarTitle);
    }
}
