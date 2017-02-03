package appModule;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPromptPresent {
  public static void execute(WebDriver driver, List<WebElement> listOfPrompts, String expectedText) {

    Iterator<WebElement> i = listOfPrompts.iterator(); // Iterator which returns WebElements
    boolean valuePresent = false;
    while (i.hasNext()) {
      WebElement value = i.next();
      if (value.getText().contains(expectedText))
        valuePresent = true;
    }
    Assert.assertTrue(valuePresent);
  }
}
