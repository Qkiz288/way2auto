package appModule;

import org.openqa.selenium.WebDriver;

public class LoginWithIncorrectCredentials {
  private static final String USERNAME = "qkiz28", PASSWORD = "pasword";

  public static void execute(WebDriver driver) {
    SelectSignin.execute(driver);
    FillUsernameAndPassword.execute(driver, USERNAME, PASSWORD);
    SubmitLoginButton.execute(driver);
  }
}
