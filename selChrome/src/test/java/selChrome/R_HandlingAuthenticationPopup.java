package selChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class R_HandlingAuthenticationPopup {
	
	public static String un="admin"; //from xls or csv
	public static String pw="admin"; //from xls or csv

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth"); //if we give this link, it asks for authentication
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");  //append admin:admin@ like this to authenticate
		driver.get("http://"+un+":"+pw+"@"+"the-internet.herokuapp.com/basic_auth");
		//in the above step, basically we are opening http://the-internet.herokuapp.com/basic_auth and providing admin and admin
		//in both un and pwd fields for authentication

	}

}
