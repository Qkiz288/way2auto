package appModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFromDropdown {
  public static void execute(WebElement dropdownElement, String visibleTextToBeSelected) {
    Select options = new Select(dropdownElement);
    options.selectByVisibleText(visibleTextToBeSelected);
  }
}
