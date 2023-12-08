package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

public class AudioPostTest extends BaseTest {

    @Test
    public void audioPostTest() throws InterruptedException {
        app.click(app.menu.blog);
        app.click(app.blogSubMenu.postFormatsLink);
        app.click(app.postFormat.audioPostLink);

        Actions action = new Actions(driver);
        action.doubleClick(app.returnElement(app.audioPost.playPauseButton))
                .clickAndHold(app.returnElement(app.audioPost.timeSlider))
                .scrollByAmount(200,0)
                .release()
                .perform();

        action.clickAndHold(app.returnElement(app.audioPost.soundSlider))
                        .scrollByAmount(50,0)
                        .release()
                        .perform();
        
    }
}
