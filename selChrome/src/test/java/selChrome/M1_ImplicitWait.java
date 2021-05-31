package selChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M1_ImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("(//a[@_sp='p2481888.m1379.l3250' and text()='Electronics'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[@class='hl-cat-nav__js-link' and text()='Smart watches']")).click();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		driver.close();

	}

}
