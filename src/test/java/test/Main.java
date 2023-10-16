package test;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.StartingPage;
import pages.UploadPage;
import utils.CopyToAndroid;
import utils.Setup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Main {

    private AndroidDriver driver;
    private WebDriverWait wait;
    private StartingPage startingPage;
    private LoginPage loginPage;
    private UploadPage uploadPage;
    Setup setup = new Setup();
    CopyToAndroid copyVideo = new CopyToAndroid();


    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = setup.initializeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        startingPage = new StartingPage(driver);
        loginPage = new LoginPage(driver);
        uploadPage = new UploadPage(driver);
    }

    @Description("TODO Login")
    @Test(enabled = false)
    public void LoginTest() throws InterruptedException {
        startingPage.clickAgree()
                .clickSkip()
                .clickStartWatching()
                .swipeUpForMore(driver)
                .clickProfile();

        //  ახლიდან დალოგინების დროს მჭირდება, ისე არა
        loginPage.clickLogin()
                .clickLoginForm()
                .clickUsername()
                .clickFillUsername()
                .clickFillPassword()
                .clickLoginButton()
                .clickDontPermission();

    }

    @Description("TODO change profile picture")
    @Test(enabled = false)
    public void ProfileTest() throws InterruptedException {
        startingPage.clickProfile();
        uploadPage.clickEditProfile()
                .clickChangePhoto()
                .clickSelectFromGallery();

    }

    // To be continued
    @Description("TODO upload video")
    @Test
    public void UploadVideoTest() throws IOException {
        copyVideo.copyToAndroid("Desktop/TiktokVideos", "/storage/emulated/0/DCIM/Camera");
    }

}
