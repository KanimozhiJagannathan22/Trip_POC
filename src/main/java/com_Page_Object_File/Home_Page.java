package com_Page_Object_File;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com_Base_File.Utility_File_MMT;

public class Home_Page extends Utility_File_MMT{
	
	@FindBy(xpath = "//span[@class='commonModal__close']" ) private WebElement loginpopup;
	@FindBy(xpath = "(//a[@class='headerIcons makeFlex hrtlCenter column'])[5]") private WebElement Buses;
	
	@FindBy(xpath = "//input[@id='fromCity']") private WebElement From;
	@FindBy(xpath = "//input[@title='From']") private WebElement searchFromCity;
	@FindBy(xpath = "//p[@class='searchedResult font14 darkText']") private WebElement Fromcity;
	
	@FindBy(xpath = "//input[@id='toCity']") private WebElement To;
	@FindBy(xpath = "//input[@title='To']") private WebElement searchFromTo;
	@FindBy(xpath = "//p[@class='searchedResult font14 darkText']") private WebElement ToCity;
		
	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[2]") private WebElement DatePicker;
	
	@FindBy(xpath = "//button[@id='search_button']") private WebElement searchbuses;
	
private WebDriver driver;
	
	public Home_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickLoginPopup() {
		  url(driver, "https://www.makemytrip.com/");
		  implicitWait(driver);
		  Click(getLoginpopup());
	}
	
	public void Enter_From_City() throws InterruptedException {
		Click(getFrom());
		Enter_Data(getSearchFromCity(), "Chennai");
		sleep();
		Click(getFromcity());	
	}
	
	public void Enter_To_City() throws InterruptedException {
		jsClick(getTo(), driver);
		Enter_Data(getSearchFromTo(), "Bangalore");
		sleep();
		Click(getToCity());
	}
	
	public void SelectDateAndSearch() throws InterruptedException, IOException {
		Click(getDatePicker());
		sleep();
		TakeScreenshot("C:\\Users\\91805\\OneDrive\\Documents\\Make My Trip\\home page.png");
		Click(getSearchbuses());
		sleep();
	}
	
	
	public WebElement getLoginpopup() {
		return loginpopup;
	}
	public WebElement getBuses() {
		return Buses;
	}
	public void ClickBuses() {
		Click(getBuses());
	}
	public WebElement getFrom() {
		return From;
	}
	public WebElement getSearchFromCity() {
		return searchFromCity;
	}
	public WebElement getFromcity() {
		return Fromcity;
	}
	public WebElement getTo() {
		return To;
	}
	public WebElement getSearchFromTo() {
		return searchFromTo;
	}
	public WebElement getToCity() {
		return ToCity;
	}
	public WebElement getDatePicker() {
		return DatePicker;
	}
	public WebElement getSearchbuses() {
		return searchbuses;
	}

}
