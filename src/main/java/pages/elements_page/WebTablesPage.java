package pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.pages_base.BasePage;

import static constants.Generator.Generate.*;

public class WebTablesPage extends BasePage {
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    //locators
    // input locators
    private final By addButton = By.cssSelector("button[id=\"addNewRecordButton\"]");
    private final By firstNameField = By.cssSelector("input[id=\"firstName\"]");
    private final By lastNameField = By.xpath("//input[@id=\"lastName\"]");
    private final By eMaileField = By.xpath("//input[@id=\"userEmail\"]");
    private final By ageField = By.xpath("//input[@id=\"age\"]");
    private final By salaryField = By.xpath("//input[@id=\"salary\"]");
    private final By departmentField = By.xpath("//input[@id=\"department\"]");
    private final By submitButton = By.cssSelector("button[id=\"submit\"]");



    public String AddNewPerson(){
        waitElementIsVisible(driver.findElement(addButton)).click();
        waitElementIsVisible(driver.findElement(firstNameField)).sendKeys(FIRST_NAME);
        waitElementIsVisible(driver.findElement(lastNameField)).sendKeys(LAST_NAME);
        waitElementIsVisible(driver.findElement(eMaileField)).sendKeys(E_MAIL);
        waitElementIsVisible(driver.findElement(ageField)).sendKeys(AGE);
        waitElementIsVisible(driver.findElement(salaryField)).sendKeys(SALARY);
        waitElementIsVisible(driver.findElement(departmentField)).sendKeys(DEPARTMENT);
        waitElementIsVisible(driver.findElement(submitButton)).click();
        System.out.println(FIRST_NAME + " " + LAST_NAME + " " + E_MAIL + " " + AGE + " " + SALARY + " " + DEPARTMENT);
        return FIRST_NAME + " " + LAST_NAME + " " + E_MAIL + " " + AGE + " " + SALARY + " " + DEPARTMENT;








    }
}
