package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CountTotalBoxesFromIndexPage {
  public static int execute(WebDriver driver) {
    int boxesCount = 0;
    for (int i = 1; i <= 6; i++) {
      boxesCount = boxesCount + driver.findElements(By.xpath("//section[@id='wrapper']/div[2]/div[2]/div[" + i + "]/ul/li")).size();
    }
    return boxesCount;
  }
}
