package pages;

import elements.DropDawnList;
import elements.TextInput;
import lombok.extern.log4j.Log4j;
import models.UserDataModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j
public class NewAccountPage extends BasePage {
    private By SAVE_BUTTON = By.xpath("//span[contains(text(),'Save')]");
    private By CLOSE_BUTTON = By.xpath("//div[@class='close']");


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean fillInUserData(UserDataModel newUser) {
        log.debug(String.format("Filling in the personal data %s",newUser));
        new DropDawnList(driver, "Sex").selectOptionInList(newUser.getSex());
        new DropDawnList(driver, "Birthday").selectOptionInList(newUser.getBirthday());
        new DropDawnList(driver, "Birthday").selectOptionInList(newUser.getBirthday());
        new DropDawnList(driver, "Birthday").selectOptionInList(newUser.getBirthday());
        new DropDawnList(driver, "Height").selectOptionInList(newUser.getHeight());
        new TextInput(driver, "Height").inputText(newUser.getHeight());
        new DropDawnList(driver, "Current Weight").selectOptionInList(newUser.getCurrentWeight());
        new TextInput(driver, "Current Weight").inputText(newUser.getCurrentWeight());
        new TextInput(driver, "Goal Weight").inputText(newUser.getGoalWeight());
        new TextInput(driver, "Goal Date").inputText(newUser.getGoalDate());
        new DropDawnList(driver, "Activity Level").selectOptionInList(newUser.getActivityLevel());
        log.debug(String.format("Attempt to click element:%s",SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
        log.debug(String.format("Attempt to find element %s",CLOSE_BUTTON));
        driver.findElement(CLOSE_BUTTON).isDisplayed();
        return true;
    }

}
