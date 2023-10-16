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

    public UploadPage clickUploadAtProfile() throws InterruptedException {
        Thread.sleep(randomClass.RandomMethod());
        uploadAtProfile.click();
        return this;
    }
}
