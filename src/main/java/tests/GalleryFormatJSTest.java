package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class GalleryFormatJSTest extends BaseTest {

    @Test
    public void galleryFormat(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String jsHover = "var obj = document.createEvent('MouseEvent');"
                + "obj.initMouseEvent('mouseover', true);"
                + "document.getElementsByClassName('sf-with-ul')[0].dispatchEvent(obj)";

        jse.executeScript(jsHover);

        //am vrut eu sa merg numa pe elemente identificate in consola dar se pare ca nu am putut scoate acel post format link, si nici galleryFormat ..
        jse.executeScript("arguments[0].click()",app.returnElement(app.blogSubMenu.postFormatsLink));

        jse.executeScript("arguments[0].scrollIntoView();arguments[0].click()",app.returnElement(app.postFormat.galleryFormatLink));
        jse.executeScript("document.getElementsByClassName('comment-form')[0].scrollIntoView()");
        String comment = "document.getElementsByName('comment')[0].value='comment:)" + Math.random() + "'";

        jse.executeScript(comment);
        jse.executeScript("document.getElementsByName('author')[0].value='Irina'");
        jse.executeScript("document.getElementsByName('email')[0].value='irina@email.com'");
        jse.executeScript("document.getElementsByName('url')[0].value='www.website.com'");
        //jse.executeScript("document.getElementsByClassName('comment-form')[0].submit"); // nu merse cu submit .. no ideea why, nici cu submit() .. si e identificat acel element cu tag form... no ideea

        jse.executeScript("document.getElementsByClassName('submit')[0].click()");


        String response = jse.executeScript("return document.getElementsByClassName('comment_not_approved')[0].childNodes[0].wholeText").toString();
        //aci wholeText asta nu m-am prins de el din consola .. pt ca la mine acel childNode[0] intorcea un string .. asa ca asa am folosit,
        //doar ca nu a mers ca imi introcea o gramada de atribute ..unul fiind acel wholeText .. nah .. la exemplu nostru era innerText .. asta n-avea

        assertEquals(response,"Your comment is awaiting moderation.");


    }
}
