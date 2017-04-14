package appModule;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CheckElementMovedOnlyVertically {
  public static void execute(WebElement element, Point oldPosition, int y) {
    int currentX = element.getLocation().getX();
    int currentY = element.getLocation().getY();
    Point currentPosition = new Point(currentX, currentY);
    Point desiredPosition = new Point(oldPosition.getX(), oldPosition.getY() + y);
    Assert.assertEquals(desiredPosition, currentPosition);
  }
}
