package pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.pages_base.BasePage;

public class RadiButtonPage extends BasePage {
    public RadiButtonPage(WebDriver driver) {
        super(driver);}

    //locators
    private final By yesRadio = By.cssSelector("label[class^=\"custom-control\"][for=\"yesRadio\"]");
    private final By impressiveRadio = By.cssSelector("label[class^=\"custom-control\"][for=\"impressiveRadio\"]");
    private final By noRadio = By.cssSelector("label[class^=\"custom-control\"][for=\"noRadio\"]");
    private final By outputRadioText = By.cssSelector("span[class=\"text-success\"]");

    public void clickRadio(){

        waitElementIsVisible(driver.findElement(yesRadio)).click();
        Assert.assertEquals(driver.findElement(outputRadioText).getText(),"Yes","Радиобаттон Yes не нажат");
        waitElementIsVisible(driver.findElement(impressiveRadio)).click();
        Assert.assertEquals(driver.findElement(outputRadioText).getText(),"Impressive","Радиобаттон Impressive не нажат");
        waitElementIsVisible(driver.findElement(noRadio)).click();
        Assert.assertEquals(driver.findElement(outputRadioText).getText(),"No","Радиобаттон No не нажат");

    }


}
