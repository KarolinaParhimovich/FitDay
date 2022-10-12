package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CaloriesPage;

public class CaloriesTests extends BaseTest{
    @Test(priority = 3)
    @Description("Checking the calories content in dish")
    @Severity(SeverityLevel.MINOR)
    public void addingFoodTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        CaloriesPage mainPage = new CaloriesPage(driver);
        String actualCaloriesFood = mainPage.addingFood();
        Assert.assertEquals(actualCaloriesFood, "749.7");
    }

    @Test(priority = 3)
    @Description("Checking of consumed calories")
    @Severity(SeverityLevel.MINOR)
    public void addingActivTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToFitday();
        CaloriesPage mainPage = new CaloriesPage(driver);
        String actualCaloriesActive= mainPage.addingActiv();
        Assert.assertEquals(actualCaloriesActive, "238");
    }
}
