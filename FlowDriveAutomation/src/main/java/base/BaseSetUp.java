package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ExcelUtil;

import java.net.URL;

public class BaseSetUp {


    public static AndroidDriver driver;
    Dimension size;

    public void swipeHorizontal() throws InterruptedException {
        size = driver.manage().window().getSize();

        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);
    }

    public  void launch() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "emulator-5554");


        capabilities.setCapability("appPackage", "com.thefloow.flo");
        capabilities.setCapability("appActivity", "com.thefloow.flo.activity.LauncherActivity");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );

        ExcelUtil.setExcelFile("src/main/resources/TestData.xlsx","TestData");

    }

    public void closeDriver () {
        driver.quit();
    }
}




