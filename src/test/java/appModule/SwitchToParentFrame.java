package appModule;

import org.openqa.selenium.WebDriver;

public class SwitchToParentFrame {
  public static void execute(WebDriver driver) {
    driver.switchTo().parentFrame();
  }
}
