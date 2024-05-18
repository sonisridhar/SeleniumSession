package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_SendKeys {

	static WebDriver driver;
	static ElementUtil eleUtil;

	public static void main(String[] args) throws InterruptedException {
		driver =  new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		eleUtil = new ElementUtil(driver);
		
		
		By email = By.id("input-email");
		By pwd = By.name("password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		doActSendKeys(email, "test_soni@opencart.com");
		doActSendKeys(pwd, "test@123");
		doActClick(loginBtn);
		
	}
	
	public static void doActSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(eleUtil.getElement(locator), value).perform();;
		
	}
	
	public static void doActClick(By locator) {
		Actions act = new Actions(driver);
		act.click(eleUtil.getElement(locator)).perform();;
		
	}

}
