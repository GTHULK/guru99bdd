package PageLayer;


import static UtilityLayer.UtilsClass.clickk;
import static UtilityLayer.UtilsClass.sendKeyss;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;

public class AddCustomerPage extends BaseClass {

	@FindBy(xpath = "//a[text()='Add Customer'][1]")
	private WebElement AddCustLink;

	@FindBy(xpath = "//input[@name='active']")
	private List<WebElement> BackgroundRadiobtn;

	@FindBy(id = "fname")
	private WebElement Firstname;

	@FindBy(id = "lname")
	private WebElement Lastname;

	@FindBy(id = "email")
	private WebElement Email;

	@FindBy(name = "addr")
	private WebElement Address;

	@FindBy(id = "telephoneno")
	private WebElement MobileNum;

	@FindBy(name = "submit")
	private WebElement Submitbtn;
	
	@FindBy(xpath="//b[text()='Customer ID']/following::h3")
	private WebElement CustomId;
	
	@FindBy (xpath="//a[@class='button']")
	private WebElement HomeBtn;

	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	public void addCustomerPageLink() {

		clickk(AddCustLink);
	}

	public void backgrdRadiobtn(String name) {
	backgroundRadioBtnn(BackgroundRadiobtn, name);
	}


	public void billingAddr(String fname, String lname, String email, String addr, String mob) {
		sendKeyss(Firstname, fname);
		sendKeyss(Lastname, lname);
		sendKeyss(Email, email);
		sendKeyss(Address, addr);
		sendKeyss(MobileNum, mob);
	}

	public void submitbtnn() {
		clickk(Submitbtn);
	}
	
	public String customerId() {
		return CustomId.getText();
	}
	
	public void homebtn() {
		clickk(HomeBtn);
	}
	

}
