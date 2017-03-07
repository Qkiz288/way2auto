package testsDatepicker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appModule.CheckDateSelected;
import appModule.ClickButton;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.PickDate;
import appModule.SelectDatepicker;
import appModule.SwitchToiFrame;
import driver.Driver;
import locators.DatepickerLocator;
import pageObjects.Datepicker;
import url.URL;

public class DatepickerTest {

  private static WebDriver driver;

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectDatepicker.execute(driver);
  }

  @Test(dataProvider = "dates")
  public void defaultFunctionality(String date, Boolean expectedResult) {
    ClickButton.execute(Datepicker.tab_DefaultFunctionality(driver));
    SwitchToiFrame.execute(driver, Datepicker.iframe_DefaultFunctionality(driver));
    ClickButton.execute(Datepicker.input_DefaultDatepicker(driver));
    PickDate.execute(driver, DatepickerLocator.CSS_DEFAULT_DATEPICKER_INPUT, date);
    CheckDateSelected.execute(driver, Datepicker.input_DefaultDatepicker(driver), date, expectedResult);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

  @DataProvider
  public Object[][] dates() {
    return new Object[][] { { "02/30/2004", false }, { "10/25/2005", true }, { "01/29/2000", true } };
  }
}
