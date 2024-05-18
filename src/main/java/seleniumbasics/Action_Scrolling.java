package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		WebElement target = driver.findElement(By.linkText("Brands"));
		act.scrollToElement(target).click(target).build().perform();
		
	}

}
