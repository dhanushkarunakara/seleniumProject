package secondJune.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogo {

	@FindBy(xpath="//b[text()='SkillRary']")
	private WebElement logo;
	
	public SkillraryLogo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogo() {
		return logo;
	}
}
