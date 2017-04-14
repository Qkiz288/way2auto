package testsDraggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appModule.CalculateElementPosition;
import appModule.CheckElementMovedOnlyVertically;
import appModule.CheckElementMovedToDesiredPosition;
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

  @Test(dataProvider = "defaultOffsets")
  public void defaultFunctionality(int xOffset, int yOffset) {
    ClickButton.execute(Draggable.lnk_Default_Functionality(driver));
    SwitchToiFrame.execute(driver, Draggable.iframe_Default_Functionality(driver));
    draggableElementPosition = CalculateElementPosition.execute(Draggable.drg_Draggable_Element(driver));
    DragElement.executeOffsetDrag(driver, Draggable.drg_Draggable_Element(driver), xOffset, yOffset);
    CheckElementMovedToDesiredPosition.execute(Draggable.drg_Draggable_Element(driver), draggableElementPosition, xOffset, yOffset);
  }

  @Test(dataProvider = "defaultOffsets")
  public void constrainMovementVertical(int xOffset, int yOffset) {
    ClickButton.execute(Draggable.lnk_Constrain_Movement(driver));
    SwitchToiFrame.execute(driver, Draggable.iframe_Constrain_Movement(driver));
    draggableElementPosition = CalculateElementPosition.execute(Draggable.drg_Vertical_Drag_Element(driver));
    DragElement.executeOffsetDrag(driver, Draggable.drg_Vertical_Drag_Element(driver), xOffset, yOffset);
    CheckElementMovedOnlyVertically.execute(Draggable.drg_Vertical_Drag_Element(driver), draggableElementPosition, yOffset);
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

  @DataProvider
  public Object[][] defaultOffsets() {
    return new Object[][] { { -50, -30 }, { 50, 80 }, { 50, -20 }, { -30, 20 } };
  }

}
