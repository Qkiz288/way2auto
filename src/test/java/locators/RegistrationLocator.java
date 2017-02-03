package locators;

public class RegistrationLocator {
  public static final String CSS_FIRST_NAME_TXTBX = "input[name='name']",
      XPATH_LAST_NAME_TXTBX = "//form[@id='register_form']/fieldset/p[2]/input",
      XPATH_MARTIAL_STATUS_SINGLE_RDBTN = "//label[contains(text(),'Single')]",
      XPATH_MARTIAL_STATUS_MARRIED_RDBTN = "//label[contains(text(),'Married')]",
      XPATH_MARTIAL_STATUS_DIVORCED_RDBTN = "//label[contains(text(),'Divorced')]",
      XPATH_DANCE_HOBBY_CHKBX = "//fieldset[@class='fieldset padding-bottom']/div/label[1]/input",
      XPATH_READING_HOBBY_CHKBX = "//fieldset[@class='fieldset padding-bottom']/div/label[2]/input",
      XPATH_CRICKET_HOBBY_CHKBX = "//fieldset[@class='fieldset padding-bottom']/div/label[3]/input",
      XPATH_COUNTRY_DRP = "//form[@id='register_form']/fieldset[4]/select",
      XPATH_DATE_OF_BIRTH_MONTH_DRP = "//form[@id='register_form']/fieldset[5]/div/select",
      XPATH_DATE_OF_BIRTH_DAY_DRP = "//form[@id='register_form']/fieldset[5]/div[2]/select",
      XPATH_DATE_OF_BIRTH_YEAR_DRP = "//form[@id='register_form']/fieldset[5]/div[3]/select",
      CSS_PHONE_NUMBER_TXTBX = "input[name='phone']", CSS_USERNAME_TXTBX = "input[name='username']",
      CSS_EMAIL_TXTBX = "input[name='email']", CSS_PROFILE_PICTURE_BTN = "input[type='file']",
      CSS_ABOUT_YOURSELF_TXTBX = "#register_form>fieldset>textarea", CSS_PASSWORD_TXTBX = "input[type='password'][name='password']",
      CSS_CONFIRM_PASSWORD_TXTBX = "input[type='password'][name='c_password']",
      CSS_SUBMIT_BTN = "input[type='submit'][value='submit']", CSS_FIELD_REQUIRED_LBL = "label[class='error_p']";
}
