package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1_BasicMethodsInWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com"); //get()
		driver.manage().window().maximize(); //manage()
		String a= driver.getCurrentUrl(); //getCurrentUrl()
		System.out.println(a);
		String b=driver.getTitle();//getTitle()
		System.out.println(b);
		driver.navigate().to("https://krninformatix.com/sample.html"); //navigate() Note:navigate().to("url")
		String c=driver.getPageSource(); //getPageSource()
		System.out.println(c);
		driver.close(); //close()
		driver.quit(); //quit()


	}

}
