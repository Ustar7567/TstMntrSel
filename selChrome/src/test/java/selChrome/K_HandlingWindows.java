package selChrome;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K_HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("//span[contains(text(),'Start my')]")).click();
		Set<String> winhnd=driver.getWindowHandles();
		System.out.println(winhnd);
		Iterator<String> itr=winhnd.iterator();
		String prnt=itr.next();
		System.out.println(prnt);
		String chld=itr.next();
		System.out.println(chld);
		driver.switchTo().window(chld);
		Thread.sleep(3000);
		driver.findElement(By.name("UserFirstName")).sendKeys("Manju");
		Thread.sleep(2000);
		driver.switchTo().window(prnt);

	}

}
