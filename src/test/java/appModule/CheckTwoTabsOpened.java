package appModule;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckTwoTabsOpened {

  public static void execute(WebDriver driver) {
    Set<String> windowHandles = driver.getWindowHandles();
    int amountOfWindowHandles = windowHandles.size();
    Assert.assertEquals(2, amountOfWindowHandles);
  }
}
