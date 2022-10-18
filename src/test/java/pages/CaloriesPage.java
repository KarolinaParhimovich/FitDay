package pages;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j
public class CaloriesPage extends BasePage {
    public CaloriesPage(WebDriver driver) {
        super(driver);
    }
    private By ADD_FOOD = By.xpath("(//span[text()='Add »'])[1]");
    private By INPUT_FOOD = By.xpath("//input[@value=\"What did you eat today?\"]");
    private By NAME_OF_DISH = By.xpath("//tr[@class='foods foods_s-sr26-f20092']//td[@class='name']//a");
    private By ADD_TO_FOOD_LOG = By.xpath("(//span[text()='Add to Food Log'])[1]");
    private By INPUT_AMOUNT = By.xpath("//input[@name='amount']");
    private By ITEM_CALORIES_FOOD = By.xpath("//*[local-name()='svg']//*[local-name()='tspan' and text()=352]");
    private By ADD_ACTIV = By.xpath("(//span[text()='Add »'])[2]");
    private By INPUT_ACTIV = By.xpath("//input[@value=\"What did you do today?\"]");
    private By ADD_SPORT=By.xpath("//td[contains(text(),'flag')]//following-sibling::td[text()='8']//following-sibling::td[@class='actions']//a");
    private By INPUT_TIME=By.xpath("//input[contains(@name,'minutes')]");
    private By ADD_TO_ACTIV_LOG=By.xpath("//span[text()='Add to Activity Log']");
    private By ITEM_CALORIES_ACTIV=By.xpath("//td[text()='00:30']//following-sibling::td[text()='299']");

    public String addingFood() {
        log.debug(String.format("Attempt to click element:%s",ADD_FOOD));
        driver.findElement(ADD_FOOD).click();
        log.debug(String.format("Enter 'Pasta' in input %s", INPUT_FOOD));
        driver.findElement(INPUT_FOOD).sendKeys("Pasta");
        log.debug(String.format("Attempt to click element:%s",NAME_OF_DISH));
        driver.findElement(NAME_OF_DISH).click();
        log.debug(String.format("Attempt to clear input area :%s",INPUT_AMOUNT));
        driver.findElement(INPUT_AMOUNT).clear();
        log.debug(String.format("Enter '2' in input %s", INPUT_FOOD));
        driver.findElement(INPUT_AMOUNT).sendKeys("2");
        log.debug(String.format("Attempt to click element:%s",ADD_TO_FOOD_LOG));
        driver.findElement(ADD_TO_FOOD_LOG).click();
        log.debug(String.format("Attempt to find text of element %s",ITEM_CALORIES_FOOD));
        return
                driver.findElement(ITEM_CALORIES_FOOD).getText();
    }
    public String addingActiv(){
        log.debug(String.format("Attempt to click element:%s",ADD_ACTIV));
        driver.findElement(ADD_ACTIV).click();
        log.debug(String.format("Enter 'Football' in input %s", INPUT_FOOD));
        driver.findElement(INPUT_ACTIV).sendKeys("Football");
        log.debug(String.format("Attempt to click element:%s",ADD_SPORT));
        driver.findElement(ADD_SPORT).click();
        log.debug(String.format("Attempt to clear input area :%s",INPUT_TIME));
        driver.findElement(INPUT_TIME).clear();
        log.debug(String.format("Enter '30' in input %s", INPUT_TIME));
        driver.findElement(INPUT_TIME).sendKeys("30");
        log.debug(String.format("Attempt to click element:%s",ADD_TO_ACTIV_LOG));
        driver.findElement(ADD_TO_ACTIV_LOG).click();
        log.debug(String.format("Attempt to find text of element %s",ITEM_CALORIES_ACTIV));
        return driver.findElement(ITEM_CALORIES_ACTIV).getText();
    }
}
