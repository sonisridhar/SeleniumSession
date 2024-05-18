package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By logo = By.id("logo7");
		boolean flag = eleUtil.isElementExist(logo);
		if(flag)
			System.out.println("pass");
		else
			System.out.println("Fail");
	}

}
