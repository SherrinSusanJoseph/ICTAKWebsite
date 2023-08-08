package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class IndustrialPage extends BaseClass {
	public IndustrialPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@routerlink='/adminpage/industrial']")
	WebElement Industrial_link;
	
	@FindBy(tagName ="h4")
	WebElement heading;
	
	@FindBy(xpath = "//a[contains(text(),'Add Industrial Partners')]")
	WebElement Add_Industrial_Button;
	
	@FindBy(tagName = "h2")
	WebElement  label_text_addnew;
	
	@FindBy(name = "dssd")
	WebElement Choose_file;
	
	@FindBy(xpath = "//button[normalize-space()='Add partner']")
	WebElement Add_Industrial_partner;
	
	@FindBy(xpath = "//span[@class=\"mb-2\"]")
	WebElement choose_text;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-industrial[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
	WebElement Delete;
	
	@FindBy(xpath = "//p[contains(text(),'1')]")
	WebElement deleted;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, Delete it!']")
	WebElement Delete_yes;
	
	@FindBy(xpath = "//button[normalize-space()='No, Cancel please!']")
	WebElement Delete_no;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")//button[normalize-space()='OK']
	WebElement Delete_success_failure;
	
	public void Industrial_link() {
		Industrial_link.click();
	}
	
	public void addIndustrialPartner(){
		
		Add_Industrial_Button.click();
		Choose_file.click();
		Add_Industrial_partner.click();
	}
	public void cancelDeleteIndustrialPartner() {
		
		Delete.click();
		Delete_no.click();
		Delete_success_failure.click();
		
	}
	public void successDeleteIndustrialPartner() {
		
		Delete.click();
		Delete_yes.click();
		Delete_success_failure.click();
	}
	
}
