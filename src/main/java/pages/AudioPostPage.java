package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers {
    public By playPauseButton = By.xpath("//div[contains(@class,'mejs-playpause-button')]");

    public By sliderAudio = By.xpath("//span[@class='mejs-time-handle']");
    public By timeSlider = By.xpath("//span[@role='slider']");

    public By soundSlider = By.xpath("//div[@class='mejs-horizontal-volume-current']");

    public By getSliderAudio(int pixels){
        //span[contains(@style,'left: 174px')]
        return By.xpath("span[contains(@style,'left: "+ pixels +"px')]");
    }

    public By timeSlider2min = By.xpath("//span[text() = '02:00']");

    public By audioSlider50percent = By.xpath("//a[@aria-valuetext='50%']");
}
