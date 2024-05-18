package seleniumbasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRegLeftSideLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By leftPannelLinks = By.xpath("//aside[@id='column-right']//a");
		
		int totalLinkCounts = eleUtil.getElementsCount(leftPannelLinks);
		System.out.println("total links count: "+totalLinkCounts);
		
		ArrayList<String> leftLinkLists = eleUtil.getElementTextList(leftPannelLinks);
		System.out.println(leftLinkLists);
		System.out.println("-----------------------------");
		if(leftLinkLists.contains("Register")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}

	}

}
