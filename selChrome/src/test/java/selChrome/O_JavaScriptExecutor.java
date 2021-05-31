package selChrome;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class O_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//Print title of the page
		String script= ("return document.title;");
		String title= (String) js.executeScript(script);
		System.out.println(title);
		//Click a button
		driver.switchTo().frame("iframeResult");
		js.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//Highlight a button
		WebElement we=driver.findElement(By.xpath("//button[text()='Try it']"));
		js.executeScript("arguments[0].style.border='3px solid red'", we);
		//Scroll down
		driver.navigate().to("https://www.w3schools.com");
		WebElement we1=driver.findElement(By.xpath("//a[text()='COURSES' and @class='w3-button w3-white w3-hide-small w3-round w3-hide-medium w3-left']"));
		js.executeScript("arguments[0].scrollIntoView(true);", we1);
		Thread.sleep(2000);
		
		driver.close();

	}

}
