package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ExcelUtils;

public class LoginExcelTest extends BaseTest {

    @DataProvider(name = "LoginExcel")
    public Object[][] loginData() {
        String excelPath = ConfigReader.get("excelPath");
        String sheetName = ConfigReader.get("excelSheet");

        return ExcelUtils.readExcel(excelPath, sheetName);
    }

    @Test(dataProvider = "LoginExcel")
    public void loginTest(String username, String password, String expectedMessage) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        String actualError = loginPage.getErrorMessage();

        Assert.assertEquals(actualError, expectedMessage);
        System.out.println("Actual message: " + actualError + "\n" + "Expected message: " + expectedMessage);
    }
}
