package seleniumbasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println(eleUtil.getElementsCount(images));
		System.out.println(eleUtil.getElementsCount(links));
		
		ArrayList<String> linksList  =eleUtil.getElementTextList(links);
		System.out.println(linksList);
		System.out.println("----------------------------------");
		if(linksList.contains("Mobiles")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("----------------------------------");
		ArrayList<String> imgList  = eleUtil.getElementAttributeList(images, "alt");
		
		System.out.println(imgList);
		System.out.println("----------------------------------");
		if(imgList.contains("Refrigerators"))
			System.out.println("AVAILABLE");
		else
			System.out.println("NOT AVAILABLE");

	}

}
