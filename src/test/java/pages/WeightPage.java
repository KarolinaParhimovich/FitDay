package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FakeMessageGenerator;

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
        driver.findElement(EDIT_WEIGHT).click();
        driver.findElement(EDIT_WEIGHT_BUTTON).click();
        driver.findElement(INPUT_WEIGHT).clear();
        driver.findElement(INPUT_WEIGHT).sendKeys(expectedWeight);
        driver.findElement(SAVE_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(NEW_CURRENT_WEIGHT,expectedWeight.concat(".0 kgs")));
        return driver.findElement(NEW_CURRENT_WEIGHT).getText();
    }
}
