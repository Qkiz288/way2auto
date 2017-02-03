package locators;

public class IndexLocator {
  public static final String XPATH_SIGNIN_LNK = "//div[@class='fancybox-overlay fancybox-overlay-fixed']//form[@id='load_form']//a[@class='fancybox']",
      CSS_USERNAME_TXTBX = "#login>form>fieldset>input", CSS_PASSWORD_TXTBX = "#login>form>fieldset>input[name='password']",
      XPATH_SUBMIT_LOGIN_BTN = "//div[@class='fancybox-overlay fancybox-overlay-fixed']//input[@value='Submit']",
      XPATH_TEXT_LBL = "//div[@class='container margin-top-20']/div[1]/h1[2]",
      XPATH_WIDGET_BOXES_BOX = "//section[@id='wrapper']/div[2]/div[2]/div[2]/ul/li",
      CSS_INVALID_USERNAME_AND_PASSWORD_LBL = "p#alert1";
}
