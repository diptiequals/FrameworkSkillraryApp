package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass {
	@Test
	public void secondTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		Thread.sleep(2000);
		web.handleChildBrowser();
		Thread.sleep(2000);
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.selectCategory(web, 1);
		Thread.sleep(2000);
		soft.assertTrue(testing.getPageHeader().isDisplayed());
		WebElement javaImage=testing.getJavaImage();
		WebElement cartImage=testing.getCartArea();
		web.dragAndDropElement(javaImage, cartImage);
		Thread.sleep(6000);
		web.scrollTillElement(testing.getFacebookIcon());
		Thread.sleep(2000);
		testing.clickFacebookIcon();
		Thread.sleep(6000);
		soft.assertAll();		

}
}
