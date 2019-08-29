package org.cts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample {
	static WebDriver driver;
	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
	    System.setProperty("webdriver.chrome.driver","H:\\Arul\\Cucumber1\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    
	}

/*	@Given("User click add customer link")
	public void user_click_add_customer_link() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();    
	}

	@When("User will provide valid details")
	public void user_will_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
		 Map <String,String> asMap = dataTable.asMap(String.class, String.class);
		 driver.findElement(By.xpath("//label[text()='Done']")).click(); 
		 driver.findElement(By.id("fname")).sendKeys(asMap.get("fname"));
			driver.findElement(By.id("lname")).sendKeys(asMap.get("lname"));
			driver.findElement(By.id("email")).sendKeys(asMap.get("email"));
			driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(asMap.get("address"));
			driver.findElement(By.id("telephoneno")).sendKeys(asMap.get("Phno"));
			driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("To verified the customer id is displayed")
	public void to_verified_the_customer_id_is_displayed() {
		
			Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}*/


	@Given("User click add tariff plan")
	public void User_click_add_tariff_plan() {
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

/*	@When("User provide valid details")
	public void User_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> twodimen = dataTable.asLists(String.class);
			driver.findElement(By.id("rental1")).sendKeys(twodimen.get(0).get(0));
		    driver.findElement(By.id("local_minutes")).sendKeys(twodimen.get(0).get(1));
		    driver.findElement(By.id("inter_minutes")).sendKeys(twodimen.get(0).get(2));
		    driver.findElement(By.id("sms_pack")).sendKeys(twodimen.get(1).get(3));
		    driver.findElement(By.id("minutes_charges")).sendKeys(twodimen.get(1).get(4));
		    driver.findElement(By.id("inter_charges")).sendKeys(twodimen.get(0).get(5));
		    driver.findElement(By.id("sms_charges")).sendKeys(twodimen.get(0).get(6));
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
*/	
	@When("User provide valid details")
	public void User_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> twodiMap = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(twodiMap.get(0).get("Rental"));
	    driver.findElement(By.id("local_minutes")).sendKeys(twodiMap.get(0).get("Localmins"));
	    driver.findElement(By.id("inter_minutes")).sendKeys(twodiMap.get(0).get("Internationalmins"));
	    driver.findElement(By.id("sms_pack")).sendKeys(twodiMap.get(1).get("FreeSMS"));
	    driver.findElement(By.id("minutes_charges")).sendKeys(twodiMap.get(1).get("LocalChrgs"));
	    driver.findElement(By.id("inter_charges")).sendKeys(twodiMap.get(0).get("InternationalChrgs"));
	    driver.findElement(By.id("sms_charges")).sendKeys(twodiMap.get(1).get("SMSChgs"));
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	  	}
	@Then("Verify the output")
	public void Verify_the_output() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		}

}
