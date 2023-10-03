package tests.element_tests;

import org.testng.annotations.Test;
import pages.pages_base.BasePage;
import tests.base.BaseTest;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static constants.Constant.Urls.CHECK_BOX_DEMO_QA_PAGE;

public class CheckBoxTests extends BaseTest {
    @Test
    public void checkBoxTests() throws InterruptedException {
        basePage.open(CHECK_BOX_DEMO_QA_PAGE);
        checkBoxPage.expandAllCheckbox();
        checkBoxPage.clickRandomCheckbox();
        checkBoxPage.getCheckboxesNames();
        TimeUnit.SECONDS.sleep(5);
        checkBoxPage.getSelectedText();
        TimeUnit.SECONDS.sleep(5);
    }
}
