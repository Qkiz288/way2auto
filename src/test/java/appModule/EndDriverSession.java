package appModule;

import org.openqa.selenium.WebDriver;

public class EndDriverSession {
  public static void execute(WebDriver driver) {
    driver.quit();
  }
}
