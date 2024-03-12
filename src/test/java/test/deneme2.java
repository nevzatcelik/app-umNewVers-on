package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import page.HesapPAGE;
import utils.Driver;

public class deneme2 {

    HesapPAGE page=new HesapPAGE();
    @Test
    public void testdenem2(){
        page.five.click();
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(new Point(1000,1000))).release().perform();


    }
}
