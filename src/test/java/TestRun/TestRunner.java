package TestRun;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com_Base_File.Utility_File_MMT;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\redbus.feature", glue = "Stepdef", dryRun = false, monochrome = false,
                   plugin = {"pretty",
                		    "html: MakeMyTrip.html",
                	        "json:MakeMyTrip.json",
                	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner extends Utility_File_MMT{
	

	@BeforeClass
	public static void start() {
		Browserlaunch();
		Maximize();
		implicitWait();
	}
	
	@AfterClass
	public static void end() {
	 quit();	
	}

}
