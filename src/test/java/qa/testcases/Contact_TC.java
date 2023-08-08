package qa.testcases;

import org.testng.annotations.Test;

import qa.base.BaseClass;
import qa.pages.ContactPage;

public class Contact_TC extends BaseClass {
	ContactPage contactpage;
	@Test(priority=1)
	public void validContact()
	{
		contactpage=new ContactPage(driver);
		contactpage.contact_method();
	}

}
