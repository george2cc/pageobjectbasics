package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {

	WebDriver driver;

	// add constructor
	public TopMenu(WebDriver driver) {
		this.driver = driver;

	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public void gotoAccounts() {

		driver.findElement(By.cssSelector(".lyteMenuActive.lyteItem>link-to>a")).click();
	}

	public void gotoDeals() {

	}

	public void signOut() {

	}

}
