package selChrome;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M3_FluentWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("(//a[@_sp='p2481888.m1379.l3250' and text()='Electronics'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		WebElement we1=driver.findElement(By.xpath("//a[@class='hl-cat-nav__js-link' and text()='Smart watches']"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(2))
				  .withMessage("Oops!")
				  .ignoring(NoSuchElementException.class);
		we1.click();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		driver.close();
		

		
	}

}
