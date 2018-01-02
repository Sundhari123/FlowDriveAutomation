package testImplementation;


import base.BaseSetUp;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.SocialPage;
import pageObjects.UserLoginPage;
import utils.ExcelUtil;

public class TestImplementation extends BaseSetUp{
    UserLoginPage usrLgnPgObj = new UserLoginPage(driver);
    HomePage hmPgObj = new HomePage(driver);
    SocialPage socialPgObj = new SocialPage(driver);

    public void LaunchPage () throws Exception {
        Thread.sleep(3000);
        UserLoginPage.agreeButton.click();
    }

    public void create_account () throws Exception {
        UserLoginPage.createAccount.click();
        UserLoginPage.firstName.sendKeys(ExcelUtil.getCellData(1,1));
        UserLoginPage.surName.sendKeys(ExcelUtil.getCellData(2,1));
        UserLoginPage.dob.click();
        UserLoginPage.dobOK.click();
        UserLoginPage.email.sendKeys(ExcelUtil.getCellData(4,1));
        UserLoginPage.postCode.sendKeys(ExcelUtil.getCellData(5,1) +"\n");
        UserLoginPage.companyName.sendKeys (ExcelUtil.getCellData(6,1) + "\n");
        UserLoginPage.password.sendKeys(ExcelUtil.getCellData(7,1) +"\n");
        UserLoginPage.confirmPassword.sendKeys(ExcelUtil.getCellData(8,1) +"\n");
        UserLoginPage.submitButton.click();
        UserLoginPage.successLogin.click();
        Thread.sleep(300);
        //UserLoginPage.closeWelcome.click();
        swipeHorizontal();
        swipeHorizontal();
        UserLoginPage.welcomeStart.click();
    }

    public void user_in_loginpage () throws Exception{
        Assert.assertEquals(true, HomePage.homePage.isDisplayed());
    }

    public void user_input_for_login () throws Exception {
        UserLoginPage.loginEmail.sendKeys(ExcelUtil.getCellData(4,1));
        UserLoginPage.loginPassword.sendKeys(ExcelUtil.getCellData(7,1) +"\n");
        UserLoginPage.loginBtn.click();
        Thread.sleep(3000);
        UserLoginPage.closeWelcome.click();
    }


    public void start_journey () throws Exception{
        Thread.sleep(8000);

        HomePage.journeyStartButton.click();
        Thread.sleep(8000);
    }

    public void stop_journey () throws Exception{
        HomePage.journeyStopButton.click();
        Thread.sleep(5000);
        HomePage.noRecordJourneyOkMsg.click();

    }
    public void get_start_journey_duration () throws Exception{
        String result = HomePage.durationValue.getText();
        if (result.equals("00:00")) {
            throw new Exception("The journey doesn't start");
        }
        else {
            System.out.println("The journey started successfully");
        }

        }

    public void get_stop_journey_duration () throws Exception{
        String result = HomePage.durationValue.getText();
        Thread.sleep(1000);
        String result1 = HomePage.durationValue.getText();
            if (result.equals(result1)) {
                System.out.println("The journey stopped correctly");
            }
            else {
                throw new Exception("The journey didn't stop successfully");
            }
    }

    public void click_emergency_button () throws Exception{
        HomePage.emergencyButton.click();
    }
    public void click_accident_button () throws Exception {
        HomePage.accident.click();
    }
    public void click_breakdown_button () throws Exception {
        HomePage.breakdown.click();
    }
    public void display_emergencycall_asst () throws Exception {
        Assert.assertEquals(true, HomePage.emergencyCallAsst.isDisplayed());
    }

    public void click_social_page () throws Exception{
        SocialPage.social.click();
        Thread.sleep(5000);
    }
    public void provide_screen_name () throws Exception{
        SocialPage.socialScreenName.sendKeys(ExcelUtil.getCellData(11,1));
        driver.hideKeyboard();
        SocialPage.socialStartNext.click();
    }

    public void attach_profile_pic () throws Exception{
        SocialPage.socialStep2Next.click();
    }
    public void provide_about_me () throws Exception{
        SocialPage.socialAboutMe.sendKeys(ExcelUtil.getCellData(12,1));
        driver.hideKeyboard();
        SocialPage.socialProfileNext.click();
    }
    public void social_page_after_profile_info () throws Exception {
        Assert.assertEquals(true, SocialPage.friends.isDisplayed());
        Assert.assertEquals(true ,SocialPage.myProfile.isDisplayed());
        Assert.assertEquals(true, SocialPage.myScores.isDisplayed());
    }
    public void click_my_profile () throws Exception{
        SocialPage.myProfile.click();
    }
    public void edit_profile () throws Exception{
        SocialPage.editMyProfile.click();
        SocialPage.editProfileName.clear();
        SocialPage.editProfileName.sendKeys(ExcelUtil.getCellData(13,1));
        SocialPage.saveEditProfile.click();
    }
    public void verify_edited_profile () throws Exception{
        String actualprofileName = SocialPage.editedProfileName.getText();
        String expectedprofilename = ExcelUtil.getCellData(13,1);
        Assert.assertEquals(expectedprofilename,actualprofileName);
    }

    }

