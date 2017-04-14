package appModule;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CheckElementMovedToDesiredPosition {
  public static void execute(WebElement element, Point oldPosition, int x, int y) {
    int currentX = element.getLocation().getX();
    int currentY = element.getLocation().getY();
    Point currentPosition = new Point(currentX, currentY);
    Point desiredPosition = new Point(oldPosition.getX() + x, oldPosition.getY() + y);
    Assert.assertEquals(currentPosition, desiredPosition);
  }
}
