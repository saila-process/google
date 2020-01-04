package TestPage;

import org.testng.Assert;

import org.testng.annotations.Test;
import ObjectPage.basecls;
import ObjectPage.homepage;



public class hometest {
	basecls aa;
	homepage bb;
	
	public hometest() {
		aa=new basecls();
		bb=new homepage();	
		
	}
	@Test
	public void clickwomen() {
		bb.clickwomen();
	}
	
	@Test
	public void verifysmall() {
		Assert.assertTrue(bb.getsmallsize().isDisplayed());
	}
	@Test
	public void verifymedium() {
		
		Assert.assertTrue(bb.getmediumsize().isDisplayed());
	}	
	@Test
	public void verifylarge() {
		Assert.assertTrue(bb.getlargesize().isDisplayed());
		
	}
}
