package com.powderhook.appium.common;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;



public class LoginPage extends ActionHelper {

	

	
	public static boolean VerifiedLogin(String userName, String password) {
		boolean res = false;
		try {
			Thread.sleep(10000);
			click(LoginScreen.signInButton);
			Thread.sleep(5000); 
			type(LoginScreen.userId,userName);
			//click(LoginScreen.password);
			type(LoginScreen.password,password);
			Thread.sleep(5000);
			click(LoginScreen.LoginButton);
			Thread.sleep(2000);
			res = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static boolean VerifiedLogout() {
		boolean res = false;
		try {
			click(HomeScreen.MenuOption);
			click(HomeScreen.SignOutButton);
			click(HomeScreen.AltSignOutYes);
			res = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	/*public void doIt(FSM fsm, Input in) {
		// TODO Auto-generated method stub
		
	}*/
}
