package testsDropdown;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckOptionSelectedInDropdown;
import appModule.CheckPromptPresent;
import appModule.ClearField;
import appModule.ClickButton;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectDropdown;
import appModule.SelectOptionFromDropdown;
import appModule.SwitchToiFrame;
import appModule.TypeText;
import driver.Driver;
import pageObjects.Dropdown;
import url.URL;

public class DropdownTest {
  private WebDriver driver;
  public final String countryToBeSelected = "Poland", partialText = "Pol";

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectDropdown.execute(driver);
  }

  @Test
  public void selectElementFromDropdownList() {
    SwitchToiFrame.execute(driver, Dropdown.iframe_SelectCountry(driver));
    SelectOptionFromDropdown.execute(Dropdown.drp_SelectCountry(driver), countryToBeSelected);
    CheckOptionSelectedInDropdown.execute(driver, Dropdown.drp_SelectCountry(driver), countryToBeSelected);
  }

  @Test
  public void checkIsPromtCorrect() {
    ClickButton.execute(Dropdown.lnk_EnterCountry(driver));
    SwitchToiFrame.execute(driver, Dropdown.iframe_EnterCountry(driver));
    ClearField.execute(Dropdown.txtbx_EnterCountry(driver));
    TypeText.execute(Dropdown.txtbx_EnterCountry(driver), partialText);
    CheckPromptPresent.execute(driver, Dropdown.list_EnterCountry(driver), countryToBeSelected);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }
}
