package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MultiLevelMenuHandling {

	static WebDriver driver;
	static ElementUtil eleUtil;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		// driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		eleUtil = new ElementUtil(driver);
		Thread.sleep(5000);
		
		By level1Menu = By.xpath("(//span[text()='Shop by'])[last()]");
		By level2SubMenu = By.linkText("Beverages");
		By level3SubMenu = By.linkText("Tea");
		By level4SubMenu = By.linkText("Green Tea");
		handleMultiLevelSubMenu(level1Menu, level2SubMenu, level3SubMenu, level4SubMenu);
		
	}
	
	
	public static void handleMultiLevelSubMenu(By level1,By level2, By level3,By level4) throws InterruptedException {
		eleUtil.getElement(level1).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(eleUtil.getElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(eleUtil.getElement(level3)).perform();
		Thread.sleep(1000);
		eleUtil.getElement(level4).click();
		
	}

}
