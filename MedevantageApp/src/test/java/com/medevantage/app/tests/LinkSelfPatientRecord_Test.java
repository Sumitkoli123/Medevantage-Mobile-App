package com.medevantage.app.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.LinkSelfPatientRecord_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.MobileElement;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class LinkSelfPatientRecord_Test extends BaseClass {
	LinkSelfPatientRecord_Page selfLink;
	String userName;

	@Test(dataProvider = "Self_Link", dataProviderClass = DataGenerator.class)
	public void selfLink(String HomePhone) {

		selfLink = new LinkSelfPatientRecord_Page(driver);
		selfLink.left_Menu();
		userName = selfLink.patientName();
		selfLink.selectPatientPage();
		selfLink.link_Self_Patient();
		MobileElement ptName = driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Username:']]]"));
		ptName.click();
		ptName.sendKeys(userName);
		selfLink.gender();
		selfLink.male();
		selfLink.SethomePhone(HomePhone);
		selfLink.birthDate();
		selfLink.datePicker();
		//selfLink.add();
	}
}