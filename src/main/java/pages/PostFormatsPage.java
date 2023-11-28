package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class PostFormatsPage extends SeleniumWrappers {
    public By searchField = By.cssSelector("aside>form>input[class='search_field']");
}
