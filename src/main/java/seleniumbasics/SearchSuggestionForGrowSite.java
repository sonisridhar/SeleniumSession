package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestionForGrowSite {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://www.groww.in");
		
		driver.manage().window().maximize();
		
		By searchField = By.xpath("//input[contains(@id,'globalSearch')]");
		By searchSuggestion = By.xpath("//div[@id='globalSearch23-suggestions']//div[@class='gsc23SuggestionText']");
		
		ele.doSendKeys(searchField, "reliance");
		Thread.sleep(3000);
		List<WebElement> elements = ele.getElements(searchSuggestion);
		for(WebElement e: elements) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
