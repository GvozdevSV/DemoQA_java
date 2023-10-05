package tests.element_tests;

import org.testng.annotations.Test;
import pages.pages_base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.Urls.RADIO_BUTTON_DEMO_QA_PAGE;

public class RadioButtonTests extends BaseTest {
    @Test
    public void RadioButtonTest(){
        basePage.open(RADIO_BUTTON_DEMO_QA_PAGE);
        radioButtonPage.clickRadio();

    }
}
