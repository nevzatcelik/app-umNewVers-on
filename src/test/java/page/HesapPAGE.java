package page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HesapPAGE {

    public HesapPAGE(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()), this);
    }

    @AndroidFindBy(accessibility = "5")
    public WebElement five;


}
