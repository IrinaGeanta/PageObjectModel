package utils;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    public static void screenshot(WebDriver driver){
        TakesScreenshot file = (TakesScreenshot) driver;
        File picture = file.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyy.mm.dd.mm.ss").format(new Date());

        try {
            Files.copy(picture, new File("poze/" + timestamp + ".png"));
        } catch(IOException e){
            System.out.println("Picture can not be saved");
        }

    }
}
