package testsAlert;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.AcceptAlertBox;
import appModule.AcceptInputAlert;
import appModule.CheckTextPresent;
import appModule.ClickButton;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectAlert;
import appModule.SwitchToParentFrame;
import appModule.SwitchToiFrame;
import driver.Driver;
import pageObjects.AlertPO;
import url.URL;

public class AlertTest {
  private WebDriver driver;

  private final String inputTextForInputAlert = "Kamil",
      expectedTextForInputAlert = "Hello " + inputTextForInputAlert + "! How are you today?";

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectAlert.execute(driver);
  }

  @Test
  public void simpleAlert() {
    SwitchToiFrame.execute(driver, AlertPO.iframe_SimpleAlert(driver));
    ClickButton.execute(AlertPO.btn_SimpleAlertBox(driver));
    AcceptAlertBox.execute(driver);
    SwitchToParentFrame.execute(driver);
    ClickButton.execute(AlertPO.lnk_InputAlert(driver));
  }

  @Test
  public void inputAlert() {
    ClickButton.execute(AlertPO.lnk_InputAlert(driver));
    SwitchToiFrame.execute(driver, AlertPO.iframe_inputAlert(driver));
    ClickButton.execute(AlertPO.btn_InputAlertBox(driver));
    AcceptInputAlert.execute(driver, inputTextForInputAlert);
    CheckTextPresent.execute(driver, AlertPO.lbl_DisplayedText(driver), expectedTextForInputAlert);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

}
