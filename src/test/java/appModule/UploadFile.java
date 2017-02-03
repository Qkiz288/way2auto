package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadFile {
  public static void execute(WebDriver driver, WebElement uploadButton, String fileName) {
    uploadButton.sendKeys(System.getProperty("user.dir") + "src\\test\\resources\\testFiles\\" + fileName);
  }
}
