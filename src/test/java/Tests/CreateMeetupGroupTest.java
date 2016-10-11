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
// navigate to homepage and wait for the Create Meetup button to be displayed
        driver.navigate().to(HomePageConstants.homePage);
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(HomePageSelectors.createMeetupButton)));
// create a new meetup and verify the step is 1 of 4 and the step title; then go to the next step
        driver.findElement((By.cssSelector(HomePageSelectors.createMeetupButton))).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 1 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 1 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"your new Meetup Group\")]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.nextButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.nextButton))).click();
// verify the step is 2 of 4 and the step title; select the new technology preference then go to the next step
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 2 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 2 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'What will your Meetup be about?')]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.newTechnology)));
        driver.findElement(By.cssSelector(CreateMeetupSelectors.newTechnology)).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.nextStepButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.nextStepButton))).click();
// verify step is 3 of 4 nad the step title; enter the meetup title and description and go to the next step
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 3 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 3 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'What will your Meetup')]")).isDisplayed());
        driver.findElement(By.cssSelector(CreateMeetupSelectors.meetupNameBox)).sendKeys("Selenium Test");
        driver.findElement(By.cssSelector(CreateMeetupSelectors.meetupDescriptionBox)).sendKeys("Selenium Test Description with at least 50 characters");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.submitButton)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.submitButton))).click();
// verify step is 4 of 4 and the help section; click agree and continue
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Step 4 of 4')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Step 4 of 4')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("ul[class=\"bullets margin--bottom\"]")).isDisplayed());
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CreateMeetupSelectors.agreeContinue)));
        driver.findElement((By.cssSelector(CreateMeetupSelectors.agreeContinue))).click();
// verify that a unlimited plan is available for selection
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-tier=\"unlimited\"]")));
        Assert.assertTrue(driver.findElement(By.cssSelector("a[data-tier=\"unlimited\"]")).isDisplayed());
// to be continued
    }
}
