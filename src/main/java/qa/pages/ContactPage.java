package qa.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class ContactPage extends BaseClass {
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);			
	}
	@FindBy(xpath = "//body/app-root/app-contactus[@class='ng-star-inserted']/app-header/div[@class='container position-sticky z-index-sticky top-0']/div[@class='row']/div[@class='col-12']/nav[@class='navbar navbar-expand-lg blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4']/div[@class='container-fluid px-0']/div[@id='navigation']/ul[@class='navbar-nav navbar-nav-hover ms-auto']/li[6]/a[1]")
	WebElement Contact;
	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement Name;
	@FindBy(xpath = "//input[@placeholder='Email id']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='What you love']")
	WebElement Looking;
	@FindBy(xpath = "//input[@id='message']")
	WebElement WantTo;
	@FindBy(xpath = "//div[@class='col-md-6 text-end ms-auto']")
	WebElement SendMsg;
	public void contact_method()
	{
		Actions act=new Actions(driver);
		act.moveToElement(Contact).build().perform();
		Contact.click();
		
	}

}
