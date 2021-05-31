package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_BasicWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Manju");//SendKeys
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).clear();//clear
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='btn btn-primary']")).click();//click
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getAttribute("class"));//getAttribute
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getLocation());//getLocation
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getCssValue("color"));//getCssValue
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getSize());//getSize
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getTagName());//getTagName
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).getText());//getText
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).isDisplayed());//isDisplayed
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).isEnabled());//isEnabled
		System.out.println(driver.findElement(By.xpath("//span[@class='btn btn-primary']")).isSelected());	//isSelected
		driver.quit();
		
	}

}
