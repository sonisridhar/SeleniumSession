package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestion {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		By searchField = By.name("q");
		By searchSuggestion = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']//span");
		
		ele.doSearch(searchField, searchSuggestion, "naveen auto", "automationlabs selenium");
		

	}

}
