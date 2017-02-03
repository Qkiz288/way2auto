package appModule;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToSecondWindow {
  public static void execute(WebDriver driver) {
    String mainWindow = driver.getWindowHandle();
    Set<String> windowHandles = driver.getWindowHandles();
    for (String handle : windowHandles) {
      if (handle != mainWindow)
        driver.switchTo().window(handle);
    }
  }
}
