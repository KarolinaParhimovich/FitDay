package pages;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Log4j
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
        log.debug(String.format("Attempt to click element %s",FORUMS_TAB));
        driver.findElement(FORUMS_TAB).click();
        log.debug(String.format("Attempt to click element %s",SEARCH));
        driver.findElement(SEARCH).click();
        log.debug(String.format("Enter 'Diets' in input %s", INPUT_SEARCH));
        driver.findElement(INPUT_SEARCH).sendKeys("Diets");
        log.debug(String.format("Attempt to click element:%s",GO_BUTTON));
        driver.findElement(GO_BUTTON).click();
        log.debug(String.format("Attempt to click element:%s",FORUM_NAME));
        driver.findElement(FORUM_NAME).click();
        WebElement element = driver.findElement(LIKE_POST);
        log.info("Attempt to scroll down the page");
        element.sendKeys(Keys.DOWN);
        log.debug(String.format("Attempt to click element:%s",LIKE_POST));
        driver.findElement(LIKE_POST).click();
        log.debug(String.format("Attempt to find element %s",LIKE_MESSAGE));
        return driver.findElement(LIKE_MESSAGE).getText();
    }
    public String addingPost(){
        log.debug(String.format("Attempt to click element:%s",FORUMS_TAB));
        driver.findElement(FORUMS_TAB).click();
        log.debug(String.format("Attempt to click element:%s",SEARCH));
        driver.findElement(SEARCH).click();
        log.debug(String.format("Enter 'Diets' in input %s", INPUT_SEARCH));
        driver.findElement(INPUT_SEARCH).sendKeys("Diets");
        log.debug(String.format("Attempt to click element:%s",GO_BUTTON));
        driver.findElement(GO_BUTTON).click();
        log.debug(String.format("Attempt to click element:%s",FORUM_NAME));
        driver.findElement(FORUM_NAME).click();
        log.debug(String.format("Attempt to click element:%s",REPLY_BUTTON));
        driver.findElement(REPLY_BUTTON).click();
        log.debug(String.format("Switching to frame %s",IFRAME_MESSAGE));
        driver.switchTo().frame(driver.findElement(IFRAME_MESSAGE));
        log.debug(String.format("Enter 'Hello!' in input %s", INPUT_IFRAME));
        driver.findElement(INPUT_IFRAME).sendKeys("Hello!");
        log.info("Switching to parent frame");
        driver.switchTo().parentFrame();
        log.debug(String.format("Attempt to click element:%s",SUBMIT_BUTTON));
        driver.findElement(SUBMIT_BUTTON).click();
        log.debug(String.format("Attempt to find element %s",NAME_USER));
        return driver.findElement(NAME_USER).getText();
    }
}
