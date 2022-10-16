package pages;
import constants.Urls;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.FakeMessageGenerator;
@Log4j
public class CreatingAccountPage extends BasePage {
    public CreatingAccountPage(WebDriver driver) {
        super(driver);
    }

    private By createAccountLink = By.xpath("//a[contains(text(),'Create')]");
    private By usernameInput = By.id("Username");
    private By passwordInput = By.id("Password1");
    private By confPasswordInput = By.id("Password2");
    private By emailInput = By.name("Email");
    private By agreeInput = By.id("Agree");
    private By signUpButton = By.xpath("//input[@type='submit']");
    private By attentionMessage1=By.xpath("//p[text()='Please re-enter your password.']");
    private By attentionMessage2=By.xpath("//p[contains(text(),'do not match')]");

    public String  accountWithoutConfirm(){
        log.debug(String.format("Attempt to open URL %s",Urls.FITDAY_LOGIN));
        driver.get(Urls.FITDAY_LOGIN);
        log.info("Click on the link for creating new account");
        driver.findElement(createAccountLink).click();
        log.debug(String.format("Enter username %s", FakeMessageGenerator.generateNewName()));
        driver.findElement(usernameInput).sendKeys(FakeMessageGenerator.generateNewName());
        log.debug(String.format("Enter password %s", FakeMessageGenerator.generateNewPassword()));
        driver.findElement(passwordInput).sendKeys(FakeMessageGenerator.generateNewPassword());
        log.debug(String.format("Enter email %s", FakeMessageGenerator.generateNewEmail()));
        driver.findElement(emailInput).sendKeys(FakeMessageGenerator.generateNewEmail());
        log.info("Click on consent to processing personal data");
        driver.findElement(agreeInput).click();
        log.debug(String.format("Attempt to click element:%s",signUpButton));
        driver.findElement(signUpButton).click();
        log.debug(String.format("Attempt to find message %s",attentionMessage1));
        return driver.findElement(attentionMessage1).getText();
    }
    public String  accountWithDoNotMatchPasswords(){
        log.debug(String.format("Attempt to open URL %s",Urls.FITDAY_LOGIN));
        driver.get(Urls.FITDAY_LOGIN);
        log.info("Click on the link for creating new account");
        driver.findElement(createAccountLink).click();
        log.debug(String.format("Enter username %s", FakeMessageGenerator.generateNewName()));
        driver.findElement(usernameInput).sendKeys(FakeMessageGenerator.generateNewName());
        log.debug(String.format("Enter password %s", FakeMessageGenerator.generateNewPassword()));
        driver.findElement(passwordInput).sendKeys(FakeMessageGenerator.generateNewPassword());
        log.debug(String.format("Enter confirmation of password %s", FakeMessageGenerator.generateNewPassword()));
        driver.findElement(confPasswordInput).sendKeys(FakeMessageGenerator.generateNewPassword());
        log.debug(String.format("Enter email %s", FakeMessageGenerator.generateNewEmail()));
        driver.findElement(emailInput).sendKeys(FakeMessageGenerator.generateNewEmail());
        log.info("Click on consent to processing personal data");
        driver.findElement(agreeInput).click();
        log.debug(String.format("Attempt to click element:%s",signUpButton));
        driver.findElement(signUpButton).click();
        log.debug(String.format("Attempt to find message %s",attentionMessage2));
        return driver.findElement(attentionMessage2).getText();
    }

}
