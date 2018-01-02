package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {

    public  HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.thefloow.flo:id/btn_agree")
    public static WebElement agreeButton;

    @FindBy(id = "com.thefloow.flo:id/tab_home")
    public static  WebElement homePage;

    @FindBy(id = "com.thefloow.flo:id/chrono_duration")
    public static WebElement durationValue;

    @FindBy(id = "com.thefloow.flo:id/text_view_mileage")
    public static WebElement milesValue;

    @FindBy(id = "com.thefloow.flo:id/btn_start")
    public static WebElement journeyStartButton;

    @FindBy(id = "com.thefloow.flo:id/btn_emergency")
    public static WebElement emergencyButton;

    @FindBy(id = "com.thefloow.flo:id/btn_feedback")
    public static WebElement feedback;

    @FindBy(id = "com.thefloow.flo:id/btn_stop")
    public static WebElement journeyStopButton;

    @FindBy(id = "android:id/message")
    public static WebElement noRecordJourneyMsg;

    @FindBy(id = "android:id/button1")
    public static WebElement noRecordJourneyOkMsg;

    @FindBy(id = "com.thefloow.flo:id/emergency_btn_breakdown")
    public static WebElement breakdown;

    @FindBy(id = "com.thefloow.flo:id/emergency_btn_accident")
    public static WebElement accident;

    @FindBy(id = "com.thefloow.flo:id/btn_call_now")
    public static WebElement emergencyCallAsst;
}
