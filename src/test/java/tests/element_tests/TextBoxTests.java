package tests.element_tests;

import org.testng.annotations.Test;
import pages.pages_base.BasePage;
import tests.base.BaseTest;

public class TextBoxTests extends BaseTest {
@Test
    public void checkInputField(){
        basePage.open("https://demoqa.com/text-box");
        textBoxPage.feelAllFields();
    }
}
