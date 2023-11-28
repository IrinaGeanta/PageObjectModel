package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class ContactPage extends SeleniumWrappers {

    public By nameField = By.cssSelector("input[name='your-name']");
    public By zoomInMap = By.xpath("//button[@title='Zoom in']");
    public By zoomOutMap = By.xpath("//button[@title='Zoom out']");
    public By frame = By.tagName("iframe");


    public void zoomMap(By locator){
        driver.switchTo().frame(returnElement(frame));
        click(locator);
    }
}
