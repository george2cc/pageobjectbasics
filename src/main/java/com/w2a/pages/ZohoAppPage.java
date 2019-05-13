package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;

public class ZohoAppPage extends Page {

	public void goToChat() {

		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();

	}

	public void goToCRM() {

		driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']")).click();

	}

	public void goToSalesIQ() {

		driver.findElement(By.cssSelector(".zicon-apps-connect.zicon-apps-96")).click();
	}
}
