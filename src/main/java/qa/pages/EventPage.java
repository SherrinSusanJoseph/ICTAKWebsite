package qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class EventPage extends BaseClass{
	public EventPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
   
	@FindBy(xpath = "(//ul[@class='navbar-nav navbar-nav-hover ms-auto'])[1]")
	WebElement Events;
	
	@FindBy(xpath = "(//span[@class='text-sm'][normalize-space()='Academic and industrial conclave'])[1]")
	WebElement ICSET;
	@FindBy(xpath = "//h1[normalize-space()='ICSET']")
	WebElement Icset_valid;
	@FindBy(xpath = "//h1[normalize-space()='Techathlon']")
	WebElement Techathlon_valid;
	
	
	@FindBy(xpath = "//a[@id='v-pills-home-tab']")
	WebElement About;	
	@FindBy(xpath = "//a[@id='v-pills-profile-tab']")
	WebElement Objectives;
	@FindBy(xpath = "//a[@id='v-pills-messages-tab']")
	WebElement Overview;
	@FindBy(xpath = "//a[@id='v-pills-settings-tab']")
	WebElement Agenda;
	@FindBy(xpath = "//a[@id='v-pills-download-tab']")
	WebElement Training;
	@FindBy(className = "text-sm")
	WebElement Techathlon;
	
	@FindBy(className = "nav-link ps-2 d-flex cursor-pointer align-items-center")
	WebElement ICTAKevent;
	public void eventdropdown()
	{
		Events.click();
		ICSET.click();
		Techathlon.click();
		ICTAKevent.click();
	}
	public void icset_click()
	{
		About.click();
		Objectives.click();
		Overview.click();
		Agenda.click();
		Training.click();
	}
	public String icset_valid()
	{
		String msg1=Icset_valid.getText();
		return msg1;		
	}
	public String techathlon_valid()
	{
		String msg2=Techathlon_valid.getText();
		return msg2;		
	}
	
	
		
	
	
	
	
}


