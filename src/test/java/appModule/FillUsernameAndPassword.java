package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.Index;

public class FillUsernameAndPassword {

  public static void execute(WebDriver driver, String username, String password) {
    Index.txtbx_Username(driver).sendKeys(username);
    Index.txtbx_Password(driver).sendKeys(password);
  }
}
