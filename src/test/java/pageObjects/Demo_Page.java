package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Demo_PageLocator;

public class Demo_Page {
  private static WebElement element = null;

  public static class InteractionSection {

    public static WebElement box_Draggable(WebDriver driver) {
      element = driver.findElement(By.xpath(Demo_PageLocator.XPATH_DRAGGABLE_BOX));
      return element;
    }
  }

  public static class WidgetSection {

    public static WebElement box_Datepicker(WebDriver driver) {
      element = driver.findElement(By.cssSelector(Demo_PageLocator.CSS_DATEPICKER_BOX));
      return element;
    }
  }

  public static WebElement box_FramesAndWindows(WebDriver driver) {
    element = driver.findElement(By.cssSelector(Demo_PageLocator.CSS_FRAMES_AND_WINDOWS_BOX));
    return element;
  }

  public static class DynamicElementsSection {

    public static WebElement box_Dropdown(WebDriver driver) {
      element = driver.findElement(By.xpath(Demo_PageLocator.XPATH_DROPDOWN_BOX));
      return element;
    }
  }

  public static class RegistrationSection {
    public static WebElement box_Registration(WebDriver driver) {
      element = driver.findElement(By.cssSelector(Demo_PageLocator.CSS_REGISTRATION_BOX));
      return element;
    }
  }

  public static class AlertSection {

    public static WebElement box_Alert(WebDriver driver) {
      element = driver.findElement(By.xpath(Demo_PageLocator.XPATH_ALERT_BOX));
      return element;
    }
  }

}
