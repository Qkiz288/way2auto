package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragElement {
  public static void executeOffsetDrag(WebDriver driver, WebElement draggedElement, int x, int y) {
    Actions drag = new Actions(driver);
    drag.clickAndHold(draggedElement).moveByOffset(x, y).release().build().perform();
  }

}
