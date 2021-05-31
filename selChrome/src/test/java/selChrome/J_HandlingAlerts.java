package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J_HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(4000);
		WebElement we = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(we);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement we1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(we1);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().sendKeys("Manju");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
