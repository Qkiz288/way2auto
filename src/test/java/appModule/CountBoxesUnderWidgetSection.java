package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.Index;

public class CountBoxesUnderWidgetSection {
  public static int execute(WebDriver driver) {
    int boxesCount = Index.box_WidgetSectionBoxes(driver).size();
    return boxesCount;
  }
}
