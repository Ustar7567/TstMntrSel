package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L4_Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement we2=driver.findElement(By.xpath("//a[text()='Checkboxradio']"));
		Actions act=new Actions(driver);
		act.moveToElement(we2).perform();
		WebElement we1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we1);
		Thread.sleep(3000);
		WebElement we3=driver.findElement(By.xpath("//span[@style='left: 54.902%;']"));
		act.dragAndDropBy(we3, -50, 125).perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
