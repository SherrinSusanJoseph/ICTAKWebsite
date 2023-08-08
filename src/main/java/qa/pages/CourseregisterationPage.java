package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class CourseregisterationPage extends BaseClass {
	
	private WebDriver driver;

	public CourseregisterationPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


@FindBy(xpath ="//a[@routerlink='/adminpage/registered-users']")
WebElement CourseregistrationLink;

@FindBy(xpath = "//button[contains(text(),'Download')]")
WebElement Downloadbutton;

//@FindBy(xpath="//tbody[1]/tr[1]/td[10]/i[1]")


@FindBy(css = ".btn.bg-gradient-primary.btn-sm.mb-0")
WebElement Deletebutton;

@FindBy(xpath = "//button[normalize-space()='Yes, Delete it!']")
WebElement Yes_delete;

public void courseregistration_download() 
{
	CourseregistrationLink.click();
	Downloadbutton.click();
	
}
public void courseregistration_delete() 
{
	CourseregistrationLink.click();
	Deletebutton.click();
	Yes_delete.click();
}
}