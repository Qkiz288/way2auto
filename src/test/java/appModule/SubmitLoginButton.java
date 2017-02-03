package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.Index;

public class SubmitLoginButton {
  public static void execute(WebDriver driver) {
    Index.btn_SubmitLogin(driver).click();
  }
}
