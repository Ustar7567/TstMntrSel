package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_AnyBrowserOfChoice {
	
	public static String browser = "edge"; //From External configuration-XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Ssup?");
		Thread.sleep(2000);
		driver.close();

	}

}
