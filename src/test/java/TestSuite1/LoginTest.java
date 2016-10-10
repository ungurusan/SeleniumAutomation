package TestSuite1;
import Constants.LoginPageConstants;
import Selectors.LoginPageSelectors;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static Suite.TestSuite.*;


/**
 * Created by Alin on 10/10/2016.
 */
public class LoginTest {

    @Test
    public void loginTest(){

        driver.navigate().to(LoginPageConstants.loginPage);
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LoginPageSelectors.username)));
        Assert.assertTrue("Title doesn't contain 'Log in'", driver.getTitle().contains("Log in"));

        driver.findElement(By.cssSelector(LoginPageSelectors.username)).sendKeys(LoginPageConstants.loginUsername);
        driver.findElement(By.cssSelector(LoginPageSelectors.password)).sendKeys(LoginPageConstants.loginPassword);
        driver.findElement(By.cssSelector(LoginPageSelectors.loginButton)).click();

        driver.findElement(By.cssSelector(LoginPageSelectors.promoCloseButton)).click();

    }
}
