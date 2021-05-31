package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L6_KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement we1=driver.findElement(By.xpath("(//div[@class='row-container editor-container'])[1]"));
		WebElement we2=driver.findElement(By.xpath("(//div[@class='row-container editor-container'])[2]"));
		Actions act=new Actions(driver);
		act.keyDown(we1,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		act.keyDown(we2,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
		act.keyDown(we2,Keys.CONTROL).sendKeys("a").sendKeys("x").build().perform();
		Thread.sleep(2000);
		act.keyDown(we1,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
		act.keyDown(we1,Keys.CONTROL).sendKeys("z").build().perform();
		Thread.sleep(2000);
		driver.close();

		
	}

}
