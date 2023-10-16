package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.RandomClass;
import utils.SwipeDown;

public class StartingPage {

    RandomClass randomClass = new RandomClass();
    SwipeDown swipeDown = new SwipeDown();

    public StartingPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(className = "android.widget.Button")
    public WebElement agree;

    @FindBy(id = "com.zhiliaoapp.musically:id/k3s")
    public WebElement skip;

    @FindBy(id = "com.zhiliaoapp.musically:id/kf9")
    public WebElement startWatching;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Profile']")
    public WebElement profile;

    @Step
    public StartingPage clickAgree() {
        agree.click();
        return this;
    }

    @Step
    public StartingPage clickSkip() {
        skip.click();
        return this;
    }

    @Step
    public StartingPage clickStartWatching() {
        startWatching.click();
        return this;
    }

    @Step
    public StartingPage swipeUpForMore(AndroidDriver driver) {
        swipeDown.swipeVertical(driver, 0.8, 0.2);
        return this;
    }

    @Step
    public StartingPage clickProfile() throws InterruptedException {
        profile.click();
        Thread.sleep(randomClass.RandomMethod());
        return this;

    }


}
