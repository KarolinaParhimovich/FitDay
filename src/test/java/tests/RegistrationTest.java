package tests;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreatingAccountPage;
@Log4j
public class RegistrationTest extends BaseTest {

    @Test(priority = 1)
    @Description("New user tries to create account without confirmation password")
    @Severity(SeverityLevel.BLOCKER)
    public void registrationWithoutConfirmTest() {
        CreatingAccountPage creatingAccountPage = new CreatingAccountPage(driver);
        log.info(String.format("Page %s initialized", CreatingAccountPage.class.getName()));
        String actualMessage=creatingAccountPage.accountWithoutConfirm();
        log.info("Checking the emerging of the message");
        Assert.assertEquals(actualMessage,"Please re-enter your password.");
    }

    @Test(priority = 1)
    @Description("New user tries to create account with different passwords")
    @Severity(SeverityLevel.BLOCKER)
    public void doNotMatchPasswordsTest(){
        CreatingAccountPage creatingAccountPage = new CreatingAccountPage(driver);
        log.info(String.format("Page %s initialized", CreatingAccountPage.class.getName()));
        String actualMessage=creatingAccountPage.accountWithDoNotMatchPasswords();
        log.info("Checking the emerging of the message");
        Assert.assertEquals(actualMessage,"The passwords you've entered do not match.");
    }
}
