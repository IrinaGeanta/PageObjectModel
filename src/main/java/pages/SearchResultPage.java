package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class SearchResultPage extends SeleniumWrappers {
    public By loadMoreResults = By.xpath("//span[text()='LOAD MORE']");
    public By storyAboutMeBookLink = By.xpath("(//a[text()='The story about me'])[1]");

    public By getbookPicture (String picture){
        return By.xpath("//div[contains(@data-image,'"+picture+"')]");
    }


}
