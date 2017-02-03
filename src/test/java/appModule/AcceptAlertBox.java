package appModule;

import org.openqa.selenium.WebDriver;

public class AcceptAlertBox {
  public static void execute(WebDriver driver) {
    driver.switchTo().alert().accept();
  }
}
