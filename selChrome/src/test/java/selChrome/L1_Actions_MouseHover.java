package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L1_Actions_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		WebElement we=driver.findElement(By.xpath("//span[contains(text(),'Try for free')]"));
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
