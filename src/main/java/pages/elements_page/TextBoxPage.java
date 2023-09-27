package pages.elements_page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.pages_base.BasePage;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }
    private final By inputFullNameField = By.cssSelector("input[id='userName']");
    private final By inputUserEmailField = By.cssSelector("input[id='userEmail']");
    private final By currentAddressField = By.cssSelector("textarea[id='currentAddress']");
    private final By permanentAddressField = By.cssSelector("textarea[id='permanentAddress']");
    private final By submitButton = By.cssSelector("button[id=\"submit\"]");


    public TextBoxPage assertInput() {
        WebElement fullName = driver.findElement(inputFullNameField);
        Assert.state(true, String.valueOf(fullName.isDisplayed()));
        return this;

    }
    public TextBoxPage feelAllFields(){
        driver.findElement(inputFullNameField).sendKeys("jgkggi");
        driver.findElement(submitButton).click();
        return this;
    }
}
