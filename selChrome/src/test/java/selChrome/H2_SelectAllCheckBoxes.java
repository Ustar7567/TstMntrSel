package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H2_SelectAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement we= driver.findElement(By.xpath("//iframe[@value='Request a Demo']"));
		Actions act=new Actions(driver);
		act.moveToElement(we);
		act.perform();
		List<WebElement> we1= driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);
		for (WebElement el : we1) {
			if(!el.isSelected()) {
				el.click();

			}
			
		}

	}

}
