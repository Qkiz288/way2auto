package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

  private WebDriver driver;

  private enum browsers {
    CHROME, FIREFOX
  };

  private WebDriver setBrowser(browsers nameOfBrowser) {

    switch (nameOfBrowser) {
    case FIREFOX: {
      System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
      break;
    case CHROME: {
      System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
    }
      break;
    }
    return driver;
  }

  public WebDriver setDriver() {
    driver = setBrowser(browsers.CHROME);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }

}
