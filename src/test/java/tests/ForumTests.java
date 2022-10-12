package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForumPage;
import pages.LoginPage;

public class ForumTests extends BaseTest{
    @Test(priority = 3)
    @Description("User tries to like post")
    @Severity(SeverityLevel.MINOR)
    public void likingPostTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        ForumPage forumPage=new ForumPage(driver);
        String actualText = forumPage.likingPost();
        Assert.assertEquals(actualText, "You like this.");
    }
    @Test(priority = 2)
    @Description("User tries to add his post")
    @Severity(SeverityLevel.CRITICAL)
    public void addingPostTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        ForumPage forumPage=new ForumPage(driver);
        String actualName = forumPage.addingPost();
        Assert.assertEquals(actualName, "Loyola123");
    }
}
