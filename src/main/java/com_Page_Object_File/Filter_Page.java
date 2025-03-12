package com_Page_Object_File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Base_File.Utility_File_MMT;

public class Filter_Page extends Utility_File_MMT{
	
	@FindBy(xpath = "//span[@class='listingSprite acIcon appendRight11']") private WebElement AcBus;
	
	@FindBy(xpath = "//span[@class='listingSprite sleeperIcon appendRight11']") private WebElement SleeperBus;
	
	@FindBy(xpath = "(//span[@class='checkmarkOuter'])[1]") private WebElement SingleSeatorSleeper;
	
	@FindBy(xpath = "(//span[@class='deepskyBlueText font12 capText latoBold pointer'])[1]") private WebElement SeeMorepickUpPoint;
	@FindBy(xpath = "//input[@id='Pick up point']") private WebElement searchPickUpPoint;
	@FindBy(xpath = "(//span[@class='checkmarkOuter'])[2]") private WebElement tidelPark;
		
	@FindBy(xpath = "(//span[@class='deepskyBlueText font12 capText latoBold pointer'])[1]") private WebElement ShowAllTravellOperator; 
	@FindBy(xpath = "//input[@id='Travel Operators']") private WebElement searchTraveloperator;
	@FindBy(xpath = "(//span[@class='checkmarkOuter'])[3]") private WebElement intrCitySmartBus;
	
	@FindBy(xpath = "//span[@id='price']") private List<WebElement> AllPrice;

	@FindBy(xpath = "//li[text()='Cheapest']") private WebElement Cheapest;
	
	@FindBy(xpath = "(//div[text()='Select Seats'])[1]") private WebElement SelectSeat;
	@FindBy(xpath = "//span[@class='listingSprite commonBigSeatIcon appendBottom4']") private WebElement SelectSleeperSeat;
	@FindBy(xpath = "//span[text()='Continue']") private WebElement ContinueSeatBooking;
	
    private WebDriver driver;
	   
	public Filter_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
		
    public void Filter_Seating() {	
	    Click(getAcBus());
		Click(getSleeperBus());
		Click(getSingleSeatorSleeper());

		Click(getSeeMorepickUpPoint());
		Enter_Data(getSearchPickUpPoint(), "Tidel");
		Click(getTidelPark());
				
		Click(getShowAllTravellOperator());
		Enter_Data(getSearchTraveloperator(), "IntrCity");
		Click(getIntrCitySmartBus());	
	}
	
    public void Select_Cheapest_Seat() throws InterruptedException, IOException {
	List<WebElement> Price = getAllPrice(AllPrice);
	List<String> PriceDetail = new ArrayList<String>();
	for(int i = 1; i< Price.size(); i++) {
	String PD = Price.get(i).getText();
	System.out.println("Price detail"+" "+ i + " :"  + PD);
	PriceDetail.add(PD);
	Collections.sort(PriceDetail);
	}
	System.out.println("After Sorted List :" +PriceDetail);
	System.out.println("Lowest bus ticket price :" +PriceDetail.get(0));
		
	jsClick(getCheapest());	
	jsClick(getSelectSeat());
	jsClick(getSelectSleeperSeat());
	sleep();
	TakeScreenshot("C:\\Users\\91805\\OneDrive\\Documents\\Make My Trip\\Filter.png");
	Click(getContinueSeatBooking());
}
	
	public WebElement getAcBus() {
		return AcBus;
	}
	public WebElement getSleeperBus() {
		return SleeperBus;
	}
	public WebElement getSingleSeatorSleeper() {
		return SingleSeatorSleeper;
	}
	public WebElement getSeeMorepickUpPoint() {
		return SeeMorepickUpPoint;
	}
	public WebElement getSearchPickUpPoint() {
		return searchPickUpPoint;
	}
	public WebElement getTidelPark() {
		return tidelPark;
	}
	public WebElement getShowAllTravellOperator() {
		return ShowAllTravellOperator;
	}
	public WebElement getSearchTraveloperator() {
		return searchTraveloperator;
	}
	public WebElement getIntrCitySmartBus() {
		return intrCitySmartBus;
	}
	public List<WebElement> getAllPrice(List<WebElement> allPrice2) {
		return AllPrice;
	}
    public WebElement getCheapest() {
		return Cheapest;
    }
    public WebElement getSelectSeat() {
		return SelectSeat;
	}
    public WebElement getSelectSleeperSeat() {
	     return SelectSleeperSeat;
    }
    public WebElement getContinueSeatBooking() {
	     return ContinueSeatBooking;
    }



}



//List<Integer> Sortprice = new ArrayList<Integer>();
//for(WebElement element: Price) {
//	String pricetext = element.getText().replaceAll(",", "");
//	Sortprice.add(Integer.parseInt(pricetext));
//}
//Collections.sort(Sortprice);
//System.out.println("Sorted Price :" + Sortprice);
//System.out.println("Lowest bus ticket price :" +Sortprice.get(0));
