package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
//		String tableContent = driver.findElement(By.xpath("//table[@id='customers']/tbody")).getText();
//		System.out.println(tableContent);
//		
		
		int row = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int actRowCount = row-1;
		System.out.println(actRowCount);
		
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println(columnCount);

	}

}
