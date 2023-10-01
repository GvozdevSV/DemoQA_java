package pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.pages_base.BasePage;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }
    //locators
    private final By expandAllButton = By.cssSelector("button[title=\"Expand all\"]");



    public CheckBoxPage expandAllCheckbox(){
        driver.findElement(expandAllButton).click();
        return this;

    }
    public clickRandomChecbox(){

    }

}
