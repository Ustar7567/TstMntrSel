package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_PrintAllLinksOfTheWebPage {
	//similar program can be used to print all elements with a specific tag(like input, select, option by changing 
	//the web-element methods in for loop if we wanna change what to print)

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		List<WebElement> we = driver.findElements(By.tagName("a"));//getting all web elements with a tag(links)
		System.out.println("Total tags are "+we.size());//printing how many links are there

		for (int i = 0; i < we.size(); i++) {
			System.out.println("links are "+we.get(i).getAttribute("href"));//printing the link of each instance of i
			System.out.println("Link is "+we.get(i).getText());//printing the link name of each instance of i

		}
		driver.quit();
	}
}
