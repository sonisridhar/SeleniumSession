package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	
	
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			String linkName = e.getText();
			if(linkName.length()!=0)
			    System.out.println(linkName);
		}
		
	}

}
