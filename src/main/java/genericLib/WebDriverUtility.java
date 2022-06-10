package genericLib;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public static WebDriver driver;
	
	public void dropdown(WebElement ele, String text) {

		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele2) {

		Actions action = new Actions(driver);
		action.moveToElement(ele2).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement ele3) {

		Actions action = new Actions(driver);
		action.doubleClick(ele3).perform();
	}
	
	public void switchFrame(WebDriver driver) {

		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver) {

		driver.switchTo().defaultContent();
	}
	
	public void alertPopup(WebDriver driver) {

		driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver driver) {

		Set<String> windows = driver.getWindowHandles();
		for (String wb : windows) {
			driver.switchTo().window(wb);
		}
	}
}
