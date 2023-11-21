package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class SearchResultPage extends SeleniumWrappers {

    public By getbookPicture (String picture){
        return By.xpath("//div[contains(@data-image,'"+picture+"')]");
    }
}
