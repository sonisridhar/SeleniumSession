package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Tab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.name("firstname"));
		
		act.sendKeys(search,"soni")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Srid")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Srid@opencart.com")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("9874561230")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Srid@123")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Srid@123")
		.build().perform();
	}

}
