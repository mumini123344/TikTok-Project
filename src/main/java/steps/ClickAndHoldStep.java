package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import pages.ClickAndHoldPage;
import utils.ClickComposition;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;

public class ClickAndHoldStep {

    WebDriver driver;

    ClickComposition clickComposition = new ClickComposition();
    ClickAndHoldPage clickAndHoldPage;

    public ClickAndHoldStep(WebDriver driver) {
        this.driver = driver;
        clickAndHoldPage = new ClickAndHoldPage(driver);

    }


    @Step
    public ClickAndHoldStep clickStorage(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        Point clickStorage = clickAndHoldPage.internalStorage.getLocation();
        clickComposition.action_clickOnPosition(driver, clickStorage.x + 20, clickStorage.y + 20);
        System.out.println(clickStorage);
        return this;
    }

    @Step
    public ClickAndHoldStep clickDCIM(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        Point clickDcim = clickAndHoldPage.DCIMClick.getLocation();
        clickComposition.action_clickOnPosition(driver, clickDcim.x + 20, clickDcim.y + 20);
        System.out.println(clickDcim);
        return this;
    }

    @Step
    public ClickAndHoldStep clickCamera(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        Point clickCamera = clickAndHoldPage.camera.getLocation();
        clickComposition.action_clickOnPosition(driver, clickCamera.x + 20, clickCamera.y + 20);
        return this;
    }

    @Step
    public ClickAndHoldStep doHoldAndClickVideo(AndroidDriver driver, WebElement element) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofSeconds(3)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));

        return this;
    }

    private Point getCenterOfElement(Point location, Dimension size) {
        return new Point(location.getX() + size.getWidth() / 2,
                location.getY() + size.getHeight() / 2);
    }

    @Step
    public ClickAndHoldStep clickToMove() throws InterruptedException {
        Thread.sleep(2000);
        clickAndHoldPage.move.click();
        return this;
    }

    @Step
    public ClickAndHoldStep clickMoveHere() {
        clickAndHoldPage.moveHere.click();
        return this;
    }
}
