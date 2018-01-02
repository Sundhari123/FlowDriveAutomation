package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {

    public UserLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement loginEmail;

    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement loginPassword;

    @FindBy(id = "com.thefloow.flo:id/btn_login")
    public static WebElement loginBtn;

    @FindBy(id = "com.thefloow.flo:id/text_view_create_account")
    public static WebElement createAccount;

    @FindBy(id = "com.thefloow.flo:id/edit_text_first_name")
    public static WebElement firstName;

    @FindBy(id = "com.thefloow.flo:id/edit_text_surname")
    public static WebElement surName;

    @FindBy(id = "com.thefloow.flo:id/edit_text_date_of_birth")
    public static WebElement dob;

    @FindBy(id = "android:id/button1")
    public static WebElement dobOK;

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement email;

    @FindBy(id = "com.thefloow.flo:id/edit_text_postcode")
    public static WebElement postCode;

    @FindBy(id = "com.thefloow.flo:id/edit_text_company_name")
    public static WebElement companyName;

    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement password;

    @FindBy(id = "com.thefloow.flo:id/edit_text_confirm_password")
    public static WebElement confirmPassword;

    @FindBy(id = "com.thefloow.flo:id/button_register")
    public static WebElement submitButton;

    @FindBy(id = "com.thefloow.flo:id/button_success_dismiss")
    public static WebElement successLogin;

    @FindBy(id = "com.thefloow.flo:id/btn_welcome_start")
    public static WebElement welcomeStart;

    @FindBy(id = "com.thefloow.flo:id/btn_agree")
    public static WebElement agreeButton;

    @FindBy(id = "com.thefloow.flo:id/btn_welcome_close")
    public static WebElement closeWelcome;

}
