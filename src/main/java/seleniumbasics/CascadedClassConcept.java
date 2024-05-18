package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");//InvalidSelectorException
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("testngggggg@gmail.com");
		
		driver.findElement(By.cssSelector("input.login-email")).sendKeys("testngggggg@gmail.com");
	}

}
