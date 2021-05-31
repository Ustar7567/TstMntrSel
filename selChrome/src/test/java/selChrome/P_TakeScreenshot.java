package selChrome;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		Date crntdt=new Date();
		String scrnshtFileNm=crntdt.toString().replace(" ", "-").replace(":", "-");
		System.out.println(scrnshtFileNm);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		File scrnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnsht, new File(".//Screenshot//"+scrnshtFileNm+".png"));
		
		driver.close();
		

	}

}
