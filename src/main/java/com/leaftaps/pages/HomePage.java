package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class HomePage extends ProjectHooks{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("Leaftaps Homepage is loaded Successfully", "pass");
		return this;
	}
	
	public MyHomePage clickCrmsfaLink() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("CRM/SFA link is clicked Successfully", "pass");
		return new MyHomePage();
	}
	
}
