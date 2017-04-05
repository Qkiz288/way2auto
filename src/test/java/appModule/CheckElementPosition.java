package appModule;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CheckElementPosition {
  public static void execute(WebElement element, Point oldPosition, int x, int y) {
    int actualX = element.getLocation().getX();
    int actualY = element.getLocation().getY();
    Point actualPosition = new Point(actualX, actualY);
    Point newPosition = new Point(oldPosition.getX() + x, oldPosition.getY() + y);
    Assert.assertEquals(actualPosition, newPosition);
  }
}
