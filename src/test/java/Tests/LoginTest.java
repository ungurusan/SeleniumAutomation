package Tests;
import Constants.LoginPageConstants;
import Selectors.LoginPageSelectors;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



/**
 * Created by Alin on 10/10/2016.
 */
public class LoginTest extends TestConfig{

    @Test
    public void loginTest(){

        driver.navigate().to(LoginPageConstants.loginPage);
        Assert.assertTrue(driver.getTitle().contains("Log in"), "Title doesn't contain 'Log in'");

        driver.findElement(By.cssSelector(LoginPageSelectors.username)).sendKeys(LoginPageConstants.loginUsername);
        driver.findElement(By.cssSelector(LoginPageSelectors.password)).sendKeys(LoginPageConstants.loginPassword);
        driver.findElement(By.cssSelector(LoginPageSelectors.loginButton)).click();

        driver.findElement(By.cssSelector(LoginPageSelectors.promoCloseButton)).click();

    }
}
