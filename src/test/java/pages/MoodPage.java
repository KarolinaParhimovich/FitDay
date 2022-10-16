package pages;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
@Log4j
public class MoodPage extends BasePage{
    public MoodPage(WebDriver driver) {
        super(driver);
    }
    private By EDIT_MOOD=By.xpath("(//span[text()='Edit »'])[2]");
    private By MOOD_SLIDER=By.xpath("//div[@id='j-mood-hunger-slider']//a");
    private By SAVE_BUTTON=By.xpath("//table[@class='ib-list']//following-sibling::div[@class='actions']//span[text()='Save']");

    public boolean choosingSaveButton(){
        log.debug(String.format("Attempt to click element:%s",EDIT_MOOD));
        driver.findElement(EDIT_MOOD).click();
        log.debug(String.format("Move the element %s", MOOD_SLIDER));
        driver.findElement(MOOD_SLIDER).sendKeys(Keys.ARROW_UP);
        log.debug(String.format("Attempt to use element %s",SAVE_BUTTON));
        return driver.findElement(SAVE_BUTTON).isEnabled();
    }
}
