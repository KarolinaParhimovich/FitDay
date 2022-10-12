package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WeightPage;
import utils.FakeMessageGenerator;

public class WeightTest extends BaseTest {
    @Test(priority = 2)
    @Description("User changes his height in account")
    @Severity(SeverityLevel.NORMAL)
    public void changingWeightTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        WeightPage weightPage=new WeightPage(driver);
        String expectedWeight=FakeMessageGenerator.generateNewCurrentWeight();
        String actualWeight=weightPage.changingWeight(expectedWeight);
                Assert.assertEquals(actualWeight, expectedWeight.concat(".0 kgs"));
    }
}
