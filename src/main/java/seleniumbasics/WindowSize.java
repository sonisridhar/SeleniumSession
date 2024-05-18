package seleniumbasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = new Dimension(500, 900);
		driver.manage().window().setSize(dim);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();

	}

}
