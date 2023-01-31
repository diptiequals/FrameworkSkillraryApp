package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass{
	
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		home.searchCourse("Core java for selenium");
		soft.assertTrue(coreJava.getPageHeader().isDisplayed());
		coreJava.clickCoreJavaLink();
		Thread.sleep(2000);
		
		soft.assertTrue(javaDemo.getPageHeader().isDisplayed());
		web.switchToFrame(0);
		javaDemo.clickPlayButton();
		Thread.sleep(4000);
		javaDemo.clickPauseButton();
		javaDemo.clickAddToWishList();
		soft.assertAll();
		
		
	}
	

}
