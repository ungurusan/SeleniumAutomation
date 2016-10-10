import Constants.LoginPageConstants;
import Selectors.LoginPageSelectors;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Alin on 10/10/2016.
 */
public class LoginTest {

    @Test
    public void loginTest(){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait delay = new WebDriverWait(driver, 5);

        driver.navigate().to(LoginPageConstants.loginPage);
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LoginPageSelectors.username)));
        Assert.assertTrue("Title doesn't contain 'Log in'", driver.getTitle().contains("Log in"));

        driver.findElement(By.cssSelector(LoginPageSelectors.username)).sendKeys(LoginPageConstants.loginUsername);
        driver.findElement(By.cssSelector(LoginPageSelectors.password)).sendKeys(LoginPageConstants.loginPassword);
        driver.findElement(By.cssSelector(LoginPageSelectors.loginButton)).click();

        driver.findElement(By.cssSelector(LoginPageSelectors.promoCloseButton)).click();

        driver.close();
        driver.quit();

    }
}
