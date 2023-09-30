package tests.element_tests;

import org.testng.annotations.Test;
import pages.pages_base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.Urls.CHECK_BOX_DEMO_QA_PAGE;

public class CheckBoxTests extends BaseTest {
    @Test
    public void checkBoxTests(){
        basePage.open(CHECK_BOX_DEMO_QA_PAGE);
        checkBoxPage.expandAllCheckbox();
    }
}
