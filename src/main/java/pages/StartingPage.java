package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
    public StartingPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//*[text = 'Agree and continue']")
    public WebElement agree;

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/aa8")
    public WebElement agreeAndContinue;

    @FindBy(id = "com.zhiliaoapp.musically:id/k3s")
    public WebElement skip;

    @FindBy(id = "com.zhiliaoapp.musically:id/kf9")
    public WebElement startWatching;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Me']")
    public WebElement profile;

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/a4k")
    public WebElement add;

}
