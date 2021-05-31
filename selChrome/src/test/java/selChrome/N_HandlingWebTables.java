package selChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class N_HandlingWebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//Step1: If the table is located in another frame, find the frame
		//Step2: Find the no.of rows in the table
		//Step3: Find the no. of columns in the table
		//Using for loop, print each element of the table by using get text.

		List<WebElement> list1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(list1.size());

		List<WebElement> list2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		System.out.println(list2.size());

		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= 3; j++) {
				//System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText()+" ");
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());

			}
			System.out.println();
		}

	}

}
