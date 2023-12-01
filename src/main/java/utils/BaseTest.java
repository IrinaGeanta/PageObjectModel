package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public BasePage app;
    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://keybooks.ro");

        app = new BasePage();
    }

    @AfterClass(alwaysRun = true)

    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        //driver.close(); // inchide tabu
        //driver.quit(); // inchide browseru
    }
}
