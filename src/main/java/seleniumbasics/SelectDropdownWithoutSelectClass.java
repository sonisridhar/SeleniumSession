package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		By country = By.xpath("//Select[@id='Form_getForm_Country']//option");
		List<WebElement> optionList = ele.getElements(country);
		System.out.println(optionList.size());
		for(WebElement e: optionList) {
			String text = e.getText();
			if(text.equals("India")) {
				e.click();
				break;
			}
				
		}
		

	}

}
