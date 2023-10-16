package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.RandomClass;

public class UploadPage {

    RandomClass randomClass = new RandomClass();
    public UploadPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.zhiliaoapp.musically:id/mwl")
    public WebElement uploadAtProfile;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Set up profile\"]")
    public WebElement editProfile;

    @FindBy(id = "com.zhiliaoapp.musically:id/egy")
    public WebElement changePhoto;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Select from Gallery']")
    public WebElement selectFromGallery;


    public UploadPage clickUploadAtProfile() throws InterruptedException {
        Thread.sleep(randomClass.RandomMethod());
        uploadAtProfile.click();
        return this;
    }

    public UploadPage clickEditProfile(){
        editProfile.click();
        return this;
    }

    public UploadPage clickChangePhoto(){
        changePhoto.click();
        return this;
    }

    public UploadPage clickSelectFromGallery(){
        selectFromGallery.click();
        return this;
    }
}
