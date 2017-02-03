package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.Index;

public class SelectSignin {
  public static void execute(WebDriver driver) {
    Index.lnk_Signin(driver).click();
  }
}
