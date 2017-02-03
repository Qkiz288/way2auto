package appModule;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckIfMultipleElementsArePresent {
  public static void execute(WebDriver driver, List<WebElement> elementsToBeChecked) {
    Assert.assertFalse(elementsToBeChecked.isEmpty());
  }
}
