package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.qdox.model.expression.Constant;

import Util.ConstantMmt;

public class LoginPage {
	
	ConstantMmt constant = new ConstantMmt();
	
	String expectedTab ="//li[.='tabName']";
	String emailButton ="//img[@class=\"appendLeft15 mousePointer signInByEmailButton\"]";
	String emailTextField="//input[@placeholder=\"Enter Email Address\"]";
	String continueButton="//button[@class=\"capText font16\"]";
	
	WebDriver driver= new ChromeDriver();
	public void openTheUrl() {
		driver.get(constant.resourceUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public String verifyPageLoaded() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public String verifyExpectedTabSelected(String expectedTabName) {
		String finalXpath=expectedTab.replaceAll("tabName", expectedTabName);
	return driver.findElement(By.xpath(finalXpath)).getCssValue("background-image");
	}
	
	public void userClicksOnEmailButton() {
		driver.findElement(By.xpath(emailButton)).click();
	}
	
	
	public Boolean verifyContinueButtonEnabled() {
		return driver.findElement(By.xpath(continueButton)).isEnabled();
	}
	public void userClicksOnEmailTextField(String string) {
		driver.findElement(By.xpath(emailTextField)).click();
	}
	
	
	

}
