package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WeightPage;
import utils.FakeMessageGenerator;
import utils.RetryAnalyzer;

@Log4j
public class WeightTest extends BaseTest {
    @Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
    @Description("User changes his height in account")
    @Severity(SeverityLevel.NORMAL)
    public void changingWeightTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        log.info(String.format("Page %s initialized", WeightPage.class.getName()));
        WeightPage weightPage = new WeightPage(driver);
        log.debug(String.format("Generate new current weight %s",FakeMessageGenerator.generateNewCurrentWeight()));
        String expectedWeight = FakeMessageGenerator.generateNewCurrentWeight();
        String actualWeight = weightPage.changingWeight(expectedWeight);
        log.debug(String.format("Checking of new actual weight %s",actualWeight));
        Assert.assertEquals(actualWeight, expectedWeight.concat(".0 kgs"));
    }
}
