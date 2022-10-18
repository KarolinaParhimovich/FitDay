package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import models.PrepareUserDataModel;
import models.UserDataModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NewAccountPage;
@Log4j
public class LoginTests extends BaseTest {
    @Test(priority = 1)
    @Description("User tries to login")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        log.info("Checking the emerging of the element on the page");
        Assert.assertTrue(loginPage.loginIsSuccess(), "Login is not success");
    }

    @Test(enabled = false, priority = 1)
    @Description("User creates account with his physical data")
    @Severity(SeverityLevel.CRITICAL)
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        log.info(String.format("Page %s initialized", NewAccountPage.class.getName()));
        NewAccountPage accountPage = new NewAccountPage(driver);
        UserDataModel accountModel = PrepareUserDataModel.getValidData();
        log.info("Filling in the personal data");
        accountPage.fillInUserData(accountModel);
        log.info("Checking the emerging of the element on the page");
        Assert.assertTrue(accountPage.fillInUserData(accountModel), "Account was not created");
    }
}
