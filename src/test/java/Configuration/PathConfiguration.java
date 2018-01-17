/**
 * 
 */
package Configuration;

import java.io.File;

/**
 * @author vamsiravi
 *
 */
public class PathConfiguration {

	// Get the OS details from the System 
	public  String operatingSystem = System.getProperty("os.name").toLowerCase();
	
	// Change to forward slash for MAC or Linux , Change to backward slash for Windows Based as in the above	
	// MAC or Linux 

	public String baseDirectory = System.getProperty("user.dir")+File.separator;
 
	public String dataProprties = baseDirectory+"src"+File.separator+"main"+File.separator+"java"+File.separator+"resources"+File.separator+"data.properties";
	
	public String errorConfiguration = baseDirectory+"ErrorScreenshot"+File.separator;	
	
	public String reportsDirectory = baseDirectory+"reports"+File.separator;
	
	public String chromeDriver	= baseDirectory+"drivers"+File.separator+"chromedriver";
	
	public String phanthomDriver = baseDirectory+"drivers"+File.separator+"phantomjs";
	
	public  String geckoDriver = baseDirectory+"drivers"+File.separator+"geckodriver";

	public String windowsChromeDriver	= baseDirectory+"drivers"+File.separator+"WindowsExecutables"+File.separator+"chromedriver.exe";
	
	public String windowsPhanthomDriver = baseDirectory+"drivers"+File.separator+"WindowsExecutables"+File.separator+"phantomjs.exe";
	
	public  String windowsGeckoDriver = baseDirectory+"drivers"+File.separator+"WindowsExecutables"+File.separator+"geckodriver";

	
	// Config File for the extent is the same for both Windows and Linux.
	public String exetentConfigFile = baseDirectory+"extent.config";

	public String getDataProprties() {
		return dataProprties;
	}

	public void setDataProprties(String dataProprties) {
		this.dataProprties = dataProprties;
	}

	public String getChromeDriver() {
		return chromeDriver;
	}

	public void setChromeDriver(String chromeDriver) {
		this.chromeDriver = chromeDriver;
	}

	public String getGeckoDriver() {
		return geckoDriver;
	}

	public void setGeckoDriver(String geckoDriver) {
		this.geckoDriver = geckoDriver;
	}

	public String getBaseDirectory() {
		return baseDirectory;
	}

	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	public String getErrorConfiguration() {
		return errorConfiguration;
	}

	public void setErrorConfiguration(String errorConfiguration) {
		this.errorConfiguration = errorConfiguration;
	}

	public String getReportsDirectory() {
		return reportsDirectory;
	}

	public void setReportsDirectory(String reportsDirectory) {
		this.reportsDirectory = reportsDirectory;
	}

	public String getExetentConfigFile() {
		return exetentConfigFile;
	}

	public void setExetentConfigFile(String exetentConfigFile) {
		this.exetentConfigFile = exetentConfigFile;
	}

	public String getPhanthomDriver() {
		return phanthomDriver;
	}

	public void setPhanthomDriver(String phanthomDriver) {
		this.phanthomDriver = phanthomDriver;
	}

	public  boolean isWindows() {
		return (operatingSystem.indexOf("win") >= 0);
	}

	public  boolean isMacOrUnix() {
		return (operatingSystem.indexOf("mac") >= 0 || operatingSystem.indexOf("nix") >= 0 || operatingSystem.indexOf("nux") >= 0 || operatingSystem.indexOf("aix") > 0 || operatingSystem.indexOf("sunos") >= 0);
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * @param operatingSystem the operatingSystem to set
	 */
	public  void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @return the windowsChromeDriver
	 */
	public String getWindowsChromeDriver() {
		return windowsChromeDriver;
	}

	/**
	 * @param windowsChromeDriver the windowsChromeDriver to set
	 */
	public void setWindowsChromeDriver(String windowsChromeDriver) {
		this.windowsChromeDriver = windowsChromeDriver;
	}

	/**
	 * @return the windowsPhanthomDriver
	 */
	public String getWindowsPhanthomDriver() {
		return windowsPhanthomDriver;
	}

	/**
	 * @param windowsPhanthomDriver the windowsPhanthomDriver to set
	 */
	public void setWindowsPhanthomDriver(String windowsPhanthomDriver) {
		this.windowsPhanthomDriver = windowsPhanthomDriver;
	}

	/**
	 * @return the windowsGeckoDriver
	 */
	public String getWindowsGeckoDriver() {
		return windowsGeckoDriver;
	}

	/**
	 * @param windowsGeckoDriver the windowsGeckoDriver to set
	 */
	public void setWindowsGeckoDriver(String windowsGeckoDriver) {
		this.windowsGeckoDriver = windowsGeckoDriver;
	}
}
