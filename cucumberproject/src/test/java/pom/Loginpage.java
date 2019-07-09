package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	@FindBy(how=How.ID,using="Email")
	static public WebElement email;
	@FindBy(how=How.ID,using="Password")
	static public WebElement password;
	@FindBy(how=How.CSS,using="input[value='log in']")
	static public WebElement signin;
	@FindBy(how=How.LINK_TEXT,using="Log Out")
	static public WebElement signout;
}
