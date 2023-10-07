package pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
    private final By haveSelected = By.cssSelector("span[class=\"text-success\"]");

    public void expandAllCheckbox(){
        driver.findElement(expandAllButton).click();//раскрыть список всех чекбоксов
    }
    public void clickRandomCheckbox(){ //выбрать случайные чекбоксы
        List<WebElement> allCheckboxes = driver.findElements(checkboxes);
        int count = 15;
        do {
            WebElement item = allCheckboxes.get((int) (Math.random() * 7)+1);
            item.click();
            count -= 1;
        }
        while (count != 0);
    }
    public StringBuffer getCheckboxesNames() throws InterruptedException{//получить имена выбранных чекбоксов
        List<WebElement> checkedElements = driver.findElements(checkedItem);
        StringBuffer data = new StringBuffer();
        for (int i=
             0; i< checkedElements.size(); i++){
            WebElement f = checkedElements.get(i).findElement(By.xpath(".//ancestor::span[@class='rct-text']"));
            String s = f.getText();
            data.append(s.toLowerCase() + ' ');
        }
        return data;
    }
    public StringBuffer getSelectedText() throws InterruptedException {//получить список выбранных чексов из результата
        scrollToElement(driver.findElement(haveSelected));
        List<WebElement> selectedText = driver.findElements(haveSelected);
        StringBuffer data = new StringBuffer();
        for (int i=0; i< selectedText.size(); i++){
            String s = selectedText.get(i).getText();
            data.append(s + ' ');
        }
        return data;
    }
    public void assertInputOutput() throws InterruptedException {
        Assert.assertEquals(getCheckboxesNames().toString(), getSelectedText().toString(), "Выбранные чекбоксы и выходные данные равны");
    }
}
