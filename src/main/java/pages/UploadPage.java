package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadPage {
    public UploadPage(WebDriver driver) {
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

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/ln")
    public WebElement uploadFromAdd;


    @FindBy(className = "android.widget.FrameLayout")
    public List<WebElement> uploadVideo;

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/nm")
    public WebElement nextButton;

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/alb")
    public WebElement postNow;

}
