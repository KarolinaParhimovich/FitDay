package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MoodPage;
import utils.RetryAnalyzer;
@Log4j
public class MoodTest extends BaseTest{
    @Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
    @Description("User is changing his mood")
    @Severity(SeverityLevel.NORMAL)
    public void changingMoodTest(){
        LoginPage loginPage=new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        log.info(String.format("Page %s initialized", MoodPage.class.getName()));
        MoodPage moodPage=new MoodPage(driver);
        log.debug("Checking the emerging of the element on the page");
        Assert.assertTrue(moodPage.choosingSaveButton(),"Save button is not enabled");
    }
}
