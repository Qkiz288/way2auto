package appModule;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckCount {
  public static void execute(WebDriver driver, int expected, int result) {
    Assert.assertEquals(expected, result);
  }
}
