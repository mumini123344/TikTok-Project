package test;

import data.ProxyPath;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;
import utils.Setup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Main {

    AndroidDriver driver;
    WebDriverWait wait;
    StartingSteps startingPage;
    LoginSteps loginPage;
    UploadSteps uploadPage;
    Setup setup = new Setup();

    DeleteAndUploadVideoSteps deleteAndUploadVideoPage = new DeleteAndUploadVideoSteps();
    ProxyPath proxyPath = new ProxyPath();
    ClickAndHoldStep clickAndHoldPage;


    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

        driver = setup.initializeDriver("com.zhiliaoapp.musically.gp", "com.ss.android.ugc.aweme.main.homepage.MainActivity");

        //driver = setup.initializeDriver("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickAndHoldPage = new ClickAndHoldStep(driver);
        startingPage = new StartingSteps(driver);
        loginPage = new LoginSteps(driver);
        uploadPage = new UploadSteps(driver);


    }


    @Description("TODO Login")
    @Test(priority = 1)
    public void StartingPageTest() throws InterruptedException, IOException {
//        deleteAndUploadVideoPage.delete()
//                .copy();
//
//        clickAndHoldPage.clickStorage(driver)
//                .clickDCIM(driver)
//                .clickCamera(driver)
//                .doHoldAndClickVideo(driver, clickAndHoldPage.holdAndClickFirstVideo)
//                .clickToMove()
//                .clickMoveHere();

        startingPage.composition(driver)
                .clickAgree(driver)
                .swipeUpForMore(driver)
                .clickAdd();


        uploadPage.clickUploadFromAdd()
                .clickVideo()
                .clickNextButton()
                .clickPostNow();

        loginPage.clickLogin()
                .clickLoginMethod()
                .clickUsername()
                .clickFillUsername()
                .clickFillPassword()
                .clickLoginButton();

    }

    @AfterTest
    public void quitTest() {
        System.out.println("AFTER TEST STARTED");
        RestAssured.get(proxyPath.getProxyPath());
        System.out.println("PROXY ROTATED");
        driver.quit();
    }

}




