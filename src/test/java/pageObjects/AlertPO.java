package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.AlertLocator;

public class AlertPO {
  private static WebElement element;

  public static WebElement iframe_SimpleAlert(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_SIMPLE_ALERT_IFRAME));
    return element;
  }

  public static WebElement btn_SimpleAlertBox(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_SIMPLE_ALERT_BOX_BTN));
    return element;
  }

  public static WebElement lnk_InputAlert(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_INPUT_ALERT_LNK));
    return element;
  }

  public static WebElement iframe_inputAlert(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_INPUT_ALERT_IFRAME));
    return element;
  }

  public static WebElement btn_InputAlertBox(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_INPUT_ALERT_BOX_BTN));
    return element;
  }

  public static WebElement lbl_DisplayedText(WebDriver driver) {
    element = driver.findElement(By.cssSelector(AlertLocator.CSS_INPUT_ALERT_TEXT_LBL));
    return element;
  }

}
