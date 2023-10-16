package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class SwipeDown {

    public AndroidDriver swipeVertical(AndroidDriver driver, double startPercentage, double endPercentage) {
        Dimension size = driver.manage().window().getSize();
        int width = (int) (size.getWidth() / 2);
        int startPoint = (int) (size.getHeight() * startPercentage);
        int endPoint = (int) (size.getHeight() * endPercentage);

        new TouchAction(driver)
                .press(PointOption.point(width, startPoint))
                .waitAction()
                .moveTo(PointOption.point(width, endPoint))
                .release()
                .perform();

        return driver;
    }
}
