package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://html.com/attributes/select-multiple/");
		
		driver.manage().window().maximize();
		
		By multiDropdown = By.xpath("//select[@multiple]");
		Select select = new Select(ele.getElement(multiDropdown));
		
		if(select.isMultiple()) {
			System.out.println("multi select is possible");
			
		select.selectByVisibleText("American flamingo");
		select.selectByVisibleText("Andean flamingo");
		select.selectByVisibleText("Greater flamingo");
		select.selectByVisibleText("Lesser flamingo");
		}
		select.deselectAll();
		
	}

}
