package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/anb")
    public WebElement login;

    @FindBy(className = "androidx.appcompat.widget.LinearLayoutCompat")
    public List<WebElement> loginMethod;

    @FindBy(className = "android.widget.LinearLayout")
    public List<WebElement> usernameLogin;

    @FindBy(xpath = "//*[@text = 'Email or username']")
    public WebElement fillUsername;

    @FindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    public WebElement fillPassword;

    @FindBy(id = "com.zhiliaoapp.musically.gp:id/tj")
    public WebElement loginButton;

    @FindBy(xpath = "//android.widget.Button[@text=\"Don't allow\"]")
    public WebElement dontPermission;
}
