package tests.element_tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.WEB_TABLES_DEMO_QA_PAGE;

public class WebTablesTests extends BaseTest {
    @Test
    public void AddNewPersonTest() throws InterruptedException {
        basePage.open(WEB_TABLES_DEMO_QA_PAGE);
        webTablesPage.checkOutPerson();
        wait(300);

    }



}
