package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForumPage;
import pages.LoginPage;
import utils.RetryAnalyzer;
@Log4j
public class ForumTests extends BaseTest{
    @Test(priority = 3)
    @Description("User tries to like post")
    @Severity(SeverityLevel.MINOR)
    public void likingPostTest(){
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        log.info(String.format("Page %s initialized", ForumPage.class.getName()));
        ForumPage forumPage=new ForumPage(driver);
        String actualText = forumPage.likingPost();
        log.debug(String.format("Checking emerging liking %s",actualText));
        Assert.assertEquals(actualText, "You like this.");
    }
    @Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
    @Description("User tries to add his post")
    @Severity(SeverityLevel.CRITICAL)
    public void addingPostTest(){
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        ForumPage forumPage=new ForumPage(driver);
        log.info(String.format("Page %s initialized", ForumPage.class.getName()));
        String actualName = forumPage.addingPost();
        log.debug(String.format("Checking emerging name of user %s",actualName));
        Assert.assertEquals(actualName, "Loyola123");
    }
}
