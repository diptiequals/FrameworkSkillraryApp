package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {
@Test
public void firstTest() throws InterruptedException
{
SoftAssert soft=new SoftAssert();
home.clickGearsTab();
home.clickSkillraryDemoAppLink();
web.handleChildBrowser();
soft.assertTrue(demoApp.getPageHeader().isDisplayed());
demoApp.mouseHoverTocourseTab(web);
demoApp.clickSeleniumTraining();
soft.assertTrue(selenium.getPageHeader().isDisplayed());
selenium.doubleClickPlusButton(web);
Thread.sleep(2000);
selenium.clickAddToCart();
Thread.sleep(2000);
web.handleAlert();
Thread.sleep(2000);
web.screenshot();
soft.assertAll();


}
}
