package testsDraggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appModule.CalculateElementPosition;
import appModule.CheckElementPosition;
import appModule.ClickButton;
import appModule.DragElement;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectDraggable;
import appModule.SwitchToiFrame;
import driver.Driver;
import pageObjects.Draggable;
import url.URL;

public class DraggableTest {

  private static WebDriver driver;
  private static Point draggableElementPosition;

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectDraggable.execute(driver);
  }

  @Test(dataProvider = "offsets")
  public void defaultFunctionality(int xOffset, int yOffset) {
    ClickButton.execute(Draggable.lnk_Default_Functionality(driver));
    SwitchToiFrame.execute(driver, Draggable.iframe_Default_Functionality(driver));
    draggableElementPosition = CalculateElementPosition.execute(Draggable.drg_Draggable_Element(driver));
    DragElement.executeOffsetDrag(driver, Draggable.drg_Draggable_Element(driver), xOffset, yOffset);
    CheckElementPosition.execute(Draggable.drg_Draggable_Element(driver), draggableElementPosition, xOffset, yOffset);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

  @DataProvider
  public Object[][] offsets() {
    return new Object[][] { { 50, 80 }, { -65, -90 }, { 50, -200 }, { -300, 20 } };
  }

}
