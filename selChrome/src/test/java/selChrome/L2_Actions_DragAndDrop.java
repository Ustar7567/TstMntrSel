package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L2_Actions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we);
		WebElement we1= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement we2= driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(we1, we2).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
