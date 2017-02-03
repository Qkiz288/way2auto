package testsRegistration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.CheckIfMultipleElementsArePresent;
import appModule.CheckTextboxEmpty;
import appModule.ClickButton;
import appModule.EndDriverSession;
import appModule.GoToURL;
import appModule.LoginWithCorrectCredentials;
import appModule.SelectOptionFromDropdown;
import appModule.SelectRegistration;
import appModule.TypeText;
import appModule.UploadFile;
import driver.Driver;
import pageObjects.Registration;
import url.URL;

public class RegistrationTest {
  private WebDriver driver;
  private final String firstName = "Tom", lastName = "Thomson", country = "India", month = "1", day = "1", year = "2014",
      phoneNumber = "0123456789", username = "Harvester", email = "abc@mail.com", fileName = "pic.png",
      aboutYourself = "I'm a software tester :)", password = "password", confirmPassword = "password";

  @BeforeMethod
  public void initialize() {
    driver = new Driver().setDriver();
    GoToURL.execute(driver, URL.index_URL);
    LoginWithCorrectCredentials.execute(driver);
    SelectRegistration.execute(driver);
  }

  @Test
  public void validRegistrationWithAllDataCorrect() {
    TypeText.execute(Registration.txtbx_FirstName(driver), firstName);
    TypeText.execute(Registration.txtbx_LastName(driver), lastName);
    ClickButton.execute(Registration.MartialStatus.rdbtn_Divorced(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Dance(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Reading(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Cricket(driver));
    SelectOptionFromDropdown.execute(Registration.drp_Country(driver), country);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Month(driver), month);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Day(driver), day);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Year(driver), year);
    TypeText.execute(Registration.txtbx_Phone(driver), phoneNumber);
    TypeText.execute(Registration.txtbx_Username(driver), username);
    TypeText.execute(Registration.txtbx_Email(driver), email);
    UploadFile.execute(driver, Registration.btn_ProfilePicture(driver), fileName);
    TypeText.execute(Registration.txtbx_AboutYourself(driver), aboutYourself);
    TypeText.execute(Registration.txtbx_Password(driver), password);
    TypeText.execute(Registration.txtbx_ConfirmPassword(driver), confirmPassword);
    ClickButton.execute(Registration.btn_Submit(driver));
    CheckTextboxEmpty.execute(Registration.txtbx_FirstName(driver));
  }

  @Test
  public void invalidRegistrationWithoutName() {
    ClickButton.execute(Registration.MartialStatus.rdbtn_Divorced(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Dance(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Reading(driver));
    ClickButton.execute(Registration.Hobby.chkbx_Cricket(driver));
    SelectOptionFromDropdown.execute(Registration.drp_Country(driver), country);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Month(driver), month);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Day(driver), day);
    SelectOptionFromDropdown.execute(Registration.DateOfBirth.drp_Year(driver), year);
    TypeText.execute(Registration.txtbx_Phone(driver), phoneNumber);
    TypeText.execute(Registration.txtbx_Username(driver), username);
    TypeText.execute(Registration.txtbx_Email(driver), email);
    UploadFile.execute(driver, Registration.btn_ProfilePicture(driver), fileName);
    TypeText.execute(Registration.txtbx_AboutYourself(driver), aboutYourself);
    TypeText.execute(Registration.txtbx_Password(driver), password);
    TypeText.execute(Registration.txtbx_ConfirmPassword(driver), confirmPassword);
    ClickButton.execute(Registration.btn_Submit(driver));
    CheckTextboxEmpty.execute(Registration.txtbx_FirstName(driver));
    CheckIfMultipleElementsArePresent.execute(driver, Registration.lbl_FieldRequired(driver));
  }

  @AfterMethod
  public void tearDown() {
    EndDriverSession.execute(driver);
  }

}
