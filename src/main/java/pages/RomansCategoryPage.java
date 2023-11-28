package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class RomansCategoryPage extends SeleniumWrappers {

    public By getRomanBookLink(String bookName) {
        return By.xpath("//a[text()='" + bookName + "']");
    }
}
