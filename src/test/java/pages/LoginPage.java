package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class LoginPage extends Base{
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginButtom = By.id("login-button");
	private By errorMesage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String username, String password) throws AssertionError {
		try {
			write(username, this.username);
			write(password,this.password);
			click(loginButtom);
		} catch (AssertionError e) {
			throw e;
		}
		
	}
	
	public void loginError(String username, String password) throws AssertionError {
		write(username, this.username);
		write(password,this.password);
		click(loginButtom);			
	}
	
	public String getErrorMessage() {
		return getText(errorMesage);
	}	
	
}
