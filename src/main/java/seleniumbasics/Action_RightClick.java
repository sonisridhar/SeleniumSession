package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_RightClick {

	static WebDriver driver;
	static ElementUtil eleUtil;

	public static void main(String[] args) throws InterruptedException {
		driver =  new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		eleUtil = new ElementUtil(driver);
		Thread.sleep(5000);
		
		WebElement targtEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(targtEle).perform();
		
		List<WebElement> rightElements = driver.findElements(By.cssSelector("ul.context-menu-list li"));
		for(WebElement e: rightElements) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
