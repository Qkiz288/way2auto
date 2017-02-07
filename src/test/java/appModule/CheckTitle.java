package appModule;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CheckTitle {
  public static void execute(WebDriver driver, String expectedTitle) {
    Assert.assertEquals(expectedTitle, driver.getTitle());
  }
}
