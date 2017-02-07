package testsFramesAndWindows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckTitle;
import appModule.ClickButton;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectFramesAndWindows;
import appModule.SwitchToSecondWindow;
import appModule.SwitchToiFrame;
import driver.Driver;
import pageObjects.FramesAndWindows;
import url.URL;

public class FramesAndWindowsTest {
  private WebDriver driver;
  private final String expectedNewTabTitle = "jQuery UI Datepicker - Default functionality",
      expectedNewWindowTitle = "Open New Seprate Window";

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectFramesAndWindows.execute(driver);
  }

  @Test
  public void openNewWindow() {
    ClickButton.execute(FramesAndWindows.tab_OpenNewWindow(driver));
    SwitchToiFrame.execute(driver, FramesAndWindows.iframe_NewBrowserTab(driver));
    ClickButton.execute(FramesAndWindows.lnk_NewBrowserTab(driver));
    SwitchToSecondWindow.execute(driver);
    CheckTitle.execute(driver, expectedNewTabTitle);
  }

  @Test
  public void openSeparateNewWindow() {
    ClickButton.execute(FramesAndWindows.tab_OpenSeparateNewWindow(driver));
    SwitchToiFrame.execute(driver, FramesAndWindows.iframe_OpenSeparateNewWindow(driver));
    ClickButton.execute(FramesAndWindows.lnk_OpenNewSeparateNewWindow(driver));
    SwitchToSecondWindow.execute(driver);
    CheckTitle.execute(driver, expectedNewWindowTitle);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }
}
