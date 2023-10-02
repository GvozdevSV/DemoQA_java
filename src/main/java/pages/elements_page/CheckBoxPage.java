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
    private final By checkedItem = By.cssSelector("svg[class='rct-icon rct-icon-check']");



    public void expandAllCheckbox(){
        driver.findElement(expandAllButton).click();

    }
    public void clickRandomCheckbox(){
        List<WebElement> allCheckboxes = driver.findElements(checkboxes);
        int count = 20;
        do {
            WebElement item = allCheckboxes.get((int) (Math.random() * 15)+1);
            item.click();
            count -= 1;
        }
        while (count != 0);

    }
    public void getCheckboxesNames(){
        List<WebElement> checkedElements = driver.findElements(checkedItem);
        String [] data = {};
        for (int i=0; i< checkedElements.size(); i++){
            String s = checkedElements.get(i).getText();
            data = append(data, s);
            System.out.println("text: "+ s);
        }


    }

}
