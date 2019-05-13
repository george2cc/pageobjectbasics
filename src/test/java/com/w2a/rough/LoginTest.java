package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
	
	public static void main(String[] args) {

		HomePage home = new HomePage();
		home.goToLogin();
		//page2
		LoginPage login = new LoginPage();
		login.doLogin("george2c@optusnet.com.au", "Selenium@123");
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		Page.menu.gotoAccounts();
		AccountsPage account = new AccountsPage();
		account.goToCreateAccounts();
		CreateAccountPage cap = new CreateAccountPage();
		cap.createAccount("Raman");
		
	}

}
