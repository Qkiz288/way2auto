package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToiFrame {
  public static void execute(WebDriver driver, WebElement iFrame) {
    driver.switchTo().frame(iFrame);
  }
}
