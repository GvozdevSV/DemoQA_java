package tests.element_tests;

import org.testng.annotations.Test;
import pages.pages_base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.Urls.TEST_BOX_DEMO_QA_PAGE;

public class TextBoxTests extends BaseTest {
@Test
    public void checkInputField(){
        basePage.open(TEST_BOX_DEMO_QA_PAGE);
        textBoxPage.assertInput();
        textBoxPage.feelAllFields();
    }
}
