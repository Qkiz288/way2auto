package appModule;

import org.openqa.selenium.WebElement;

public class ClearField {
  public static void execute(WebElement elementToBeCleared) {
    elementToBeCleared.clear();
  }
}
