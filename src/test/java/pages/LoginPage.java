package pages;

import constants.Credentials;
import constants.Urls;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FakeMessageGenerator;

@Log4j
public class LoginPage extends BasePage {
    private By usernameInput = By.id("username");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By logOutButton=By.xpath("//a[text()='Log Out']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToFitday() {
        log.debug(String.format("Attempt to open URL %s",Urls.FITDAY_LOGIN));
        driver.get(Urls.FITDAY_LOGIN);
        log.debug(String.format("Enter username %s", Credentials.USERNAME));
        driver.findElement(usernameInput).sendKeys(Credentials.USERNAME);
        log.debug(String.format("Enter username %s", Credentials.PASSWORD));
        driver.findElement(passwordInput).sendKeys(Credentials.PASSWORD);
        log.debug(String.format("Attempt to click element:%s",loginButton));
        driver.findElement(loginButton).click();
    }

    public boolean loginIsSuccess(){
        WebDriverWait webDriverWait=new WebDriverWait(driver,50);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(logOutButton));
        log.debug(String.format("Attempt to find element %s",logOutButton));
        driver.findElement(logOutButton).isDisplayed();
        return true;
    }
}
