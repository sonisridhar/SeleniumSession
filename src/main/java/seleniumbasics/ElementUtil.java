package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
private WebDriver driver;


	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
				try {
					element =  driver.findElement(locator);
										
				}catch(NoSuchElementException e) {
					System.out.println("Element is not present on the page");
				}
		return element;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public ArrayList<String> getElementTextList(By locator) {
		
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public ArrayList<String> getElementAttributeList(By locator, String att_Value) {
		
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e:eleList) {
			String attValue = e.getAttribute(att_Value);
			if(attValue.length()!=0)
				eleTextList.add(attValue);
		}
		return eleTextList;
	}
	
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).clear(); 
		getElement(locator).sendKeys(value);
	}
	
	public void click(By locator) {
		getElement(locator).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public boolean isElementExist(By locator) {
		if(getElementsCount(locator)==1)
			return true;
		else
			return false;
	}
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public String getAttributeValue(By locator, String Att_Value) {
		return getElement(locator).getAttribute(Att_Value);
	}
	
	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByVisibleText(By locator, String text) {
		
		nullBlankChk(text);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectByValue(By locator, String value) {
		
		nullBlankChk(value);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> allOptions =select.getOptions();
		for(WebElement e:allOptions) {
			String text = e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	public int getDropDownValuesCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public void doSearch(By searchFieldLocator, By searchSuggLocator, String value, String expValue) throws InterruptedException {
		
		doSendKeys(searchFieldLocator, value);
		Thread.sleep(3000);
		List<WebElement> elements = getElements(searchSuggLocator);
		for(WebElement e: elements) {
			String text = e.getText();
			if(text.contains(expValue)) {
				e.click();
				break;
			}
			System.out.println(text);
		}
		
	}
	
	private void nullBlankChk(String value) {
		if(value==null||value.length()==0)
			throw new MyElementException("Visible text can't be null");
	}
	
	
	}


