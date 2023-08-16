package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;

public class AddTariffPlanPage extends BaseClass {

	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement AddTariffplan;

	@FindBy(name = "rental")
	private WebElement MonthlyRental;

	@FindBy(name = "local_minutes")
	private WebElement Freelocmin;

	@FindBy(name = "inter_minutes")
	private WebElement FreeIntmin;

	@FindBy(name = "sms_pack")
	private WebElement Freesmspack;

	@FindBy(name = "minutes_charges")
	private WebElement Locpermincharge;

	@FindBy(name = "inter_charges")
	private WebElement Intpermincharge;

	@FindBy(name = "sms_charges")
	private WebElement Smspercharge;

	@FindBy(name = "submit")
	private WebElement SubmitBtn;

	public AddTariffPlanPage() {
		PageFactory.initElements(driver, this);
	}

	public void addTariffplanlink() {
		
		clickk(AddTariffplan);
	}	
	public void addTariffplanFuctionality(String monthrent, String freelocmin,String freeintmin ) {
		sendKeyss(MonthlyRental, monthrent);
		sendKeyss(Freelocmin, freelocmin);
		sendKeyss(FreeIntmin, freeintmin);
		}
		
	public void addTariffFuctinality(String freesms,String locpermincha,String intpermincha,String smspercha) {
		sendKeyss(Freesmspack, freesms);
		sendKeyss(Locpermincharge, locpermincha);
		sendKeyss(Intpermincharge, intpermincha);
		sendKeyss(Smspercharge, smspercha);
		
		
		}
		public void submitbtnn() {
			clickk(SubmitBtn);
		}

		
	}


