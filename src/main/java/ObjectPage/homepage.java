package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basecls{
	
	@FindBy900(xpath=("//a[@title='Women']"))
	private WebElement women;
	
	@FindBy(xpath=("//div//label[@for='layered_id_attribute_group_1']"))
	private WebElement smallsize;
	
	@FindBy(xpath=("//div//label[@for='layered_id_attribute_group_2']"))
	private WebElement mediumsize;
	
	@FindBy(xpath=("//div//label[@for='layered_id_attribute_group_3']"))
	private WebElement largesize;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}	
	 
	public WebElement clickwomen() {
    	women.click();
		return women;
    }
	public WebElement getsmallsize() {
		return smallsize;
		
	}
    public WebElement getmediumsize() {
		return mediumsize;
    	
    }
    public WebElement getlargesize() {
		return largesize;
    	
    }
    
    
	
}
