package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.FramesAndWindowsLocator;

public class FramesAndWindows {

  private static WebElement element = null;

  public static WebElement tab_OpenNewWindow(WebDriver driver) {
    element = driver.findElement(By.cssSelector(FramesAndWindowsLocator.CSS_OPEN_NEW_WINDOW_TAB));
    return element;
  }

  public static WebElement lnk_NewBrowserTab(WebDriver driver) {
    element = driver.findElement(By.cssSelector(FramesAndWindowsLocator.CSS_NEW_BROWSER_TAB_LNK));
    return element;
  }

  public static WebElement iframe_NewBrowserTab(WebDriver driver) {
    element = driver.findElement(By.cssSelector(FramesAndWindowsLocator.CSS_NEW_BROWSER_TAB_IFRAME));
    return element;
  }

  public static WebElement tab_OpenSeparateNewWindow(WebDriver driver) {
    element = driver.findElement(By.cssSelector(FramesAndWindowsLocator.CSS_OPEN_SEPARATE_NEW_WINDOW_TAB));
    return element;
  }

  public static WebElement iframe_OpenSeparateNewWindow(WebDriver driver) {
    element = driver.findElement(By.cssSelector(FramesAndWindowsLocator.CSS_OPEN_SEPARATE_NEW_WINDOW_TAB_IFRAME));
    return element;
  }

  public static WebElement lnk_OpenNewSeparateNewWindow(WebDriver driver) {
    element = driver.findElement(By.xpath(FramesAndWindowsLocator.XPATH_OPEN_SEPARATE_NEW_WINDOW_TAB_LNK));
    return element;
  }

}
