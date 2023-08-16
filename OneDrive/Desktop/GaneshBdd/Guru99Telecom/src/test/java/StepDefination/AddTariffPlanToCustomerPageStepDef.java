package StepDefination;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddTariffPlanToCustomerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTariffPlanToCustomerPageStepDef extends BaseClass{

	public static AddTariffPlanToCustomerPage addtariffplantocustomer;
	@When("User is on Home page then click on add tariff to customer plan link")
	public void user_is_on_home_page_then_click_on_add_tariff_to_customer_plan_link() {
		addtariffplantocustomer=new AddTariffPlanToCustomerPage();
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, "Guru99 Add Tariff Plan to Customer");
		addtariffplantocustomer.clickOnAddTariffPlanToCustomer();
	}

	@Then("user enter customer id")
	public void user_enter_customer_id() {
		addtariffplantocustomer.AddTariffPlanToCustomerPageFuntinality(AddCustomerStep.custid);
	}
	@Then("clicked on submit button")
	public void clicked_on_submit_button() {
		addtariffplantocustomer.clickOnSubmitButton();
	}
}
