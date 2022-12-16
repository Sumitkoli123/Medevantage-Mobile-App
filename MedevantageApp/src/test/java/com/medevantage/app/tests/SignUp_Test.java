package com.medevantage.app.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.SignUp_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.android.Activity;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class SignUp_Test extends BaseClass {
	SignUp_Page signUp;
	SignUp_Page verifyEmail;

	@Test(dataProvider = "signUpData", dataProviderClass = DataGenerator.class)
	public void signUp_New_User(String fName, String lName, String Email, String pNumber, String pass, String conpass)
			throws InterruptedException {

		signUp = new SignUp_Page(driver);

		signUp.getStarted();

		signUp.signUp_Link();

		signUp.setFirst_Name(fName);
		System.out.println("Entered fName");

		signUp.setLast_Name(lName);
		System.out.println("Entered lName");

		signUp.setSignUp_Email(Email);
		System.out.println("Entered Email");

		signUp.setPhone_No(pNumber);
		System.out.println("Entered PhoneNo");

		signUp.setSignUp_Pass(pass);
		System.out.println("Entered pass");

		signUp.show_SignUp_Pass();

		signUp.setConf_SignUp_Pass(conpass);
		System.out.println("Entered conpass");

		signUp.clickAccept_Terms_Condition();
		signUp.signUp_Button();
		Thread.sleep(3000);
		
		signUp.check_Email();

		driver.startActivity(new Activity("com.android.chrome", "com.google.android.apps.chrome.Main"));
		
		verifyEmail = new SignUp_Page(driver);

		verifyEmail.chrome_search_Box();

		verifyEmail.goTo_email();

		verifyEmail.email_searchBox(Email);

		verifyEmail.search_email_Button();

		verifyEmail.select_Email();

		verifyEmail.verify_User_Email();

		verifyEmail.open_medApp();

	}
}
