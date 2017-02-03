package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.IndexLocator;

public class Index {

  private static WebElement element = null;
  private static List<WebElement> elements = null;

  public static WebElement lnk_Signin(WebDriver driver) {
    element = driver.findElement(By.xpath(IndexLocator.XPATH_SIGNIN_LNK));
    return element;
  }

  public static WebElement txtbx_Username(WebDriver driver) {
    element = driver.findElement(By.cssSelector(IndexLocator.CSS_USERNAME_TXTBX));
    return element;
  }

  public static WebElement txtbx_Password(WebDriver driver) {
    element = driver.findElement(By.cssSelector(IndexLocator.CSS_PASSWORD_TXTBX));
    return element;
  }

  public static WebElement btn_SubmitLogin(WebDriver driver) {
    element = driver.findElement(By.xpath(IndexLocator.XPATH_SUBMIT_LOGIN_BTN));
    return element;
  }

  public static WebElement lbl_TextToBePresent(WebDriver driver) {
    element = driver.findElement(By.xpath(IndexLocator.XPATH_TEXT_LBL));
    return element;
  }

  public static List<WebElement> box_WidgetSectionBoxes(WebDriver driver) {
    elements = driver.findElements(By.xpath(IndexLocator.XPATH_WIDGET_BOXES_BOX));
    return elements;
  }

  public static WebElement lbl_InvalidUsernameAndPassword(WebDriver driver) {
    element = driver.findElement(By.cssSelector(IndexLocator.CSS_INVALID_USERNAME_AND_PASSWORD_LBL));
    return element;
  }
}
