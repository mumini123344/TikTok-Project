package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ClickComposition {

    public AndroidDriver action_clickOnPosition(AndroidDriver driver, int pointA_X, int pointA_Y) {
        PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger");
        org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1);
        clickPosition
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), pointA_X, pointA_Y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(clickPosition));
        System.out.println("action_clickOnPosition executed");
        return driver;
    }
}
