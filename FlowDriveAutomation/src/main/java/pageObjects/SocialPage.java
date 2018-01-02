package pageObjects;

import base.BaseSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialPage extends BaseSetUp{

    public SocialPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.thefloow.flo:id/tab_social")
    public static WebElement social;

    @FindBy(id = "com.thefloow.flo:id/social_screen_name")
    public static WebElement socialScreenName;

    @FindBy(id = "com.thefloow.flo:id/btn_getting_started_next")
    public static WebElement socialStartNext;

    @FindBy(id = "com.thefloow.flo:id/btn_step2_next")
    public static WebElement socialStep2Next;

    @FindBy(id = "com.thefloow.flo:id/social_about_me")
    public static WebElement socialAboutMe;

    @FindBy(id = "com.thefloow.flo:id/btn_social_profile_next")
    public static WebElement socialProfileNext;

    @FindBy(id = "com.thefloow.flo:id/social_menu_my_scores")
    public static WebElement myScores;

    @FindBy(id = "com.thefloow.flo:id/social_menu_friends")
    public static WebElement friends;

    @FindBy(id = "com.thefloow.flo:id/social_menu_my_profile")
    public static WebElement myProfile;


    @FindBy(id = "com.thefloow.flo:id/btn_edit_my_profile")
    public static WebElement editMyProfile;

    @FindBy(id = "com.thefloow.flo:id/my_profile_name_edit")
    public static WebElement editProfileName;

    @FindBy(id = "com.thefloow.flo:id/my_profile_name")
    public static WebElement editedProfileName;

    @FindBy(id = "com.thefloow.flo:id/btn_save_my_profile")
    public static WebElement saveEditProfile;

}
