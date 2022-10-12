package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaloriesPage extends BasePage {
    public CaloriesPage(WebDriver driver) {
        super(driver);
    }

    private By ADD_FOOD = By.xpath("(//span[text()='Add »'])[1]");
    private By INPUT_FOOD = By.xpath("//input[@value=\"What did you eat today?\"]");
    private By NAME_OF_DISH = By.xpath("//a[text()='Pasta, corn, dry']");
    private By ADD_TO_FOOD_LOG = By.xpath("//span[text()='Add to Food Log']");
    private By INPUT_AMOUNT = By.xpath("//input[@name='amount']");
    private By ITEM_CALORIES_FOOD = By.xpath("//*[local-name()='svg']//*[local-name()='tspan' and text()=749]");
    private By ADD_ACTIV = By.xpath("(//span[text()='Add »'])[2]");
    private By INPUT_ACTIV = By.xpath("//input[@value=\"What did you do today?\"]");
    private By ADD_SPORT=By.xpath("//td[contains(text(),'competitive')]//following-sibling::td[@class='actions']//a");
    private By INPUT_TIME=By.xpath("//input[contains(@name,'minutes')]");
    private By ADD_TO_ACTIV_LOG=By.xpath("//span[text()='Add to Activity Log']");
    private By ITEM_CALORIES_ACTIV=By.xpath("//td[text()='00:30']//following-sibling::td[text()='238']");

    public String addingFood() {
        driver.findElement(ADD_FOOD).click();
        driver.findElement(INPUT_FOOD).sendKeys("Pasta");
        driver.findElement(NAME_OF_DISH).click();
        driver.findElement(INPUT_AMOUNT).clear();
        driver.findElement(INPUT_AMOUNT).sendKeys("2");
        driver.findElement(ADD_TO_FOOD_LOG).click();
        return driver.findElement(ITEM_CALORIES_FOOD).getText();
    }
    public String addingActiv(){
        driver.findElement(ADD_ACTIV).click();
        driver.findElement(INPUT_ACTIV).sendKeys("Football");
        driver.findElement(ADD_SPORT).click();
        driver.findElement(INPUT_TIME).clear();
        driver.findElement(INPUT_TIME).sendKeys("30");
        driver.findElement(ADD_TO_ACTIV_LOG).click();
        return driver.findElement(ITEM_CALORIES_ACTIV).getText();
    }
}
