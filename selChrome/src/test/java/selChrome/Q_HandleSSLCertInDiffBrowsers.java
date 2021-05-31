package selChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q_HandleSSLCertInDiffBrowsers {
	
	public static String browser="edge"; //Get from external config-XLS or CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		
		DesiredCapabilities handlSSL=new DesiredCapabilities();
		
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			handlSSL.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlSSL.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			FirefoxOptions fOp=new FirefoxOptions();
			fOp.merge(handlSSL);
			driver=new FirefoxDriver(fOp);
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			handlSSL.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlSSL.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			ChromeOptions cOp=new ChromeOptions();
			cOp.merge(handlSSL);
			driver=new ChromeDriver(cOp);
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			handlSSL.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlSSL.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			EdgeOptions eOp=new EdgeOptions();
			eOp.merge(handlSSL);
			driver=new EdgeDriver(eOp);
		}
		
		
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		

	}

}
