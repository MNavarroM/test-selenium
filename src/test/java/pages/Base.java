package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	protected WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.Chrome", "C:\\Users\\Mario\\eclipse-workspace\\prueba-selenium\\src\\main\\resources\\chromedriver");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
		
	public String getAttribute(String attribute, By locator) {
		return driver.findElement(locator).getAttribute(attribute);
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public void write(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}
	
	public void visit(String url) {
		driver.get(url);
	}

}
