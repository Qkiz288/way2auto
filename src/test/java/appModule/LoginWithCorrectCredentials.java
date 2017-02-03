package appModule;

import org.openqa.selenium.WebDriver;

public class LoginWithCorrectCredentials {
  private static final String USERNAME = "qkiz288", PASSWORD = "password";

  public static void execute(WebDriver driver) {
    SelectSignin.execute(driver);
    FillUsernameAndPassword.execute(driver, USERNAME, PASSWORD);
    SubmitLoginButton.execute(driver);
  }
}
