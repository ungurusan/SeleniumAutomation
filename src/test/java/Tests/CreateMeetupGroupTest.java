package Tests;

import Constants.HomePageConstants;
import Constants.LoginPageConstants;
import Selectors.CreateMeetupSelectors;
import Selectors.HomePageSelectors;
import Selectors.LoginPageSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.Visibility;

/**
 * Created by Alin on 10/11/2016.
 */
public class CreateMeetupGroupTest extends TestConfig{

    @Test
    public void CreateMeetupGroupTest() {

        driver.navigate().to(HomePageConstants.homePage);
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(HomePageSelectors.createMeetupButton)));

        driver.findElement((By.cssSelector(HomePageSelectors.createMeetupButton))).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 1 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 1 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"your new Meetup Group\")]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.nextButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.nextButton))).click();

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 2 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 2 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'What will your Meetup be about?')]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.newTechnology)));
        driver.findElement(By.cssSelector(CreateMeetupSelectors.newTechnology)).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.nextStepButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.nextStepButton))).click();

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 3 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 3 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'What will your Meetup')]")).isDisplayed());
        driver.findElement(By.cssSelector(CreateMeetupSelectors.meetupNameBox)).sendKeys("Selenium Test");
        driver.findElement(By.cssSelector(CreateMeetupSelectors.meetupDescriptionBox)).sendKeys("Selenium Test Description with at least 50 characters");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.submitButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.submitButton))).click();

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 4 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 4 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("ul[class=\"bullets margin--bottom\"]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.agreeContinue)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.agreeContinue))).click();

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-tier=\"unlimited\"]")));
        Assert.assertTrue(driver.findElement(By.cssSelector("a[data-tier=\"unlimited\"]")).isDisplayed());
    }
}
