package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInput {
    private static final String INPUT_XPATH = "//label[text()='%s']//following-sibling::span//input";
    private String labelText;
    private WebDriver driver;

    public TextInput(WebDriver driver, String labelText) {
        this.labelText = labelText;
        this.driver = driver;
    }

    public void inputText(String text) {
        String finalXpath = String.format(INPUT_XPATH, labelText);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);
    }
}
