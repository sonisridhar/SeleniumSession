package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(2000);
		selectContact("QABI QABI");
		selectCompany("QABI QABI");
		String companyName =selectCompany("QABI QABI");
		System.out.println("company name is :"+companyName); 
		String phone =getPhoneNumber("QABI QABI");
		System.out.println(" name is :"+phone); 
		

		
	}

	public static void selectContact(String name) {
		By xpath = By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input");
		driver.findElement(xpath).click();
		
	}
	
	public static String selectCompany(String name) {
		By xpath = By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td/a[@context='company']");
		return driver.findElement(xpath).getText();
	}
	
	public static String getPhoneNumber(String name) {
		By xpath = By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td/span[@context='phone']");
		return driver.findElement(xpath).getAttribute("_number");
		
	}
	
	
}
