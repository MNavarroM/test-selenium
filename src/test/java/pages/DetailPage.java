package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DetailPage extends Base{

	private WebDriver driver;
	
	private By imgItem = By.className("inventory_details_img");

	public DetailPage(WebDriver driver) {
		super(driver);
	}

	
	public String getUrlImage() {
		return getAttribute("src", imgItem);		
	}

	public boolean checkPageUrl() {
		return driver.getCurrentUrl().equals("https://ejemplo.com/login");
	}

	
}
