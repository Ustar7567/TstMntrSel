package selChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F1_SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddwn=driver.findElement(By.name("employees_c"));
		Select slc=new Select(ddwn); //Creating object for Select class
		slc.selectByValue("level2");
		Thread.sleep(2000);
		slc.selectByIndex(3);
		Thread.sleep(2000);
		slc.selectByVisibleText("1 - 10 employees");
		Thread.sleep(2000);
		driver.quit();

	}

}
