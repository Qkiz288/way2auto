package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.DatepickerLocator;

public class Datepicker {

  private static WebElement element = null;

  public static WebElement tab_DefaultFunctionality(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DatepickerLocator.CSS_DEFAULT_FUNCTIONALITY_TAB));
    return element;
  }

  public static WebElement iframe_DefaultFunctionality(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DatepickerLocator.CSS_DEFAULT_FUNCTIONALITY_IFRAME));
    return element;
  }

  public static WebElement input_DefaultDatepicker(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DatepickerLocator.CSS_DEFAULT_DATEPICKER_INPUT));
    return element;
  }

  public static WebElement div_DatePicker(WebDriver driver) {
    element = driver.findElement(By.xpath(DatepickerLocator.XPATH_DATEPICKER_WIDGET));
    return element;
  }
}
