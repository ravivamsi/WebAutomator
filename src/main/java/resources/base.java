package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Configuration.PathConfiguration;

public class base {

	public static WebDriver driver;
	public Properties prop;
	
	PathConfiguration pathConfig = new PathConfiguration();
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream(pathConfig.dataProprties);
prop.load(fis);
String browserName=prop.getProperty("browser");
//String executionType = prop.getProperty("execution");
String operatingSystem = pathConfig.getOperatingSystem();


System.out.println(browserName);

//if(executionType.equalsIgnoreCase("local")){
if(browserName.equals("chrome")){
	if(operatingSystem.indexOf("mac") >= 0 || operatingSystem.indexOf("nix") >= 0 || operatingSystem.indexOf("nux") >= 0 || operatingSystem.indexOf("aix") > 0 || operatingSystem.indexOf("sunos") >= 0){
		System.setProperty("webdriver.chrome.driver", pathConfig.getChromeDriver());
	}else{
		System.setProperty("webdriver.chrome.driver", pathConfig.getWindowsChromeDriver());	
	}
	driver= new ChromeDriver();
//	driver.manage().window().maximize();
		//execute in chrome driver
}else if (browserName.equals("firefox")){
	driver= new FirefoxDriver();
	//firefox code
	 driver.manage().window().maximize();
}else if (browserName.equals("ie")){
//	IE code
//	System.setProperty("webdriver.ie.driver", pathConfig.ieDriver);
//	driver = new InternetExplorerDriver();
//	driver.manage().window().maximize();
}else if(browserName.equals("headless")){
	// Initialize the Headless Browser
	if(operatingSystem.indexOf("mac") >= 0 || operatingSystem.indexOf("nix") >= 0 || operatingSystem.indexOf("nux") >= 0 || operatingSystem.indexOf("aix") > 0 || operatingSystem.indexOf("sunos") >= 0){
		System.setProperty("phantomjs.binary.path", pathConfig.getPhanthomDriver());
	}else{
		System.setProperty("phantomjs.binary.path", pathConfig.getWindowsPhanthomDriver());
	}
	driver = new PhantomJSDriver();
}else if(browserName.equalsIgnoreCase("headlesschrome")){
	ChromeOptions options = new ChromeOptions();
    options.addArguments("headless");
    options.addArguments("window-size=1200x600");
    if(operatingSystem.indexOf("mac") >= 0 || operatingSystem.indexOf("nix") >= 0 || operatingSystem.indexOf("nux") >= 0 || operatingSystem.indexOf("aix") > 0 || operatingSystem.indexOf("sunos") >= 0){
		System.setProperty("webdriver.chrome.driver", pathConfig.getChromeDriver());
	}else{
		System.setProperty("webdriver.chrome.driver", pathConfig.getWindowsChromeDriver());	
	}
	driver= new ChromeDriver();
}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
//}else{
//	if(browserName.equals("chrome")){	
//		System.setProperty("webdriver.chrome.driver", pathConfig.getChromeDriver());
//		DesiredCapabilities desiredCapabilitiesChrome = DesiredCapabilities.chrome();
//		desiredCapabilitiesChrome.setPlatform(Platform.MAC);
//		driver = new RemoteWebDriver(new URL("http://10.12.0.79:44446/wd/hub"), desiredCapabilitiesChrome);
//	}else if (browserName.equals("firefox")){
//		DesiredCapabilities desiredCapabilitiesFirefox = DesiredCapabilities.firefox();
//		desiredCapabilitiesFirefox.setPlatform(Platform.MAC);
//		driver = new RemoteWebDriver(new URL("http://localhost:4447/wd/hub"), desiredCapabilitiesFirefox);
//	}
//	return driver;
//}

}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(pathConfig.baseDirectory+result+"screenshot.png"));
	
}


}
