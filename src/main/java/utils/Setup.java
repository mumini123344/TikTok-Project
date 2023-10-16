package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup {

    AndroidDriver driver;

    public AndroidDriver initializeDriver() throws MalformedURLException {

        try {
            System.out.println("in driver");
            DesiredCapabilities capabilities = new DesiredCapabilities();

            final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
            URL url = new URL(URL_STRING);
            capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
            capabilities.setCapability("appPackage", "com.zhiliaoapp.musically");
            capabilities.setCapability("appActivity", "com.ss.android.ugc.aweme.splash.SplashActivity");

            capabilities.setCapability("ignoreUnimportantViews", true);
            capabilities.setCapability("disableAndroidWatchers", true);
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

            driver = new AndroidDriver(url, capabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

}
