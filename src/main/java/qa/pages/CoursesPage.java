package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class CoursesPage extends BaseClass{
	public CoursesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//a[@href=\"/adminpage/courses\"]")
	WebElement sel_link;
	
	@FindBy(xpath = "//h4[contains(text(),'Courses List')]")
	WebElement text;
	
	@FindBy(xpath = "//a[contains(text(),'New Course')]")
	WebElement button_pre;
	
	@FindBy(xpath = "//h4[contains(text(),'Add Courses')]")
	WebElement page_check;
	
	@FindBy(xpath = "//i[@title=\"View the Course\"]")
	WebElement details;
	
	@FindBy(xpath = "//h2[contains(text(),'Course Details')]")
	WebElement text2;
	
	@FindBy(xpath = "//i[@title=\"Edit the Course\"]")
	WebElement edit_link;
	
	@FindBy(xpath = "//div[contains(text(),'Edit Course')]")
	WebElement text3;
	
	
	@FindBy(xpath = "//i[@title=\"Delete the Course\"]")//check
	WebElement delete_link;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, Delete it!')]")
	WebElement delete_yes;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")//check
	WebElement pop_up;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok_button;
	
	public void course_link()
	{
		sel_link.click();
		
	}
	public String get_text()
	{
		String txt=text.getText();
		return txt;
	}
	public String button_check()
	{
		button_pre.click();
		String txt=page_check.getText();
		return txt;
	}
	public String view_details()
	{
		details.click();
		String txt=text2.getText();
		return txt;
	}
	public String edit_link()
	{
		edit_link.click();
		String txt=text3.getText();
		return txt;
	}
	public String delete_details()
	{
		delete_link.click();
		delete_yes.click();
		String txt=ok_button.getText();
		
		//String txt=driver.switchTo().alert().getText();
		//driver.switchTo( ).alert( ).accept();
		ok_button.click();
		return txt;
	}
	
}
