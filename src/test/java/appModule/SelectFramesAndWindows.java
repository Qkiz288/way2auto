package appModule;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Demo_Page;

public class SelectFramesAndWindows {
  public static void execute(WebDriver driver) {
    int attemptsOnFindingDraggableElement = 0;
    while (attemptsOnFindingDraggableElement < 20) {
      try {
        waitForElementToBeVisible(driver);
        Demo_Page.box_FramesAndWindows(driver).click();
        break;
      } catch (StaleElementReferenceException e) {
      }
      attemptsOnFindingDraggableElement++;
    }
  }

  private static void waitForElementToBeVisible(WebDriver driver) {
    new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(Demo_Page.box_FramesAndWindows(driver)));
  }
}
