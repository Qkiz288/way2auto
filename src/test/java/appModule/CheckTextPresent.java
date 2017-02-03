package appModule;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckTextPresent {
  public static void execute(WebDriver driver, WebElement elementToBeChecked, String expected) {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(elementToBeChecked));
    String textToBePresent = elementToBeChecked.getText();
    Assert.assertTrue(textToBePresent.contains(expected));
  }
}
