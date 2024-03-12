package test;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HesapPAGE;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;


public class TestDeneme {
  public static AndroidDriver driver;



    @Test
    public void denemeTesti() throws MalformedURLException, InterruptedException {


        UiAutomator2Options options=new UiAutomator2Options();
       options
               .setDeviceName("PIXEL 2")
               .setPlatformName("Android")
               .setPlatformVersion("10.0")
               .setAutomationName("UiAutomator2")
              // .setApp("C:\\Users\\ahmet\\IdeaProjects\\Appium_T127\\Apps\\arabam.com_5.1.6_Apkpure.apk");
               .setAppPackage("com.dogan.arabam")
               .setAppActivity("com.dogan.arabam.presentation.feature.home.HomeActivity") ;

        driver=new AndroidDriver((new URL(" http://127.0.0.1:4723/")),options);

        Assert.assertTrue(driver.isAppInstalled("com.dogan.arabam"));
        // uygulaminin basarili bir sekilde acildigi dogrulanir
     //   Assert.assertTrue(driver.findElement(By.id("com.dogan.arabam:id/ivArabamLogo")).isDisplayed());
        // alt menuden ilan ara butonuna tiklanir
        driver.findElement(By.xpath("//*[@text='İlan Ara']")).click();
        Thread.sleep(2000);
        // kategori olarak otomobil secilir
        //  driver.findElementByXPath("//*[@text='Otomobil']").click(); // tiklama yapmak icin kullanilan klasik yontem
        // page.five.click();
        TouchAction action=new TouchAction<>(driver); // Hangi cihaz uzerinde calisacaksak o cihaza ait driver
        action.
                 press(PointOption.point(336,511)) // Ekranda tiklama yapilacak en ve boy bilgilerinin girildigi kisim. En ve boy bilgileri inspectorden
                .release() // Tiklama islemi yaptiktan sonra tiklamanin gerceklesmesi icin ekrandan parmagimizi kaldirma islemi
                .perform(); // verilen action gorevlerinin yerine getirmesi icin action methodlarina verilen YAP(yerine getir) emri.
        Thread.sleep(2000);
/*
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 0);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 482,1516 ));
        swipe.addAction(new Pause(finger, Duration.ofMillis(750)));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), 482, 320));
        driver.perform(Arrays.asList(swipe));

 */




       /*
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\AppiumNewVersion2.4\\apps\\Calculator_8.4 (503542421)_Apkpure.apk");

        driver=new AndroidDriver(new URL(" http://127.0.0.1:4723/"),capabilities);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(AppiumBy.xpath("sadasdasdas")).click();

        */



      
    }


}
