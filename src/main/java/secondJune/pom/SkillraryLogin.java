package secondJune.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author dhanu
 *
 */
public class SkillraryLogin {

	/**
	 * pom
	 * declaration
	 */
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	/**
	 * pom
	 * initialization
	 * @param driver
	 */
	public SkillraryLogin(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}
	
	/**
	 * pom
	 * utilization
	 */
	public void uName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void pWord(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void loggingIn()
	{
		loginButton.click();
	}
}
