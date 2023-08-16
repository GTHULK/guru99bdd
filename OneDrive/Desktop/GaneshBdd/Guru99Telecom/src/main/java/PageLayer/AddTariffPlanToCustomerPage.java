package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class AddTariffPlanToCustomerPage extends BaseClass
{
	@FindBy(xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement addTariff;
	@FindBy(xpath="//input[@id='customer_id']")
	private WebElement customeId;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement SubmitBtn;
	
	public AddTariffPlanToCustomerPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnAddTariffPlanToCustomer()
	{
	clickk(addTariff);
	}
	
	public void AddTariffPlanToCustomerPageFuntinality( String customerid)
	{		
		sendKeyss(customeId,customerid);
	}
	public void clickOnSubmitButton()
	{
	clickk(SubmitBtn);
	}
}
