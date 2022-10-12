package pages;

import elements.DropDawnList;
import elements.TextInput;
import models.UserDataModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {
    private By SAVE_BUTTON = By.xpath("//span[contains(text(),'Save')]");
    private By CLOSE_BUTTON = By.xpath("//div[@class='close']");


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean fillInUserData(UserDataModel newUser) {
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
        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(CLOSE_BUTTON).isDisplayed();
        return true;
    }

}
