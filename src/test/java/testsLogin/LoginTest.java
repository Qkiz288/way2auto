package testsLogin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckTextPresent;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.LoginWithIncorrectCredentials;
import appModule.SelectDraggable;
import appModule.SwitchToSecondWindow;
import driver.Driver;
import pageObjects.Index;
import url.URL;

public class LoginTest {
  private WebDriver driver;

  private final String expectedTextAfterCorrectLogin = "Assignment 2: Count total number of boxes from below page",
      expectedTextAfterIncorrectLogin = "Invalid";

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.demo_URL);
  }

  @Test
  public void loginFromDemoPageWithCorrectCredentials() {
    SelectDraggable.execute(driver);
    SwitchToSecondWindow.execute(driver);
    LoginWithCorrectCredentials.execute(driver);
    CheckTextPresent.execute(driver, Index.lbl_TextToBePresent(driver), expectedTextAfterCorrectLogin);
  }

  @Test
  public void loginFromDemoPageWithIncorrectCredentials() {
    SelectDraggable.execute(driver);
    SwitchToSecondWindow.execute(driver);
    LoginWithIncorrectCredentials.execute(driver);
    CheckTextPresent.execute(driver, Index.lbl_InvalidUsernameAndPassword(driver), expectedTextAfterIncorrectLogin);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

}
