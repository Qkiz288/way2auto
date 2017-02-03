package testsFramesAndWindows;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectFramesAndWindows;
import driver.Driver;
import url.URL;

public class FramesAndWindowsTest {
  private WebDriver driver;

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectFramesAndWindows.execute(driver);
  }

  @Test
  public void openNewWindow() {
    driver.manage().window().maximize(); // temporary code
    Assert.assertTrue(true);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }
}
