package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import models.PrepareUserDataModel;
import models.UserDataModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NewAccountPage;

public class LoginTests extends BaseTest {
    @Test(priority = 1)
    @Description("User tries to login")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        Assert.assertTrue(loginPage.loginIsSuccess(), "Login is not success");
    }

    @Test(enabled = false, priority = 1)
    @Description("User creates account with his physical data")
    @Severity(SeverityLevel.CRITICAL)
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        NewAccountPage accountPage = new NewAccountPage(driver);
        UserDataModel accountModel = PrepareUserDataModel.getValidData();
        accountPage.fillInUserData(accountModel);
        Assert.assertTrue(accountPage.fillInUserData(accountModel), "Account was not created");
    }
}
