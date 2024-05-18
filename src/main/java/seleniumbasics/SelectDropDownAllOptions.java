package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		
		/**
		 * Interview: not allowed to use 3 methods, selectBYIndex(), selectByVisibleText(),selectByValue()
		 * how to select dropdown value
		 * answer is getOptions()
		 */
		
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		By country = By.id("Form_getForm_Country");
		
		ele.doSelectDropDownValue(country, "India");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(country);
//		
//		List<WebElement> countryOptions = select.getOptions();
//		System.out.println(countryOptions.size());
//		
//		for(WebElement e: countryOptions) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//			System.out.println(text);
//		}

	}

}
