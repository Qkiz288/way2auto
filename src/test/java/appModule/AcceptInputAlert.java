package appModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AcceptInputAlert {
  public static void execute(WebDriver driver) {
    driver.switchTo().alert().accept();
  }

  public static void execute(WebDriver driver, String text) {
    Alert alert = driver.switchTo().alert();
    alert.sendKeys(text);
    alert.accept();
  }
}
