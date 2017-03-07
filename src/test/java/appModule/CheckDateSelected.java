package appModule;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDateSelected {
  public static void execute(WebDriver driver, WebElement elementToBeChecked, String expectedDate, Boolean expectedResult) {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(elementToBeChecked));
    String dateToBePresent = elementToBeChecked.getAttribute("value");
    Assert.assertEquals(dateToBePresent.equalsIgnoreCase(expectedDate), expectedResult);
  }
}
