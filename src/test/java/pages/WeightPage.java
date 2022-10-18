package pages;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FakeMessageGenerator;

@Log4j
public class WeightPage extends BasePage{
    public WeightPage(WebDriver driver) {
        super(driver);
    }

    private By EDIT_WEIGHT=By.xpath("(//span[text()='Edit »'])[1]");
    private By EDIT_WEIGHT_BUTTON=By.xpath("(//span[text()='Edit'])[1]");
    private By INPUT_WEIGHT=By.xpath("//input[@name='weight']");
    private By SAVE_BUTTON=By.xpath("//span[text()='Save']");
    private By NEW_CURRENT_WEIGHT=By.xpath("(//td[text()='Weight']//following-sibling::td[contains(text(),'kgs')])[2]");

    public String changingWeight(String expectedWeight) throws InterruptedException {
        log.debug(String.format("Attempt to click element:%s",EDIT_WEIGHT));
        driver.findElement(EDIT_WEIGHT).click();
        log.debug(String.format("Attempt to click element:%s",EDIT_WEIGHT_BUTTON));
        driver.findElement(EDIT_WEIGHT_BUTTON).click();
        log.debug(String.format("Attempt to clear input area :%s",INPUT_WEIGHT));
        driver.findElement(INPUT_WEIGHT).clear();
        log.debug(String.format("Enter new weight %s", expectedWeight));
        driver.findElement(INPUT_WEIGHT).sendKeys(expectedWeight);
        log.debug(String.format("Attempt to click element %s",SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(NEW_CURRENT_WEIGHT,expectedWeight.concat(".0 kgs")));
        log.debug(String.format("Attempt to find element %s",NEW_CURRENT_WEIGHT));
        return driver.findElement(NEW_CURRENT_WEIGHT).getText();
    }
}
