package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F3_AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000); //If I maximize the window or if I don't wait for 2 sec, element not clickable exception is thrown.Should learn
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement a = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		a.sendKeys("Bangalore");
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
