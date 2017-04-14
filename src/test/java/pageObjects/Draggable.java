package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.DraggableLocator;

public class Draggable {
  private static WebElement element = null;

  public static WebElement lnk_Default_Functionality(WebDriver driver) {
    element = driver.findElement(By.xpath(DraggableLocator.XPATH_DEFAULT_FUNCTIONALITY_LNK));
    return element;
  }

  public static WebElement iframe_Default_Functionality(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DraggableLocator.CSS_DEFAULT_FUNCTIONALITY_IFRAME));
    return element;
  }

  public static WebElement drg_Draggable_Element(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DraggableLocator.CSS_DRAGGABLE_ELEMENT));
    return element;
  }

  public static WebElement lnk_Constrain_Movement(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DraggableLocator.CSS_CONSTRAIN_MOVEMENT_LNK));
    return element;
  }

  public static WebElement iframe_Constrain_Movement(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DraggableLocator.CSS_CONSTRAIN_MOVEMENT_IFRAME));
    return element;
  }

  public static WebElement drg_Vertical_Drag_Element(WebDriver driver) {
    element = driver.findElement(By.xpath(DraggableLocator.XPATH_VERTICAL_DRAG_ELEMENT));
    return element;
  }
}
