package qa.pages;

import org.openqa.selenium.By;
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
    @FindBy(xpath = "//body/app-root/app-about-main[@class='ng-star-inserted']/app-header/div[@class='container position-sticky z-index-sticky top-0']/div[@class='row']/div[@class='col-12']/nav[@class='navbar navbar-expand-lg blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4']/div[@class='container-fluid px-0']/div[@id='navigation']/ul[@class='navbar-nav navbar-nav-hover ms-auto']/li[5]/a[1]")
    WebElement Events;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home-main[1]/app-header[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement ICSET;//Correct all xpaths
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
	@FindBy(xpath = "//button[normalize-space()='Apply Now']")
	WebElement Apply;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Number']")
	WebElement Number;
	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']//div[@class='text-center']")
	WebElement Register;
	@FindBy(xpath = "//li[@class='nav-item list-group-item border-0 p-0 ng-star-inserted']//h6[@class='dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0'][normalize-space()='Techathlon']")
	WebElement Techathlon;
	@FindBy(xpath = "//li[@class='nav-item list-group-item border-0 p-0 ng-star-inserted']//h6[@class='dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0'][normalize-space()='ICTAK Event1']")
	WebElement ICTAKevent;
	
	public void event_method()	
	{		//Use webelements directly
		Actions act=new Actions(driver);
		//act.moveToElement(Events).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//body/app-root/app-home-main/app-header/div[@class='container position-sticky z-index-sticky top-0']/div[@class='row']/div[@class='col-12']/nav[@class='navbar navbar-expand-lg blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4']/div[@class='container-fluid px-0']/div[@id='navigation']/ul[@class='navbar-nav navbar-nav-hover ms-auto']/li[5]/a[1]"))).build().perform();		
		act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home-main[1]/app-header[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/div[1]/ul[1]/li[1]/a[1]"))).build().perform();
		//act.moveToElement(ICSET).build().perform();
		ICSET.click();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='v-pills-home-tab']"))).build().perform();
		About.click();		
		act.moveToElement(driver.findElement(By.xpath("//a[@id='v-pills-profile-tab']"))).build().perform();
		Objectives.click();
		//driver.navigate().refresh();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']"))).build().perform();
		Overview.click();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='v-pills-settings-tab']"))).build().perform();
		Agenda.click();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='v-pills-download-tab']"))).build().perform();
		Training.click();
		//driver.navigate().back();
		
		
		
		//act.doubleClick(Apply).perform();
		//Name.findElement(By.xpath("//input[@placeholder='Name']"));
		//Name.sendKeys("Nisar");
		//Email.findElement(By.xpath("//input[@placeholder='Email']"));
		//Email.sendKeys("Nisar0075@gmail.com");
		//Number.findElement(By.xpath("//input[@placeholder='Number']"));
		//Number.sendKeys("9061000063");
		
		//act.moveToElement(driver.findElement(By.xpath("//form[@class='ng-pristine ng-invalid ng-touched']//div[@class='text-center']"))).build().perform();
		//act.doubleClick(Register).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item list-group-item border-0 p-0 ng-star-inserted']//h6[@class='dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0'][normalize-space()='Techathlon']"))).build().perform();
		Techathlon.click();
		//act.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item list-group-item border-0 p-0 ng-star-inserted']//h6[@class='dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0'][normalize-space()='ICTAK Event1']"))).build().perform();
		//ICTAKevent.click();
	
}
}

