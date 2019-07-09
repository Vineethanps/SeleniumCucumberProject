package pom;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefinitions {
	WebDriver driver;
	@BeforeClass
	public void init() {
		//System.out.println("in before scenario");
		String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,Loginpage.class);
	}
	@AfterClass
	public void end() {
		driver.close();
	}
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get(string);
		
		
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Loginpage.email.sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Loginpage.password.sendKeys(string);
	}

	@Then("user is in webshop as {word}")
	public void user_is_in_webshop(String type) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Loginpage.signin.click();
		Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
	}
//	@Given("Admin of the test me app enters")
//	public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) {
//	   
//	 List<List<String>> list=dataTable.asLists();
//	 for(List<String> strings:list) {
//		 for(String s:strings) {
//			 System.out.print(s+"\t");
//		 }
//		 System.out.println("");
//	 }
//	}
	
}
