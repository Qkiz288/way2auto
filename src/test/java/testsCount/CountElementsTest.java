package testsCount;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckCount;
import appModule.CountBoxesUnderWidgetSection;
import appModule.CountTotalBoxesFromIndexPage;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import driver.Driver;
import url.URL;

public class CountElementsTest {

  private WebDriver driver;
  private final int totalNumberOfBoxes = 17, numberOfWidgetSectionBoxes = 7;

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
  }

  @Test
  public void countTotalBoxes() {
    CheckCount.execute(driver, totalNumberOfBoxes, CountTotalBoxesFromIndexPage.execute(driver));
  }

  @Test
  public void countWidgetBoxes() {
    CheckCount.execute(driver, numberOfWidgetSectionBoxes, CountBoxesUnderWidgetSection.execute(driver));
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

}
