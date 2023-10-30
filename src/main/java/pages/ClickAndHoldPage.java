package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickAndHoldPage {
    public ClickAndHoldPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    AndroidDriver driver;


    @FindBy(id = "com.sec.android.app.myfiles:id/file_list_item")
    public WebElement holdAndClickFirstVideo;

    @FindBy(xpath = "//*[@text = 'DCIM']")
    public WebElement DCIMClick;

    @FindBy(xpath = "//*[@text = 'Internal storage']")
    public WebElement internalStorage;

    @FindBy(xpath = "//*[@text = 'Camera']")
    public WebElement camera;

    @FindBy(id = "com.sec.android.app.myfiles:id/menu_move")
    public WebElement move;

    @FindBy(id = "com.sec.android.app.myfiles:id/operation_done_button")
    public WebElement moveHere;

}
