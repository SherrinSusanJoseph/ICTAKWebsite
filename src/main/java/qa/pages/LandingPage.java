package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class LandingPage extends BaseClass{
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(partialLinkText = "Home")
    WebElement HomeLink;
     
    @FindBy(partialLinkText = "About")
    WebElement AboutUsLink;
    
    @FindBy(xpath="(//a[@id='dropdownMenuBlocks'])[1]")
    WebElement CousesDropdown;
   
    @FindBy(xpath="(//li[@class='nav-item dropdown dropdown-hover mx-2'])[4]")
    WebElement MembershipsDropdown;
    
    @FindBy(xpath="(//li[@class='nav-item dropdown dropdown-hover mx-2'])[5]")
    WebElement EventsDropdown;
    
    @FindBy(partialLinkText="Contact")
    WebElement ContactUsLink;

	public void home() {
		HomeLink.click();	
	}
	public void aboutUs() {
		AboutUsLink.click();	
	}
	public void courses() {
		CousesDropdown.click();	
	}
	public void memberships() {
		MembershipsDropdown.click();	
	}
	public void events() {
		EventsDropdown.click();	
	}
	public void contactUs() {
		ContactUsLink.click();	
	}
}
