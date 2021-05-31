package selChrome;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D2_BasicMethodInWebDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();//Find element

		List<WebElement> we = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));//Find Elements
		System.out.println(we);
		driver.navigate().to("https://www.google.com");
		String str = driver.getWindowHandle();//get window handle
		System.out.println(str);
		driver.findElement(By.className("gb_g")).click();
		driver.findElement(By.linkText("For Work")).click();
		Set<String> wh = driver.getWindowHandles();//get window handles
		System.out.println(wh);
	}

}
