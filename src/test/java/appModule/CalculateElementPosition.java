package appModule;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class CalculateElementPosition {
  public static Point execute(WebElement element) {
    int x = element.getLocation().getX();
    int y = element.getLocation().getY();
    Point position = new Point(x, y);
    return position;
  }
}
