package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H_CheckBoxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement we1=driver.findElement(By.xpath("//input[@value='Request a Demo']"));
		Actions act=new Actions(driver);
		act.moveToElement(we1);
		act.perform();
		driver.findElement(By.name("interest_market_c")).click();//selects chkbox
		Thread.sleep(2000);
		driver.findElement(By.name("interest_market_c")).click();//de-selects
		driver.findElement(By.id("doi0")).click();//selects radio button
			
	}

}
