package com.medevantage.app.tests;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.app.base.BaseClass;
import com.medevantage.app.pages.SignIn_Page;
import com.medevantage.app.utility.DataGenerator;

import io.appium.java_client.MobileElement;

@Listeners(com.medevantage.app.utility.ListenerTest.class)
public class SignIn_Test extends BaseClass {

	SignIn_Page signin;

	@Test(dataProvider = "signInData", dataProviderClass = DataGenerator.class)
	public void signIn(String Email, String Pass) throws InterruptedException, IOException {
		// setup();
		signin = new SignIn_Page(driver);
		signin.getStarted();
		signin.setSignIn_Email(Email);
		signin.setSignIn_Pass(Pass);
		signin.signIn_Button();

		List<MobileElement> errorMessage = driver.findElementsByXPath("//*[@text='Invalid email or password']");

		if (errorMessage.size() < 0 || errorMessage.size() > 0) {
			System.out.println("Sign In Failed");
			driver.findElementById("com.android.chrome:id/close_button").click();

		} else {

			System.out.println("Sign In passed");
		}
	}
}
