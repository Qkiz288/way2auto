package appModule;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Demo_Page;

public class SelectDropdown {
  public static void execute(WebDriver driver) {
    int attemptsOnFindingDropdownElement = 0;
    while (attemptsOnFindingDropdownElement < 20) {
      try {
        waitForElementToBeVisible(driver);
        Demo_Page.DynamicElementsSection.box_Dropdown(driver).click();
        break;
      } catch (StaleElementReferenceException e) {
      }
      attemptsOnFindingDropdownElement++;
    }
  }

  private static void waitForElementToBeVisible(WebDriver driver) {
    new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(Demo_Page.DynamicElementsSection.box_Dropdown(driver)));
  }
}
