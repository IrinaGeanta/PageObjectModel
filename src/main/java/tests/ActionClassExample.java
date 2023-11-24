package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

public class ActionClassExample extends BaseTest {
   // @Test
    public void hoverExample() throws InterruptedException {
    app.hoverElement(app.menu.blog);
    Thread.sleep(2000);
    app.hoverElement(app.blogSubMenu.portfolioOption);
    Thread.sleep(2000);
    app.hoverElement(app.blogSubMenu.masonry);
    Thread.sleep(2000);
    app.hoverElement(app.menu.aboutLink);
    }

    @Test
    public void dragAndDropExample(){
        app.click(app.menu.shopLink);
        app.scrollVertically(350);
        app.dragAndDrop(app.shop.sliderInitialPosition, 100,0);
        app.dragAndDrop(app.shop.sliderFinalPosition,-100,0);
    }


}
