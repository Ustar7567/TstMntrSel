package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("SSup?");
		driver.manage().window().maximize();
		driver.close();

	}

}
