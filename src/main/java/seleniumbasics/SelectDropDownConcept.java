package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(country);
		
		select.selectByIndex(5);
		select.selectByVisibleText("India");
		select.selectByValue("Angola");
		
	}
	
	

}
