package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class KnowledgePage extends BaseClass{
		public KnowledgePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath = "//a[@href=\"/adminpage/knowledge\"]")
		WebElement Know_obj;
		
		@FindBy(tagName ="h4")
		WebElement heading;
		
		@FindBy(xpath = "//a[contains(text(),'Add knowledge')]")
		WebElement add_knw;
		
		@FindBy(tagName = "h2")
		WebElement  label_text_addnew;
		
		/*@FindBy(xpath = "//input[@type=\"file\"]")
		WebElement choose;*/
		
		@FindBy(xpath = "//span[@class=\"mb-2\"]")
		WebElement choose_text;
		
		@FindBy(xpath = "//body[1]/app-root[1]/app-knowledgepartner[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
		WebElement delete;
		
		@FindBy(xpath = "//p[contains(text(),'1')]")
		WebElement deleted;
		
		@FindBy(xpath = "//button[contains(text(),'Yes, Delete it!')]")
		WebElement delete_yes;
		
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		WebElement delete_success;
		
		public void Knowledge_link()
		{
			Know_obj.click();
		}
		public String get_heading()
		{
			String txt=heading.getText();
			return txt;
		}
		public String add_knw_link()
		{
			add_knw.click();
			String txt=label_text_addnew.getText();
			return txt;
		}
		/*public String select_file()
		{
			choose.click();
			String text=choose_text.getText();
			return text;
		}*/
		public void delete_partner()
		{
			
			String c=deleted.getText();
			delete.click();
			delete_yes.click();
			delete_success.click();
			if (deleted.getText()==c)
				System.out.println("Not deleted");
			else
				System.out.println("Deleted");
				
		}
		
}
