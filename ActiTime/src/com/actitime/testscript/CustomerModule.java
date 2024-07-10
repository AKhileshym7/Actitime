package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer",1,3);
	String customerDescription = f.getExcelData("CreateCustomer",1, 4);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	Thread.sleep(3000);
	t.getAddNewBtn().click();
	t.getNewCustomerBtn().click();
	t.getEnterCustNameTbx().sendKeys(customerName);
	t.getAddCustDescriptionTbx().sendKeys(customerDescription);
	t.getSelectCustDD().click();
	t.getOurCompanyOption().click();
	t.getCreateCustBtn().click();
	Thread.sleep(3000);
	String actualCustomer = t.getActualCustomerCreatedLoc().getText();
	Assert.assertEquals(actualCustomer, customerName);	
	}
}
