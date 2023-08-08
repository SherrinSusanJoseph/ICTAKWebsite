package qa.pages;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	
	@FindBy(xpath = "//i[@title=\"Delete the Course\"]")
	WebElement delete_link;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, Delete it!')]")
	WebElement delete_yes;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")
	WebElement pop_up;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok_button;
	
	//Add course registration page
		
	//course title
	@FindBy(xpath = "//*[@type=\"text\"]//following::input[1]")
	WebElement course_title;
	
	//course short name
	@FindBy(xpath = "//input[@formcontrolname=\"name\" and @type=\"text\"]")
	WebElement course_short_name;
	
	//Course type
	@FindBy(xpath = "//input[@formcontrolname=\"type\"]")
	WebElement course_type;
	
	//Short discription
	@FindBy(xpath = "//div[@id='richtexteditor_2023600528_0_rte-edit-view']")
	WebElement short_dis;
	
	//Registration status
	@FindBy(xpath = "//select[@name=\"reg\"]")
	WebElement reg_status;
	
	//Select registration status
	@FindBy(xpath = "//option[text()=\"Registration Open\"]")
	WebElement select_status;
	
	//Course Category
	@FindBy(xpath = "//select[@name=\"cat\"]")
	WebElement course_category;
	
	//Select course category
	@FindBy(xpath = "//option[text()=\"Institutional\"]")
	WebElement  select_category;
	
	//About course
	@FindBy(xpath = "//div[@id='richtexteditor_2023600528_1_rte-edit-view']")
	WebElement about_course;
	
	//Entrance Exam Date
	@FindBy(xpath = "//input[@formcontrolname=\"entrance\"]")
	WebElement entrance_date;
	
	//commencement
	@FindBy(xpath="//input[@formcontrolname=\"commencement\"]")
	WebElement comme_date;
	
	//Orientation date
	@FindBy(xpath = "//input[@formcontrolname=\"orientation\"]")
	WebElement orientation_date;
	
	//Laste date of Registration
	@FindBy(xpath = "//input[@formcontrolname=\"sdate\"]")
	WebElement last_date_registration;
	
	//course fee
	@FindBy(xpath = "//input[@name=\"fee\"]")
	WebElement course_fee;
	
	//Course Registration fee
	@FindBy(xpath = "//input[@name=\"regfee\"]")
	WebElement registration_fee;
	
	//Course Duration
	@FindBy(xpath = "//input[@name=\"regDur\"]")
	WebElement course_duration;
	
	//Objective or agenda
	@FindBy(xpath = "//div[@id='richtexteditor_2023600528_2_rte-edit-view']")
	WebElement course_agenda;
	
	//sample Entrance question
	@FindBy(xpath = "//input[@name=\"que\"]")
	WebElement sample_question;
	
	//Placement list
	@FindBy(xpath = "//input[@name=\"placelist\"]")
	WebElement placement_list;
	
	//Intenship certificate
	@FindBy(xpath = "//input[@name=\"intern\"]")
	WebElement intenship_certifi;
	
	//Choose Image
	@FindBy(xpath = "//input[@name=\"image\"]")
	WebElement choose_image;
	
	//Active Status
	@FindBy(xpath = "//input[@id='flexSwitchCheckDefault']")
	WebElement active_status;
	
	//Add course submit
	@FindBy(xpath = "//button[contains(text(),'Add Course')]")
	WebElement add_course_submit;
	
	
	
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
		ok_button.click();
		return txt;
	}
	//Add new courses
	public void add_course_method() throws Exception
	{
		button_pre.click();
		course_title.sendKeys("Digital Marketing");
		course_short_name.sendKeys("DM");
		course_type.sendKeys("online");
		short_dis.sendKeys("Any marketing that uses electronic devices and can be used by marketing specialists to convey promotional messaging and measure its impact through your customer journey.");
		reg_status.click();
	    select_status.submit();
	    course_category.click();
	    select_category.click();
	    about_course.sendKeys("Regular Batch (timing :9am-11am)\r\n"
	    		+ "\r\n"
	    		+ "Weekend Batch(timing:9am-1am)");
	    entrance_date.sendKeys("08/23/2023");
	    comme_date.sendKeys("08/30/2023");
	    orientation_date.sendKeys("09/20/2023");
	    last_date_registration.sendKeys("09/29/2023");
	    course_fee.sendKeys("25000");
	    registration_fee.sendKeys("1000");
	    course_duration.sendKeys("6months");
	    course_agenda.sendKeys("DM Provides a Holistic Learning Experience and Practical Knowledge from Industry Experts.");
	    sample_question.sendKeys("What is DM?");
	    placement_list.sendKeys("1.Ram,2.Sarin,3.Deepa");
	    intenship_certifi.sendKeys("Certified Market Expert");
	    choose_image.sendKeys("C:\\Users\\bency\\OneDrive\\Pictures\\Screenshots");
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", add_course_submit);
	    //Actions actions = new Actions(driver); 
	    //actions.moveToElement(active_status).click().build().perform();
	    /*active_status.click();
	    boolean val=active_status.isSelected();
	    System.out.println(val);
	    if (val==false) {
	    	Thread.sleep(10000);
	    	active_status.click();
	    }*/
	    Thread.sleep(15000);
	    Actions actions = new Actions(driver); 
	    actions.moveToElement(add_course_submit).click().build().perform();
	    add_course_submit.click();
	}   
	   
}
	
