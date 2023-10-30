package steps;

import android.util.Log;
import data.Data;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utils.RandomClass;

import java.util.List;

public class LoginSteps {

    WebDriver driver;
    Data data = new Data();
    RandomClass randomClass = new RandomClass();
    LoginPage loginPage;
    public LoginSteps(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);


    }



    public LoginSteps clickLogin() throws InterruptedException {
        loginPage.login.click();
        Thread.sleep(randomClass.randomMethod());
        return this;
    }

    public LoginSteps clickLoginMethod() throws InterruptedException {
        loginPage.loginMethod.get(0).click();
        Thread.sleep(randomClass.randomMethod());
        return this;
    }

    public LoginSteps clickUsername() {
        loginPage.usernameLogin.get(1).click();
        return this;

    }

    public LoginSteps clickFillUsername() {
        loginPage.fillUsername.sendKeys(data.getUsername());
        return this;

    }

    public LoginSteps clickFillPassword() {
        loginPage.fillPassword.sendKeys(data.getPass());
        return this;
    }

    public LoginSteps clickLoginButton() {
        loginPage.loginButton.click();
        return this;
    }

    public LoginSteps clickDontPermission() {
        loginPage.dontPermission.click();
        return this;
    }
}
