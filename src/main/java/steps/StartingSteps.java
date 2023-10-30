package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import pages.StartingPage;
import utils.ClickComposition;
import utils.RandomClass;
import utils.SwipeDown;

public class StartingSteps {

    WebDriver driver;
    RandomClass randomClass = new RandomClass();
    SwipeDown swipeDown = new SwipeDown();
    ClickComposition clickComposition = new ClickComposition();
    StartingPage startingPage;

    public StartingSteps(WebDriver driver) {
        this.driver = driver;
        startingPage = new StartingPage(driver);
    }


    @Step
    public StartingSteps clickAgreeAndContinue() {
        startingPage.agreeAndContinue.click();
        return this;
    }

    @Step
    public StartingSteps clickAgree(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        Point agreeButton = startingPage.agree.getLocation();
        clickComposition.action_clickOnPosition(driver, agreeButton.x + 20, agreeButton.y + 20);
        return this;
    }

    @Step
    public StartingSteps clickSkip() {
        startingPage.skip.click();
        return this;
    }

    @Step
    public StartingSteps clickStartWatching() {
        startingPage.startWatching.click();
        return this;
    }

    @Step
    public StartingSteps swipeUpForMore(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(randomClass.randomMethod());
        swipeDown.swipeVertical(driver, 0.8, 0.2);
        return this;
    }

    @Step
    public StartingSteps composition(AndroidDriver driver) throws InterruptedException {
        clickComposition.action_clickOnPosition(driver, 550, 325);
        Thread.sleep(2000);
        return this;
    }


    @Step
    public StartingSteps clickProfile() throws InterruptedException {
        startingPage.profile.click();
        Thread.sleep(randomClass.randomMethod());
        return this;

    }

    @Step
    public StartingSteps clickAdd() {
        startingPage.add.click();
        return this;
    }


}
