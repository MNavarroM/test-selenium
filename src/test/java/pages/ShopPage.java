package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ShopPage extends Base{
	
	private By logo = By.className("app_logo");
	private By photoItem = By.xpath("//img[@class='inventory_item_img']");
	private By btnBurger = By.id("react-burger-menu-btn");
	private By btnMenu = By.xpath("//*[@class='bm-item menu-item']");
	private By addButtons = By.className("btn_inventory");
	private By sorter = By.xpath("//option[1]");
	private By footer = By.className("footer_copy");
	
	public ShopPage(WebDriver driver) {
		super(driver);
	}

	
	public String getUrlPhotoItem(int item) {
		return this.driver.findElements(photoItem).get(item).getAttribute("src");
	}
	
	public String getLogoName() {
		return getText(logo);
	}
	
	public String getButtonItemText(int item) {
		return findElements(addButtons).get(item).getText();
	}
	
	public int getNumItems() {
		return findElements(addButtons).size();
	}


	public void clickItem() {
		findElements(photoItem).get(0).click();		
	}
	
	public void clickAddToCart(int item) {
		findElements(addButtons).get(item).click();		
	}
	
	public List<WebElement> getListaMenu() {
		click(btnBurger);
		return findElements(btnMenu);		
	}
	
	public String getTextSorter() {
		return getText(sorter);
	}
	
	public String getTextFooter() {
		return getText(footer);
	}
	
	
	
}
