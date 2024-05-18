package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	public static void main(String[] args) {
		// get all links
		//capture href value
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		
		List<WebElement> totalLinks =driver.findElements(By.tagName("a"));
		System.out.println(totalLinks.size());
		
		for(WebElement e: totalLinks) {
			String value = e.getAttribute("href");
			if(value!=null)
			  System.out.println(value);
		}

	}

}
