package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.name("search"));
		String value = "macbook";
		
		char[] ch = value.toCharArray();
		
		for(char c:ch) {
			
			act.sendKeys(search,String.valueOf(c)).pause(500).build().perform();
		}
		
		

	}

}
