/**
 * 
 */
package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import TestData.Credentials;
import resources.base;

/**
 * @author vamsiravi
 *
 */
public class DataRetriever {
	Credentials credentials = new Credentials();
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	 
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data= credentials.getCredentials();
		
		return data;

	}
	
}
