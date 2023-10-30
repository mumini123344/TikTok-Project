package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.UploadPage;
import utils.RandomClass;

import java.util.List;

public class UploadSteps {

    WebDriver driver;
    RandomClass randomClass = new RandomClass();
    UploadPage uploadPage;
    public UploadSteps(WebDriver driver){
        this.driver = driver;
        uploadPage = new UploadPage(driver);
    }

    @Step
    public UploadSteps clickUploadAtProfile() throws InterruptedException {
        Thread.sleep(randomClass.randomMethod());
        uploadPage.uploadAtProfile.click();
        return this;
    }

    @Step
    public UploadSteps clickEditProfile(){
        uploadPage.editProfile.click();
        return this;
    }

    @Step
    public UploadSteps clickChangePhoto(){
        uploadPage.changePhoto.click();
        return this;
    }

    @Step
    public UploadSteps clickSelectFromGallery(){
        uploadPage.selectFromGallery.click();
        return this;
    }

    @Step
    public UploadSteps clickUploadFromAdd() throws InterruptedException {
        Thread.sleep(randomClass.randomMethod());
        uploadPage.uploadFromAdd.click();
        return this;
    }

    @Step
    public UploadSteps clickVideo() throws InterruptedException {
        Thread.sleep(randomClass.randomMethod());
        uploadPage.uploadVideo.get(0).click();
        return this;
    }

    @Step
    public UploadSteps clickNextButton(){
        uploadPage.nextButton.click();
        return this;
    }

    @Step
    public UploadSteps clickPostNow(){
        uploadPage.postNow.click();
        return this;
    }

}
