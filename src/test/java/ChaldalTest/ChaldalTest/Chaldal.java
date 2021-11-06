package ChaldalTest.ChaldalTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Chaldal {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
			openChaldal();
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void openChaldal() throws Exception {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "OnePlus 8");
	cap.setCapability("udid", "e7176c64");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11");
	cap.setCapability("appPackage", "com.chaldal.poached");
	cap.setCapability("appActivity", "com.chaldal.poached.MainActivity");
	
	URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	
	driver = new AppiumDriver<MobileElement>(url , cap);
	
	System.out.println("Application Started");
	
	}

}
