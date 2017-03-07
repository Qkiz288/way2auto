package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PickDate {

  public static void execute(WebDriver driver, String cssLocator, String date) { // http://www.qa-courses.com/jak-wstawic-date-w-jquery-datepicke
    new WebDriverWait(driver, 3000).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(cssLocator))));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript(String.format("$('%s').datepicker('setDate','%s')", cssLocator, date));
  }

}
