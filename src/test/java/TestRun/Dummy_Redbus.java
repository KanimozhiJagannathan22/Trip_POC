//package TestRun;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com_Base_File.Utility_File_MMT;
//import com_Page_Object_File.Home_Page;
//
//public class Dummy_Redbus extends Utility_File_MMT{
//	
//	public static WebDriver driver;
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		driver = new ChromeDriver();
//		Maximize(driver);
//		url(driver, "https://www.makemytrip.com/");
//		implicitWait(driver);
//		
//		Home_Page booking = new Home_Page(driver);
//		Click(booking.getLoginpopup());
//		Click(booking.getBuses());
//		
//		Click(booking.getFrom());
//		Enter_Data(booking.getSearchFromCity(), "Chennai");
//		sleep();
//		Click(booking.getFromcity());
//		
//		jsClick(booking.getTo(), driver);
//		Enter_Data(booking.getSearchFromTo(), "Bangalore");
//		sleep();
//		Click(booking.getToCity());
//		
//		Click(booking.getDatePicker());
//		Click(booking.getSearchbuses());
//		
//		Click(booking.getAcBus());
//		
//		Click(booking.getSleeperBus());
//		
//		Click(booking.getSingleSeatorSleeper());
//		
//		Click(booking.getSeeMorepickUpPoint());
//		Enter_Data(booking.getSearchPickUpPoint(), "Tidel");
//		Click(booking.getTidelPark());
//		
////		jsScroll(driver, booking.getPickUpTime());
//		
//		Click(booking.getShowAllTravellOperator());
//		Enter_Data(booking.getSearchTraveloperator(), "IntrCity");
//		Click(booking.getIntrCitySmartBus());
//		
//		List<WebElement> Price = booking.getAllPrice();
//		List<String> PriceDetail = new ArrayList<String>();
//
//		for(int i = 0; i< Price.size(); i++) {
//		String PD = Price.get(i).getText();
//		System.out.println("All price detail : " + PD);
//		PriceDetail.add(PD);
//		}
//		System.out.println("List :" +PriceDetail);
//			
//		System.out.println("Lowest bus ticket price :" +PriceDetail.get(0));
//		
//		jsClick(booking.getCheapest(), driver);
//		
//		Click(booking.getSelectSeat());
//		Click(booking.getSelectSleeperSeat());
//		Click(booking.getContinueSeatBooking());
//		
//		Enter_Data(booking.getTravellerName(), "Kanimozhi");
//		Enter_Data(booking.getTravellerAge(), "25");
//		Click(booking.getTravellerGender());
//		Enter_Data(booking.getTravellerEmailId(), "kani22jagan@gmail.com");
//		Enter_Data(booking.getTravellerMobileNumber(), "8056392559");
//		Click(booking.getSelectState());
//		Click(booking.getTamilnadu());
//		Click(booking.getConfirmCheckbox());
//		Click(booking.getTripAssured());
//		jsClick(booking.getContinue(), driver);
//		
//		System.out.println("Your seat Booked Successfully");
//		quit(driver);
//		
//	}
//	
//}
