package tests;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CaloriesPage;
@Log4j
public class CaloriesTests extends BaseTest{
    @Test(priority = 3)
    @Description("Checking the calories content in dish")
    @Severity(SeverityLevel.MINOR)
    public void addingFoodTest() {
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        CaloriesPage mainPage = new CaloriesPage(driver);
        log.info(String.format("Page %s initialized", CaloriesPage.class.getName()));
        String actualCaloriesFood = mainPage.addingFood();
        log.debug(String.format("Checking of the actual number of calories %s",actualCaloriesFood));
        Assert.assertEquals(actualCaloriesFood, "352");
    }

    @Test(priority = 3)
    @Description("Checking of consumed calories")
    @Severity(SeverityLevel.MINOR)
    public void addingActivTest(){
        LoginPage loginPage = new LoginPage(driver);
        log.info(String.format("Page %s initialized", LoginPage.class.getName()));
        log.info("Filling in the login form");
        loginPage.loginToFitday();
        CaloriesPage caloriesPage = new CaloriesPage(driver);
        log.info(String.format("Page %s initialized", CaloriesPage.class.getName()));
        String actualCaloriesActive= caloriesPage.addingActiv();
        log.debug(String.format("Checking of the actual number of calories %s",actualCaloriesActive));
        Assert.assertEquals(actualCaloriesActive, "299");
    }
}
