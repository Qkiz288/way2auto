package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.DropdownLocator;

public class Dropdown {

  private static WebElement element = null;
  private static List<WebElement> list = null;

  public static WebElement lbl_Dropdown(WebDriver driver) {
    element = driver.findElement(By.xpath(DropdownLocator.XPATH_DROPDOWN_LBL));
    return element;
  }

  public static WebElement drp_SelectCountry(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DropdownLocator.CSS_SELECT_COUNTRY_DRP));
    return element;
  }

  public static WebElement iframe_SelectCountry(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DropdownLocator.CSS_SELECT_COUNTRY_IFRAME));
    return element;
  }

  public static WebElement iframe_EnterCountry(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DropdownLocator.CSS_ENTER_COUNTRY_IFRAME));
    return element;
  }

  public static WebElement lnk_EnterCountry(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DropdownLocator.CSS_ENTER_COUNTRY_LNK));
    return element;
  }

  public static WebElement txtbx_EnterCountry(WebDriver driver) {
    element = driver.findElement(By.cssSelector(DropdownLocator.CSS_ENTER_COUNTRY_TXTBX));
    return element;
  }

  public static List<WebElement> list_EnterCountry(WebDriver driver) {
    list = driver.findElements(By.cssSelector(DropdownLocator.CSS_PROMPT_LIST));
    return list;
  }

}
