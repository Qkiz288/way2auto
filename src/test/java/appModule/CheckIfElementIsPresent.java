package appModule;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckIfElementIsPresent {
  public static void execute(WebDriver driver, WebElement elementToBeChecked) {
    Assert.assertTrue(elementToBeChecked.isDisplayed());
  }
}
