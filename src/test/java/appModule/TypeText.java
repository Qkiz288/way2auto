package appModule;

import org.openqa.selenium.WebElement;

public class TypeText {
  public static void execute(WebElement textInputElement, String text) {
    textInputElement.sendKeys(text);
  }
}
