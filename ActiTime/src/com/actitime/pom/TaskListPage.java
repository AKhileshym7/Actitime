package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement enterCustNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement addCustDescriptionTbx;
	
	@FindBy(xpath="//button[contains(@id,'ext-gen')]")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
	private WebElement actualCustomerCreatedLoc;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getAddCustDescriptionTbx() {
		return addCustDescriptionTbx;
	}
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}
	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}
	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	public WebElement getActualCustomerCreatedLoc() {
		return actualCustomerCreatedLoc;
	}
	
	
}




