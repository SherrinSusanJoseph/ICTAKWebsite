package qa.pages;

import qa.base.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import qa.base.BaseClass;

	public class PatronsPage extends BaseClass{
		public PatronsPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//a[@routerlink='/adminpage/patrons']")
		WebElement Patron_link;
		
		@FindBy(tagName ="h4")
		WebElement heading;
		
		@FindBy(xpath = "//a[contains(text(),'Add patron')]")
		WebElement Add_Patron_Button;
		
		@FindBy(tagName = "h2")
		WebElement  label_text_addnew;
		
		@FindBy(name = "dssd")
		WebElement Choose_file;
		//button[normalize-space()='Add partner']
		@FindBy(xpath = "//button[normalize-space()='Add partner']")
		WebElement Add_Patron_partner;
		
		@FindBy(xpath = "//span[@class=\"mb-2\"]")
		WebElement choose_text;
		
		@FindBy(xpath = "//body[1]/app-root[1]/app-patron[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[3]/tr[1]/td[3]/i[1]")
		WebElement Delete;
		
		@FindBy(xpath = "//p[contains(text(),'1')]")
		WebElement deleted;
		
		@FindBy(xpath = "//button[normalize-space()='Yes, Delete it!']")
		WebElement Delete_yes;
		
		@FindBy(xpath = "//button[normalize-space()='No, Cancel please!']")
		WebElement Delete_no;
		
		@FindBy(xpath = "//button[normalize-space()='OK']")
		WebElement Delete_success_failure;
		
		public void Patron_link() {
			Patron_link.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		public void addPatronPartner(){
			
			Add_Patron_Button.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Choose_file.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Add_Patron_partner.click();
		}
		public void cancelDeletePatronPartner() {
			
			Delete.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Delete_no.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Delete_success_failure.click();
			
		}
		public void successDeletePatronPartner() {
			
			Delete.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Delete_yes.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Delete_success_failure.click();
		}
		
	}


