package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.IndexLocator;

public class LoginWithCorrectCredentials {
  private static final String USERNAME = "qkiz288", PASSWORD = "password";

  public static void execute(WebDriver driver) {
    SelectSignin.execute(driver);
    FillUsernameAndPassword.execute(driver, USERNAME, PASSWORD);
    SubmitLoginButton.execute(driver);
    waitForPageToLoad(driver);
  }

  private static void waitForPageToLoad(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 2);
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(IndexLocator.OVERLAY_LOGIN_OVERLAY)));
  }
}
