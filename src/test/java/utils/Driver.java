package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {


    private static AndroidDriver appiumDriver;

    static final String TELEFONADI="";
    static final String ANDROIDVERSION="";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";

    public static AndroidDriver getAndroidDriver() {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {


            UiAutomator2Options options=new UiAutomator2Options();
            options
                    .setDeviceName("PIXEL 2")
                    .setPlatformName("Android")
                    .setPlatformVersion("10.0")
                    .setAutomationName("UiAutomator2")
                    .setApp("C:\\Users\\ahmet\\IdeaProjects\\AppiumNewVersion2.4\\apps\\Calculator_8.4 (503542421)_Apkpure.apk")
                    .setFullReset(false);
            // true uygulama sifirlanmiyor onceki adimlari muhafaza ediyor
            //false ise her test baslangicinda uygulamayi sifirliyor ve uygulama en bastan basliyor

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver=new AndroidDriver(appiumServerURL,options);
                appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            }else {

                throw new UnsupportedOperationException("Invalid Platform Name ");

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.closeApp();
            appiumDriver = null;
        }
    }
}
