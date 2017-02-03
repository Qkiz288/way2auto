package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.RegistrationLocator;

public class Registration {
  private static WebElement element = null;
  private static List<WebElement> elements = null;

  public static WebElement txtbx_FirstName(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_FIRST_NAME_TXTBX));
    return element;
  }

  public static WebElement txtbx_LastName(WebDriver driver) {
    element = driver.findElement(By.xpath(RegistrationLocator.XPATH_LAST_NAME_TXTBX));
    return element;
  }

  public static class MartialStatus {
    public static WebElement rdbtn_Single(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_MARTIAL_STATUS_SINGLE_RDBTN));
      return element;
    }

    public static WebElement rdbtn_Married(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_MARTIAL_STATUS_MARRIED_RDBTN));
      return element;
    }

    public static WebElement rdbtn_Divorced(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_MARTIAL_STATUS_DIVORCED_RDBTN));
      return element;
    }
  }

  public static class Hobby {
    public static WebElement chkbx_Dance(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_DANCE_HOBBY_CHKBX));
      return element;
    }

    public static WebElement chkbx_Reading(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_READING_HOBBY_CHKBX));
      return element;
    }

    public static WebElement chkbx_Cricket(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_CRICKET_HOBBY_CHKBX));
      return element;
    }
  }

  public static WebElement drp_Country(WebDriver driver) {
    element = driver.findElement(By.xpath(RegistrationLocator.XPATH_COUNTRY_DRP));
    return element;
  }

  public static class DateOfBirth {
    public static WebElement drp_Month(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_DATE_OF_BIRTH_MONTH_DRP));
      return element;
    }

    public static WebElement drp_Day(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_DATE_OF_BIRTH_DAY_DRP));
      return element;
    }

    public static WebElement drp_Year(WebDriver driver) {
      element = driver.findElement(By.xpath(RegistrationLocator.XPATH_DATE_OF_BIRTH_YEAR_DRP));
      return element;
    }
  }

  public static WebElement txtbx_Phone(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_PHONE_NUMBER_TXTBX));
    return element;
  }

  public static WebElement txtbx_Username(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_USERNAME_TXTBX));
    return element;
  }

  public static WebElement txtbx_Email(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_EMAIL_TXTBX));
    return element;
  }

  public static WebElement btn_ProfilePicture(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_PROFILE_PICTURE_BTN));
    return element;
  }

  public static WebElement txtbx_AboutYourself(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_ABOUT_YOURSELF_TXTBX));
    return element;
  }

  public static WebElement txtbx_Password(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_PASSWORD_TXTBX));
    return element;
  }

  public static WebElement txtbx_ConfirmPassword(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_CONFIRM_PASSWORD_TXTBX));
    return element;
  }

  public static WebElement btn_Submit(WebDriver driver) {
    element = driver.findElement(By.cssSelector(RegistrationLocator.CSS_SUBMIT_BTN));
    return element;
  }

  public static List<WebElement> lbl_FieldRequired(WebDriver driver) {
    elements = driver.findElements(By.cssSelector(RegistrationLocator.CSS_FIELD_REQUIRED_LBL));
    return elements;
  }
}
