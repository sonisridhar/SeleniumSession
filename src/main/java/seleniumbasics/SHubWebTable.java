package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver =  new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		selectChkBx("Joe.Root");
		
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Joe.Root").get(2));
		
		if(getUserDetails("Joe.Root").get(2).equals("Enabled"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");

	}
	
	public static void selectChkBx(String userName) {
		
		By name = By.xpath("//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']");
		driver.findElement(name).click();
		
	}
	
public static ArrayList<String> getUserDetails(String userName) {
		
		By name = By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td");
		List<WebElement> info = driver.findElements(name);
		ArrayList<String> userDetails = new ArrayList<String>();
		for(WebElement e:info) {
			String text = e.getText();
			userDetails.add(text);
		}
		return userDetails;
	}
	
}
