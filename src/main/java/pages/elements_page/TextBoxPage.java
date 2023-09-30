package pages.elements_page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.pages_base.BasePage;


import static constants.Generator.Generate.*;



public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }
    //input field and button
    private final By inputFullNameField = By.cssSelector("input[id='userName']");
    private final By inputUserEmailField = By.cssSelector("input[id='userEmail']");
    private final By currentAddressField = By.cssSelector("textarea[id='currentAddress']");
    private final By permanentAddressField = By.cssSelector("textarea[id='permanentAddress']");
    private final By submitButton = By.cssSelector("button[id=\"submit\"]");
    //output text
    private final By nameText = By.cssSelector("p[id=\"name\"]");
    private final By emailText = By.cssSelector("p[id=\"email\"]");
    private final By currentAddressText = By.cssSelector("p[id=\"currentAddress\"]");
    private final By permanentAddressText = By.cssSelector("p[id=\"permanentAddress\"]");


    public TextBoxPage assertInput() {
        //Проверяем что элемент присутствует на странице
        WebElement fullName = driver.findElement(inputFullNameField);
        Assert.assertTrue(fullName.isDisplayed(), "Поле полное имя отсутствует на странице" );
        return this;

    }
    public TextBoxPage feelAllFields(){
        // Заполняем все поля
        driver.findElement(inputFullNameField).sendKeys(FULL_NAME);
        driver.findElement(inputUserEmailField).sendKeys(E_MAIL);
        driver.findElement(currentAddressField).sendKeys(CURRENT_ADDRESS);
        driver.findElement(permanentAddressField ).sendKeys(PERMANENT_ADDRESS);
        driver.findElement(submitButton).click();

        //Берем текст
        String outputName = driver.findElement(nameText).getText().split(":")[1];
        String outputEmail = driver.findElement(emailText).getText().split(":")[1];
        String outputCurrentAddress = driver.findElement(currentAddressText).getText().split(":")[1];
        String outputPermanentAddress = driver.findElement(permanentAddressText).getText().split(":")[1];

        //сверяем входные и выходные данные
        org.testng.Assert.assertEquals(FULL_NAME, outputName, "Имена не равны");
        org.testng.Assert.assertEquals(E_MAIL, outputEmail, "емейлы не равны");
        org.testng.Assert.assertEquals(CURRENT_ADDRESS, outputCurrentAddress, "куррент адреса не равны");
        org.testng.Assert.assertEquals(PERMANENT_ADDRESS, outputPermanentAddress, "перманент адреса не равны");
        return this;
    }
}
