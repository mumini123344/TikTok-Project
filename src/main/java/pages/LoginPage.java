package pages;

import data.Data;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    Data data = new Data();


    public LoginPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.zhiliaoapp.musically:id/m8r")
    public WebElement login;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Use phone / email / username\"]")
    public WebElement loginForm;

    @FindBy(className = "X.01x")
    public List<WebElement> usernameLogin;

    @FindBy(id = "com.zhiliaoapp.musically:id/ep3")
    public WebElement fillUsername;

    @FindBy(id = "com.zhiliaoapp.musically:id/d09")
    public WebElement fillPassword;

    @FindBy(id = "com.zhiliaoapp.musically:id/ctl")
    public WebElement loginButton;

    @FindBy(xpath = "//android.widget.Button[@text=\"Don't allow\"]")
    public WebElement dontPermission;


    public LoginPage clickLogin() {
        login.click();
        return this;
    }

    public LoginPage clickLoginForm() {
        loginForm.click();
        return this;
    }

    public LoginPage clickUsername() {
        usernameLogin.get(1).click();
        return this;

    }

    public LoginPage clickFillUsername() {
        fillUsername.sendKeys(data.getUsername());
        return this;

    }

    public LoginPage clickFillPassword() {
        fillPassword.sendKeys(data.getPass());
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPage clickDontPermission() {
        dontPermission.click();
        return this;
    }
}
