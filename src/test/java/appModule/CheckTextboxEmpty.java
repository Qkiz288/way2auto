package appModule;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CheckTextboxEmpty {
  public static void execute(WebElement elementToBeChecked) {
    Assert.assertTrue(elementToBeChecked.getText().equalsIgnoreCase(""));
  }
}
