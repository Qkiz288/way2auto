package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckOptionSelectedInDropdown {
  public static void execute(WebDriver driver, WebElement dropdownList, String expected) {
    Select select = new Select(dropdownList);
    WebElement selectedOption = select.getFirstSelectedOption();
    Assert.assertEquals(selectedOption.getText(), expected);
  }
}
