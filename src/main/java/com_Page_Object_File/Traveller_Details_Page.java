package com_Page_Object_File;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Base_File.Utility_File_MMT;

public class Traveller_Details_Page extends Utility_File_MMT{
	

	@FindBy(xpath = "//input[@id='fname']") private WebElement TravellerName;
	@FindBy(xpath = "//input[@id='age']") private WebElement TravellerAge;
	@FindBy(xpath = "//div[@class='femaleTab ']") private WebElement TravellerGender;
	@FindBy(xpath = "//input[@id='contactEmail']") private WebElement TravellerEmailId;
	@FindBy(xpath = "//input[@id='mobileNumber']") private WebElement TravellerMobileNumber;
	@FindBy(xpath = "//input[@id='dt_state_gst_info']") private WebElement SelectState;
	@FindBy(xpath = "//li[text()='Tamil Nadu']") private WebElement Tamilnadu;
	@FindBy(xpath = "//span[@class='checkboxWpr']") private WebElement confirmCheckbox;
	@FindBy(xpath = "(//span[@class='sc-lhVmIH gLODGR'])[2]") private WebElement TripAssured;
	@FindBy(xpath = "//span[text()='Continue']") private WebElement Continue;
	
private WebDriver driver;
	
	public Traveller_Details_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Traveller_Data() throws InterruptedException, IOException {
		Enter_Data(getTravellerName(), "Kanimozhi");
		Enter_Data(getTravellerAge(), "25");
		Click(getTravellerGender());
		Enter_Data(getTravellerEmailId(), "kani22jagan@gmail.com");
		Enter_Data(getTravellerMobileNumber(), "8056392559");
		Click(getSelectState());
		Click(getTamilnadu());
		Click(getConfirmCheckbox());
		Click(getTripAssured());
		
		sleep();
		TakeScreenshot("C:\\Users\\91805\\OneDrive\\Documents\\Make My Trip\\Travellerdetailpage.png");
		
		jsClick(getContinue(), driver);
		sleep();
		TakeScreenshot("C:\\Users\\91805\\OneDrive\\Documents\\Make My Trip\\Payment.png");
		System.out.println("Ticket booked successfully");
	}
	
	
	
	public WebElement getTravellerName() {
		return TravellerName;
	}
	
public WebElement getTravellerAge() {
	return TravellerAge;
}

public WebElement getTravellerGender() {
	return TravellerGender;
}

public WebElement getTravellerEmailId() {
	return TravellerEmailId;
}

public WebElement getTravellerMobileNumber() {
	return TravellerMobileNumber;
}

public WebElement getSelectState() {
	return SelectState;
}

public WebElement getTamilnadu() {
	return Tamilnadu;
}

public WebElement getConfirmCheckbox() {
	return confirmCheckbox;
}

public WebElement getTripAssured() {
	return TripAssured;
}

public WebElement getContinue() {
	return Continue;
}






}
