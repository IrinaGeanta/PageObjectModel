package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.SeleniumWrappers;

public class SearchResultPage extends SeleniumWrappers {
    public By loadMoreResults = By.xpath("//span[text()='LOAD MORE']");
    public By storyAboutMeBookLink = By.xpath("(//a[text()='The story about me'])[1]");

    public By getbookPicture (String picture){
        return By.xpath("//div[contains(@data-image,'"+picture+"')]");
    }
    public void searchInSearchResult(By locator){

        while (isElementPresent(loadMoreResults)){
            if (isElementPresent(locator)){
                click(locator);
            }
            else {
                click(loadMoreResults);
            }
        }



    }

}
