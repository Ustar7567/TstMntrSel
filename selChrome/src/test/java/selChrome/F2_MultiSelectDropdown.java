package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F2_MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement multiSel = driver.findElement(By.id("multi-select"));
		Select mul = new Select(multiSel);
		mul.selectByIndex(3);
		Thread.sleep(2000);
		mul.selectByValue("California");
		Thread.sleep(2000);
		mul.selectByVisibleText("Florida");
		Thread.sleep(2000);
		List<WebElement> lst = mul.getAllSelectedOptions();
		System.out.println(lst.size());
		WebElement we=mul.getFirstSelectedOption();
		System.out.println(we.getText());
		mul.deselectByIndex(3);
		Thread.sleep(2000);
		List<WebElement> lst1 = mul.getAllSelectedOptions();
		System.out.println(lst1.size());
		mul.deselectAll();
		Thread.sleep(2000);
		List<WebElement> lst2 = mul.getAllSelectedOptions();
		System.out.println(lst2.size());

		driver.quit();

	}

}
