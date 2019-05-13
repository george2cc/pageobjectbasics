package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	//method action1
	public void goToSupport() {
		
		driver.findElement(By.cssSelector("zh-support")).click();
		
	}
	
	public void goToSignUp() {
		
		driver.findElement(By.cssSelector("zh-signup")).click();
		
	}
	
	public LoginPage goToLogin() {
		
		click("loginlink_CSS");
		
		return new LoginPage();
	}
	
	public void goToContactSales() {
		
	}
	
	public void goToLearnMore() {
		
	}
	
	public void validateFooterLinks() {
		
	}
}
