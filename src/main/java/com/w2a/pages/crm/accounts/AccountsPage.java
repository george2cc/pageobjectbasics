package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	public void goToCreateAccounts() {
		
		driver.findElement(By.cssSelector(".lyte-button.lytePrimaryBtn")).click();
		
	}
	
	public void goToCreateImportAccounts() {
		
	}

}
