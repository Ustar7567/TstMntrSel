package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L3_ResizeWidget {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		Actions act=new Actions(driver);
		WebElement we2=driver.findElement(By.xpath("//a[text()='Checkboxradio']"));
		act.moveToElement(we2).perform();
		WebElement we1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we1);
		WebElement we=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		act.dragAndDropBy(we, 300, 100).perform();
		}

}
