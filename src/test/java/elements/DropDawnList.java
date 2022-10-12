package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDawnList {
    private static final String LIST_XPATH="//label[text()='%s']//following-sibling::select";
    private static final String OPTION_XPATH="//option[text()='%s']";
    private WebDriver driver;
    private String labelText;
    public DropDawnList(WebDriver driver, String labelText ){
        this.labelText=labelText;
        this.driver=driver;
    }
    public void selectOptionInList(String option) {
        String listFinalXpath = String.format(LIST_XPATH, labelText);
        driver.findElement(By.xpath(listFinalXpath)).click();
        String optionFinalXpath=String.format(OPTION_XPATH, option);
        driver.findElement(By.xpath(optionFinalXpath)).click();
    }

}
