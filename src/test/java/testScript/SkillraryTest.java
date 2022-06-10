package testScript;


import org.testng.annotations.Test;

import genericLib.BaseClass;
import secondJune.pom.SkillraryLogin;
import secondJune.pom.SkillraryLogo;

public class SkillraryTest extends BaseClass{

	@Test
	public void test() {
		
		SkillraryLogin skillLogin = new SkillraryLogin(driver);
		skillLogin.uName("admin");
		skillLogin.pWord("admin");
		skillLogin.loggingIn();		
		
		SkillraryLogo logoLocation = new SkillraryLogo(driver);
		wDUtility.mouseHover(driver,logoLocation.getLogo());
		
	}
	
	
}