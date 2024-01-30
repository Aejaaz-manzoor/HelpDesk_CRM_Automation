package Pagefactory;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Common_fucntion extends HelpdeskElements {
	

    public static ExtentSparkReporter htmlReporter;

		
		//Extent report
		public static String takeAndSaveScreenshot(WebDriver driver) {
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
	        String ssFilename = "Screenshot " +" "+ currentDateTime.format(formatter);

	        if (driver instanceof TakesScreenshot) {
	            // Capture the screenshot
	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	            // Define a file path to save the screenshot
	            String screenshotPath = "\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Screenshots\\"
	                    + ssFilename + ".png";

	            try {
	                // Save the screenshot to the specified path
	            	 FileHandler.copy(screenshot, new File(screenshotPath));
	                System.out.println(ssFilename + " saved");
	                return screenshotPath;
	            } catch (Exception e) {
	                System.err.println("Failed to save screenshot: " + e.getMessage());
	            }
	        }
	        return null;   

}
}
