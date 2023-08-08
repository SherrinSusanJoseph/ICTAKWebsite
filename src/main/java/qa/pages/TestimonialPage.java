package qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.base.BaseClass;

public class TestimonialPage extends BaseClass{
	public TestimonialPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css=".nav-link.text-white[routerlink='/adminpage/testimony']")
	WebElement TestimonialLink;
	
	@FindBy(css =".btn.bg-gradient-primary.btn-sm.mb-0.text-white.ng-star-inserted")
	WebElement NewTestimonial;
	
	@FindBy(name="name")
	WebElement Name;
	
	@FindBy(xpath="//span[contains(text(),'Organisation']")
	WebElement Organisation;
	
	@FindBy(xpath ="//div[@data-animation='FadeIn']//div//div//div//div//span[contains(text(),'Testimonial')]")
	WebElement Testimonial;
	
	@FindBy(xpath="//span[button[contains(text(),'Course Title']")
	WebElement CourseTitle;
	
	@FindBy(xpath="//span[contains(text(),'Image']")
	WebElement Image;
	
	@FindBy(css ="//button[contains(text(),'Add Testimony']")
	WebElement Submit;
	
	@FindBy(xpath ="//i[@title=\"View the Course\"]")
	WebElement View;
	
	@FindBy(id= "listSearch")
	WebElement Search;
	
	@FindBy(xpath = "//i[@title=\"Edit the Course\"]")
	WebElement Edit;
	
	@FindBy(xpath = "//div[contains(text(),'Edit Testimony')]")
	WebElement EditText;
	
	
	@FindBy(xpath = "//i[@title='Delete the Course']")
	WebElement Delete;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, Delete it!')]")
	WebElement Delete_yes;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")
	WebElement Pop_up;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement Ok_button;
	
	@FindBy(xpath = "//h2[contains(text(),'Testimony']")
	WebElement ViewText;
	
	
	
	public void testimonial_method(String name,String organisation,String testimonial,String coursetitle,String image)
	{
		TestimonialLink.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		NewTestimonial.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Name.sendKeys(name);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Organisation.sendKeys(organisation);
		Testimonial.sendKeys(testimonial);
		CourseTitle.sendKeys(coursetitle);
		Image.sendKeys(image);
		Submit.click();
		
	}
	public void testimonial_view() {
		TestimonialLink.click();
		View.click();
	}
	public String view_details()
	{
		String txt=ViewText.getText();
		return txt;
	}
	public String testimonial_edit()
	{
		TestimonialLink.click();
		Edit.click();
		String txt=EditText.getText();
		return txt;
	}
	public String testimonial_delete()
	{
		TestimonialLink.click();
		Delete.click();
		Delete_yes.click();
		String txt=Ok_button.getText();
		Ok_button.click();
		return txt;
	}
	public String add_testimonial_validation() {
		String txt=Submit.getText();
		return txt;
	}
	
}
