package locators;

public class DropdownLocator {
  public static final String XPATH_DROPDOWN_LBL = "//h1[contains(text(),'Dropdown')]", CSS_SELECT_COUNTRY_DRP = "html>body>select",
      CSS_SELECT_COUNTRY_IFRAME = "iframe[src='dropdown/default.html']",
      CSS_ENTER_COUNTRY_IFRAME = "iframe[src='dropdown/default1.html']", CSS_ENTER_COUNTRY_LNK = "a[href='#example-1-tab-2']",
      CSS_ENTER_COUNTRY_TXTBX = "body>div>span>input", CSS_PROMPT_LIST = "body>ul>li";
}
