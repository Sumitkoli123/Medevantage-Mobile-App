package com.medevantage.app.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.ForgotPassword_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.android.Activity;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class ForgotPassword_Test extends BaseClass {
	ForgotPassword_Page forgotPass;
	ForgotPassword_Page resetPass;

	@Test(dataProvider = "Forgot_Pass", dataProviderClass = DataGenerator.class)
	public void forgotPassword(String Email) throws InterruptedException {

		forgotPass = new ForgotPassword_Page(driver);
		forgotPass.get_Started();
		forgotPass.forgot_Pass();
		forgotPass.setEmail(Email);
		forgotPass.continue1_Button();
		forgotPass.reset_Link_Send();
		
		driver.startActivity(new Activity("com.android.chrome", "com.google.android.apps.chrome.Main"));

		resetPass = new ForgotPassword_Page(driver);
		resetPass.search_Box();
		resetPass.goTo_email();
		resetPass.email_searchBox(Email);
		resetPass.search_emailButton();
		resetPass.select_Email();
		resetPass.confirm_Button();
		resetPass.open_medApp();
		resetPass.new_Password();
		resetPass.reEnter_Password();
		resetPass.continue2_Button();		
	}

}
