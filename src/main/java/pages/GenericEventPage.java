package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class GenericEventPage extends SeleniumWrappers {
    public By largerMapLink = By.partialLinkText("map");

    public By iFrameElement = By.tagName("iframe");

    public void clickLargerMap(){
        driver.switchTo().frame(returnElement(iFrameElement));
        click(largerMapLink);
        driver.switchTo().defaultContent();
    }
}
