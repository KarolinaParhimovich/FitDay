package pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private By usernameInput = By.id("username");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By logOutButton=By.xpath("//a[text()='Log Out']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToFitday() {
        driver.get(Urls.FITDAY_LOGIN);
        driver.findElement(usernameInput).sendKeys(Credentials.USERNAME);
        driver.findElement(passwordInput).sendKeys(Credentials.PASSWORD);
        driver.findElement(loginButton).click();
    }

    public boolean loginIsSuccess(){
        WebDriverWait webDriverWait=new WebDriverWait(driver,50);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(logOutButton));
        driver.findElement(logOutButton).isDisplayed();
        return true;
    }
}
