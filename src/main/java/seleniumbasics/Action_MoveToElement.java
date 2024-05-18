package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MoveToElement {

	static WebDriver driver;
	static ElementUtil eleUtil;

	public static void main(String[] args) throws InterruptedException {
		driver =  new ChromeDriver();
		//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		eleUtil = new ElementUtil(driver);
		Thread.sleep(5000);
		
		
		//driver.switchTo().alert().accept();
		
//		By content = By.cssSelector(".menulink");
//		By courseLink = By.linkText("COURSES");
//		
//		moveElement(content, courseLink);
		
		By addOnLink = By.xpath("//div[text()='Add-ons']");
		By visaLink = By.xpath("//div[text()='Visa Services']");
		moveElement(addOnLink, visaLink);
		

	}
	
	public static void moveElement(By source, By dest) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(eleUtil.getElement(source)).perform();
		Thread.sleep(2000);
		eleUtil.getElement(dest).click();
		
		
	}

}
