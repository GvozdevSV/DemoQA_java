package pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.pages_base.BasePage;

import java.util.List;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }
    //locators
    private final By expandAllButton = By.cssSelector("button[title=\"Expand all\"]");
    private final By checkboxes = By.cssSelector("span[class=\"rct-checkbox\"]");



    public CheckBoxPage expandAllCheckbox(){
        driver.findElement(expandAllButton).click();
        return this;

    }
    public clickRandomCheckbox(){
        List<WebElement> allCheckboxes = driver.findElements(checkboxes);
        int count = 20;
        do {
            WebElement item = allCheckboxes[(Math.random() * 15) + 1];
        }

    }

}
