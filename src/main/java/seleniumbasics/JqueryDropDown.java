package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;
	static ElementUtil ele;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		ele = new ElementUtil(driver);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.manage().window().maximize();

		By searchField1 = By.id("justAnInputBox");
		By options = By.xpath("(//div[contains(@id,'DropDownContainer')])[1]//ul//li");
		//choiceList(searchField1, options, "choice 2 3", "choice 1", "choice 5", "choice 6 2 3");
		choiceList(searchField1, options, "all");

	}

	public static void choiceList(By drpdwnLocator, By optionsLocator, String... value) throws InterruptedException {
		ele.click(drpdwnLocator);
		Thread.sleep(3000);
		List<WebElement> options1 = ele.getElements(optionsLocator);
		System.out.println(options1.size());
		if (value[0].equals("all")) {
			for (WebElement e : options1) {
				e.click();
				Thread.sleep(1000);
			}

		} else {
			for (WebElement e : options1) {
				String text = e.getText();
				System.out.println(text);

				for (String val : value) {
					if (text.equals(val)) {
						e.click();
						break;

					}
				}
			}
		}
	}

}
