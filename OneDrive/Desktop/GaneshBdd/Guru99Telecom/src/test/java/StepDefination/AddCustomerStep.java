package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerPage;
import PageLayer.AddTariffPlanPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerStep extends BaseClass {

	private static AddTariffPlanPage atp;
	private static AddCustomerPage acp;
	public static String custid;
	
	@Given("User is on home page and click on add customer link")
	public void user_is_on_home_page_and_click_on_add_customer_link() {
		initialization();
		acp = new AddCustomerPage();
		acp.addCustomerPageLink();

	}

//	@When("User is on add customer page validate url")
//	public void user_is_on_add_customer_page_validate_url() {
//	  
//		String url=driver.getCurrentUrl();
//		Assert.assertEquals(url.contains("addcusto"), true);
//		
//		
//	}

	@Then("User valiadte background check radio button")
	public void user_valiadte_background_check_radio_button() {
		acp.backgrdRadiobtn("Done");

	}

	@Then("User enter firstname and lastname and email and address and mobile number")
	public void user_enter_firstname_and_lastname_and_email_and_address_and_mobile_number() {
		acp.billingAddr("Gt", "Hulk", "gth1@gmail.com", "Pune", "123467890");

	}

	@Then("User click on submit button")
	public void user_click_on_submit_button() {
		acp.submitbtnn();

	}
	@Then("Capture customer id")
	public void capture_customer_id() {
		
	custid= acp.customerId();
	System.out.println(custid);
	}

	@Then("click on home button")
	public void click_on_home_button() {
	   acp.homebtn();
	}
	@When("User is on home page then click on add tariff plan link")
	public void user_is_on_home_page_then_click_on_add_tariff_plan_link() {
	  
		 atp= new AddTariffPlanPage();
		atp.addTariffplanlink();
	
	}

	@Then("user enter monthly rental and free local minutes and free international minutes")
	public void user_enter_monthly_rental_and_free_local_minutes_and_free_international_minutes() {
		atp.addTariffplanFuctionality("400", "1000", "700");
	    
	}

	@Then("user enter free sms pack and local per minutes charges and international per minutes charges and sms per charges")
	public void user_enter_free_sms_pack_and_local_per_minutes_charges_and_international_per_minutes_charges_and_sms_per_charges() {
	   atp.addTariffFuctinality("100", "200", "300", "150");
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	    atp.submitbtnn();
	}
	
	
	
	
	
	
	
}
