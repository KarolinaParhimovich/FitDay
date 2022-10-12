package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage extends BasePage{
    public ForumPage(WebDriver driver) {
        super(driver);
    }
    private By FORUMS_TAB=By.xpath("//span[text()='FORUMS']");
    private By SEARCH= By.id("navbar_search");
    private By INPUT_SEARCH=By.xpath("//input[@tabindex='1001']");
    private By GO_BUTTON=By.xpath("//input[@tabindex='1004']");
    private By FORUM_NAME=By.xpath("//a[text()='How to lose weight?']");
    private By LIKE_POST=By.xpath("//div[contains(text(),'You have to eat fewer')]//following-sibling::div//a[text()='Like']");
    private By LIKE_MESSAGE=By.xpath("//div[contains(text(),'You have to eat fewer')]//following-sibling::div//div[text()='You like this.']");
    private By IFRAME_MESSAGE=By.xpath(("//div[@id='cke_1_contents']//iframe"));
    private By INPUT_IFRAME=By.cssSelector(".cke_editable");
    private By REPLY_BUTTON=By.xpath("(//div[@class='flexitem']//a[contains(., 'Reply')])[1]");
    private By SUBMIT_BUTTON=By.xpath("//input[@accesskey='s']");
    private By NAME_USER=By.xpath("(//a[text()='Loyola123'])[1]");

    public String likingPost(){
        driver.findElement(FORUMS_TAB).click();
        driver.findElement(SEARCH).click();
        driver.findElement(INPUT_SEARCH).sendKeys("Diets");
        driver.findElement(GO_BUTTON).click();
        driver.findElement(FORUM_NAME).click();
        WebElement element = driver.findElement(LIKE_POST); element.sendKeys(Keys.DOWN);
        driver.findElement(LIKE_POST).click();
        return driver.findElement(LIKE_MESSAGE).getText();
    }
    public String addingPost(){
        driver.findElement(FORUMS_TAB).click();
        driver.findElement(SEARCH).click();
        driver.findElement(INPUT_SEARCH).sendKeys("Diets");
        driver.findElement(GO_BUTTON).click();
        driver.findElement(FORUM_NAME).click();
        driver.findElement(REPLY_BUTTON).click();
        driver.switchTo().frame(driver.findElement(IFRAME_MESSAGE));
        driver.findElement(INPUT_IFRAME).sendKeys("Hello!");
        driver.switchTo().parentFrame();
        driver.findElement(SUBMIT_BUTTON).click();
        return driver.findElement(NAME_USER).getText();
    }
}
