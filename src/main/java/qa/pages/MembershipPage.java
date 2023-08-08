package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class MembershipPage extends BaseClass{
	public MembershipPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="//body/app-root/app-about-main[@class='ng-star-inserted']/app-header/div[@class='container position-sticky z-index-sticky top-0']/div[@class='row']/div[@class='col-12']/nav[@class='navbar navbar-expand-lg blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4']/div[@class='container-fluid px-0']/div[@id='navigation']/ul[@class='navbar-nav navbar-nav-hover ms-auto']/li[2]/a[1]")
	WebElement membershipMenu;
	
	@FindBy(xpath="//a[@routerlink='/adminpage/academic']")
	WebElement acadamicMembership;
	
	@FindBy(xpath="//a[@routerlink='/adminpage/corporate']")
	WebElement corporateMembership;
	
	@FindBy(xpath="//a[@routerlink='/adminpage/partnership']")
	WebElement partnership;
	
	@FindBy(css=".btn.bg-gradient-primary.btn-sm.mb-0")
	WebElement acadamicDownload;
	
	@FindBy(css=".btn.bg-gradient-primary.btn-sm.mb-0")
	WebElement corporateDownload;
	
	@FindBy(css=".btn.bg-gradient-primary.btn-sm.mb-0")
	WebElement partnershipDownload;
	
	public void hoverOverMembershipMenu() {
		Actions actions  = new Actions(driver);
		actions.moveToElement(membershipMenu).build().perform();
	}	  
	public void clickAcadamicMembership() {
		acadamicMembership.click();
		acadamicDownload.click();
	}
	public void clickCorporateMembership() {
    	corporateMembership.click();
    	corporateDownload.click();
    }
    public void clickPartnership() {
    	partnership.click();
    	partnershipDownload.click();
    }
      
}
