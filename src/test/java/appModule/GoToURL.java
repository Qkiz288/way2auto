package appModule;

import org.openqa.selenium.WebDriver;

public class GoToURL {
  public static void execute(WebDriver driver, String URL) {
    driver.get(URL);
  }
}
