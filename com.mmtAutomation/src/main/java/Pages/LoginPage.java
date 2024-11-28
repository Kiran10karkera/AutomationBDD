package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	String resourceUrl="https://www.makemytrip.com/";
	WebDriver driver= new ChromeDriver();
	public void openTheUrl() {
		driver.get(resourceUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
