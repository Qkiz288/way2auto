package locators;

public class DraggableLocator {
  public static final String XPATH_DEFAULT_FUNCTIONALITY_LNK = "//a[contains(text(),'Default functionality')]",
      CSS_DEFAULT_FUNCTIONALITY_IFRAME = "iframe[src*='default.html']", CSS_DRAGGABLE_ELEMENT = "div#draggable",
      CSS_CONSTRAIN_MOVEMENT_LNK = "a[href*='1-tab-2']", CSS_CONSTRAIN_MOVEMENT_IFRAME = "iframe[src*='default2.html']",
      XPATH_VERTICAL_DRAG_ELEMENT = "//p[contains(text(),'vertically')]";
}
