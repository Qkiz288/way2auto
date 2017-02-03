package testsBoxesClick;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckTextPresent;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectDropdown;
import driver.Driver;
import pageObjects.Dropdown;
import url.URL;

public class OpenDropdownTest {

  private String expectedTextInDropdownHeader = "Dropdown";

  private WebDriver driver;

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
  }

  @Test
  public void openDropdownSection() {
    SelectDropdown.execute(driver);
    CheckTextPresent.execute(driver, Dropdown.lbl_Dropdown(driver), expectedTextInDropdownHeader);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }
}
