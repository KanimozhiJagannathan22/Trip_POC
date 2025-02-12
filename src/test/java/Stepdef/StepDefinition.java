package Stepdef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import TestRun.TestRunner;
import com_Base_File.Utility_File_MMT;
import com_Page_Object_File.Filter_Page;
import com_Page_Object_File.Home_Page;
import com_Page_Object_File.Traveller_Details_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Utility_File_MMT {
	
	public static WebDriver driver = TestRunner.driver;
	
	Home_Page booking = new Home_Page(driver);
	Filter_Page filter = new Filter_Page(driver);
	Traveller_Details_Page travel = new Traveller_Details_Page(driver);
	
	
	@Given("User launch the application")
	public void user_launch_the_application() {
			booking.ClickLoginPopup();
	}
	
	@When("User go to buses")
	public void user_go_to_buses() {
		booking.ClickBuses();
	}
	
	@When("User select Starting and Endpoint")
	public void user_select_starting_and_endpoint() throws InterruptedException {
		booking.Enter_From_City();
		booking.Enter_To_City();
	}
	
	@When("User pick date and search buses")
	public void user_pick_date_and_search_buses() throws InterruptedException, IOException {
		booking.SelectDateAndSearch();
	}
	
	@When("User filter the seating")
	public void user_filter_the_seating() {
       filter.Filter_Seating();
	}
	
	@When("User choose cheapest bus and select seat")
	public void user_choose_cheapest_bus_and_select_seat() throws InterruptedException, IOException {
		filter.Select_Cheapest_Seat();
	}
	
	@When("User enter the traveller details and continue booking")
	public void user_enter_the_traveller_details_and_continue_booking() {
		try {
			travel.Traveller_Data();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

}
