package Pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class HelpdeskDetail extends Common_fucntion{

	String ticketid = null;
	String ticketid2 = null;
	String Servicename = null; 
	String PdfURL = null;
	Common_fucntion commonfunction = new Common_fucntion(); 

	public void EmployeeFilter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {

		
		
		try {
		Filteremployee.sendKeys(dataMap.get("employee1"));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ExtentTest test = extent.createTest("Filter-Employee");
        test.log(Status.PASS, "Employee Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		empdropdownclose.click();
		Thread.sleep(3000);
		Filterempclear.click();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Employee");
			test7.log(Status.FAIL, "Employee filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}
        
		
	}
	
	

	public void Last_responded_by_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		HelpdeskElements.Filtercr.click();
		Thread.sleep(4000);
		ExtentTest test = extent.createTest("Filter-Customer responded");
        test.log(Status.PASS, "Customer responded Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		HelpdeskElements.Filtercr.click();
		Thread.sleep(4000);
		HelpdeskElements.Filterar.click();
		Thread.sleep(4000);
		ExtentTest test2 = extent.createTest("Filter-Agent responded");
        test2.log(Status.PASS, "Agent responded Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		HelpdeskElements.Filterar.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Agent responded");
			test7.log(Status.FAIL, "Agent responded filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}
		

	}

	

	public void Dashboard_status_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Thread.sleep(5000);
		Filterdoccollect.click();
		Thread.sleep(5000);
		ExtentTest test2 = extent.createTest("Filter-Document collection");
        test2.log(Status.PASS, "Document collection Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Document collection");
			test7.log(Status.FAIL, "Document collection filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}
		Thread.sleep(5000); 
		
		try {
		Filterdoccollect.click();
		Thread.sleep(5000);
		Filternamecheck.click();
		Thread.sleep(5000);
		ExtentTest test3 = extent.createTest("Filter-Name check");
        test3.log(Status.PASS, "Name check Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
	    } catch(Exception e) {
		ExtentTest test7 = extent.createTest("Filter-Name check");
		test7.log(Status.FAIL, "Name check filtration Failed: " + e.getMessage(),
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
	    }
		Thread.sleep(5000);
		
		try {
		Filternamecheck.click();
		Thread.sleep(5000);
		Filtertmcheck.click();
		Thread.sleep(5000);
		ExtentTest test4 = extent.createTest("Filter-TM check");
        test4.log(Status.PASS, "TM check Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		Filtertmcheck.click();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-TM check");
			test7.log(Status.FAIL, "TM check filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		
	}

	

	public void Status_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterstatus.click();
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		ExtentTest test4 = extent.createTest("Filter-Status");
        test4.log(Status.PASS, "Status Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		Filterstatusclear.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Status");
			test7.log(Status.FAIL, "Status filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		
	}

	

	public void Ticket_created_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filtercreatedon.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		Filtercreatedonselect.click();
		Thread.sleep(4000);
		JavascriptExecutor up1 = (JavascriptExecutor) driver;
		up1.executeScript("window.scrollBy(0, -600)");
		Thread.sleep(2000);
		ExtentTest test4 = extent.createTest("Filter-Ticket Created on");
        test4.log(Status.PASS, "Ticket Created on Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw2 = (JavascriptExecutor) driver;
		dw2.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(4000);
		Filtercreatedon.click();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		Filtercreatedonselect.click();
		Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Ticket Created on");
			test7.log(Status.FAIL, "Ticket Created on filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		
	}

	

	public void Ticket_Assigned_Date_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterstdate.click();
		Thread.sleep(4000);
		strtdateselect.click();
		Thread.sleep(4000);
		Filterendate.click();
		Thread.sleep(4000);
		enddateselect.click();
		Thread.sleep(4000);
		Filterdateselect.click();
		Thread.sleep(4000);
		JavascriptExecutor up1 = (JavascriptExecutor) driver;
		up1.executeScript("window.scrollBy(0, -800)");
		Thread.sleep(2000);
		ExtentTest test4 = extent.createTest("Filter-Ticket_Assigned_Date");
        test4.log(Status.PASS, "Ticket_Assigned_Date Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw2 = (JavascriptExecutor) driver;
		dw2.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(4000);
		Filterstdate.clear();
		Thread.sleep(4000);
		Filterclr.click();
		Thread.sleep(4000);
		Filterendate.clear();
		Thread.sleep(4000);
		Filterclr.click();
		Thread.sleep(4000);
		Filterdateselect.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Ticket_Assigned_Date");
			test7.log(Status.FAIL, "Ticket_Assigned_Date on filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}

	

	public void Payment_Status_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
	
		try {
		Filterpaystatus.sendKeys(dataMap.get("pstatus1"));
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor up1 = (JavascriptExecutor) driver;
		up1.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(2000);
		ExtentTest test4 = extent.createTest("Filter-Payment_Status");
        test4.log(Status.PASS, "Payment_Status Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw2 = (JavascriptExecutor) driver;
		dw2.executeScript("window.scrollBy(0, 700)");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Payment_Status");
			test7.log(Status.FAIL, "Payment_Status filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}

	

	public void Priority_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterticpriority.sendKeys(dataMap.get("priority"));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		JavascriptExecutor up2 = (JavascriptExecutor) driver;
		up2.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(2000);
		ExtentTest test4 = extent.createTest("Filter-Priority");
        test4.log(Status.PASS, "Priority Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw3 = (JavascriptExecutor) driver;
		dw3.executeScript("window.scrollBy(0, 900)");
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Priority");
			test7.log(Status.FAIL, "Priority filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}

	

	public void Dueby_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterdueoverdue.click();
		Thread.sleep(4000);
		JavascriptExecutor up2 = (JavascriptExecutor) driver;
		up2.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(4000);
		ExtentTest test4 = extent.createTest("Filter-Overdue");
        test4.log(Status.PASS, "Overdue Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Overdue");
			test7.log(Status.FAIL, "Overdue filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
		try {
		JavascriptExecutor dw3 = (JavascriptExecutor) driver;
		dw3.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(4000);
		Filterdueoverdue.click();
		Thread.sleep(4000);
		Filterduetoday.click();
		Thread.sleep(4000);
		JavascriptExecutor up3 = (JavascriptExecutor) driver;
		up3.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(4000);
		ExtentTest test5 = extent.createTest("Filter-Due today");
        test5.log(Status.PASS, "Due today Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Due today");
			test7.log(Status.FAIL, "Due today filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
		try {
		JavascriptExecutor dw4 = (JavascriptExecutor) driver;
		dw4.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(4000);
		Filterduetoday.click();
		Thread.sleep(4000);
		Filterduetomm.click();
		Thread.sleep(4000);
		JavascriptExecutor up4 = (JavascriptExecutor) driver;
		up4.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(4000);
		ExtentTest test6 = extent.createTest("Filter-Due tomorrow");
        test6.log(Status.PASS, "Due tomorrow Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Due tomorrow");
			test7.log(Status.FAIL, "Due tomorrow filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
		try {
		JavascriptExecutor dw5 = (JavascriptExecutor) driver;
		dw5.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(4000);
		Filterduetomm.click();
		Thread.sleep(4000);
		Filterdue8hrs.click();
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-Due Next 8hrs");
        test7.log(Status.PASS, "Due Next 8hrs Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(4000);
		Filterdue8hrs.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Due Next 8hrs");
			test7.log(Status.FAIL, "Due Next 8hrs filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void Service_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterservice.sendKeys(dataMap.get("service"));
		Thread.sleep(5000);
		servicetm.click();
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-Service");
        test7.log(Status.PASS, "Service Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Service");
			test7.log(Status.FAIL, "Service filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void City_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filtercity.sendKeys(dataMap.get("city"));
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-City");
        test7.log(Status.PASS, "City Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-City");
			test7.log(Status.FAIL, "City filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void Function_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterfunction.sendKeys(dataMap.get("function"));
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -1700)");
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-Function");
        test7.log(Status.PASS, "Function Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1300)");
		 Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Function");
			test7.log(Status.FAIL, "Function filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void Medium_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filtermedium.sendKeys(dataMap.get("medium"));
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-Medium");
        test7.log(Status.PASS, "Medium Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1400)");
		 Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Medium");
			test7.log(Status.FAIL, "Medium filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}

	

	public void Language_filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		

		try {
		Filterlanguage.click();
		Thread.sleep(5000);
		Language_search.sendKeys(dataMap.get("language"));
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		ExtentTest test7 = extent.createTest("Filter-Language");
        test7.log(Status.PASS, "Language Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build()); 
		Thread.sleep(4000);
		Filterlanguage.click();
		Thread.sleep(2000);
		Langclr.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Language");
			test7.log(Status.FAIL, "Language filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void Milestone_Submilestone_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filtermilstone.sendKeys(dataMap.get("milestone"));
		Thread.sleep(3000);
		Milestoneselect.click();
		Thread.sleep(5000);
		ExtentTest test7 = extent.createTest("Filter-Milestone");
        test7.log(Status.PASS, "Milestone Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Milestone");
			test7.log(Status.FAIL, "Milestone filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
		try {
		Milestoneclr.click();
		Thread.sleep(4000);
		Filtersubmilstone.sendKeys(dataMap.get("submilstone"));
		Thread.sleep(4000);
		Submilestoneselect.click();
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(4000);
		ExtentTest test8 = extent.createTest("Filter-Submilstone");
        test8.log(Status.PASS, "Submilstone Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
        JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1400)");
		 Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		Filtermilstone.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		Milestoneclr.click();
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Submilstone");
			test7.log(Status.FAIL, "Submilstone filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}

	

	public void Sub_Milestone_ChangedDate_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		Submilstartdate.click();
		Thread.sleep(5000);
		Submilstartdateselect.click();
		Thread.sleep(5000);
		dateclr.click();
		Thread.sleep(5000);
		Submilenddate.click();
		Thread.sleep(5000);
		Submilenddateselect.click();
		Thread.sleep(5000);
		Submildatesubmit.click();
		Thread.sleep(5000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -2200)");
		Thread.sleep(4000);
		ExtentTest test8 = extent.createTest("Filter-Sub_Milestone_ChangedDate");
        test8.log(Status.PASS, "Sub_Milestone_ChangedDate Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
        JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1600)");
		 Thread.sleep(3000);
		Submilstartdate.clear();
		Thread.sleep(5000);
		dateclr.click();
		Thread.sleep(4000);
		Submilenddate.clear();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Sub_Milestone_ChangedDate");
			test7.log(Status.FAIL, "Sub_Milestone_ChangedDate filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}

	

	public void Round_robin_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		FilterRRexistingcust.click();
		Thread.sleep(5000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -2400)");
		Thread.sleep(4000);
		ExtentTest test8 = extent.createTest("Filter-RRexistingcustomer");
        test8.log(Status.PASS, "RRexistingcustomer Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-RRexistingcustomer");
			test7.log(Status.FAIL, "RRexistingcustomer filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
		try {
        JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 1800)");
		 Thread.sleep(3000);
		FilterRRstdassign.click();
		Thread.sleep(4000);
		JavascriptExecutor up6 = (JavascriptExecutor) driver;
		up6.executeScript("window.scrollBy(0, -2400)");
		Thread.sleep(4000);
		ExtentTest test9 = extent.createTest("Filter-RRstandard_assignment");
        test9.log(Status.PASS, "RRstandard_assignment Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
        JavascriptExecutor dw7 = (JavascriptExecutor) driver;
		dw7.executeScript("window.scrollBy(0, 1800)");
		 Thread.sleep(3000);
		FilterRRexistingcust.click();
		Thread.sleep(4000);
		FilterRRstdassign.click();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-RRstandard_assignment");
			test7.log(Status.FAIL, "RRstandard_assignment filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);

	}


	public void Form_Type_Filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterformtype.sendKeys(dataMap.get("formtype"));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		JavascriptExecutor up4 = (JavascriptExecutor) driver;
		up4.executeScript("window.scrollBy(0, -2600)");
		Thread.sleep(5000);
		ExtentTest test9 = extent.createTest("Filter-Formtype");
        test9.log(Status.PASS, "Formtype Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw5 = (JavascriptExecutor) driver;
		dw5.executeScript("window.scrollBy(0, 2200)");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		Filterformtype.click();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-Formtype");
			test7.log(Status.FAIL, "Formtype filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
	}


	public void State_filter(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		Filterstate.sendKeys(dataMap.get("state"));
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor up4 = (JavascriptExecutor) driver;
		up4.executeScript("window.scrollBy(0, -2800)");
		Thread.sleep(5000);
		ExtentTest test9 = extent.createTest("Filter-State");
        test9.log(Status.PASS, "State Filtered Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		JavascriptExecutor dw5 = (JavascriptExecutor) driver;
		dw5.executeScript("window.scrollBy(0, 2500)");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		JavascriptExecutor up5 = (JavascriptExecutor) driver;
		up5.executeScript("window.scrollBy(0, -3000)");
		Thread.sleep(2000);
		HelpdeskElements.Activity_status.click();
		Thread.sleep(3000);
		HelpdeskElements.Freeze.click();
		Thread.sleep(7000);
		HelpdeskElements.Start_working.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Filter-State");
			test7.log(Status.FAIL, "State filtration Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		Thread.sleep(2000);
	}


	public void Ticket_search(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {

		try {
		HelpdeskElements.Searchticketid.sendKeys(dataMap.get("search_TicketID"));
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		ExtentTest test = extent.createTest("TicketID_search");
        test.log(Status.PASS, "TicketID_searched Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("TicketID_search");
			test7.log(Status.FAIL, "TicketID_search Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		try {
		Thread.sleep(2000);
		HelpdeskElements.Searchticketid.clear();
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		HelpdeskElements.Searchsubemail.sendKeys(dataMap.get("search_email"));
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		ExtentTest test1 = extent.createTest("Email_search");
        test1.log(Status.PASS, "Email searched Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
	    } catch(Exception e) {
		ExtentTest test7 = extent.createTest("Email_search");
		test7.log(Status.FAIL, "Email_search Failed: " + e.getMessage(),
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
	    }
		try {
	    Thread.sleep(2000);
		HelpdeskElements.Searchsubemail.clear();
		Thread.sleep(5000);
		HelpdeskElements.Searchsubemail.sendKeys(dataMap.get("search_service"));
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		ExtentTest test3 = extent.createTest("Service_search");
        test3.log(Status.PASS, "Service searched Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(2000);
		HelpdeskElements.Searchsubemail.clear();
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Service_search");
			test7.log(Status.FAIL, "Service_search Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}


	public void Pagination(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
        try {
		HelpdeskElements.Paginationnum.click();
		Thread.sleep(2000);
		ExtentTest test1 = extent.createTest("Pagination -Page no");
        test1.log(Status.PASS, "Page-no clicked Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
		HelpdeskElements.Paginationnext.click();
		Thread.sleep(2000);
		ExtentTest test2 = extent.createTest("Pagination -Next");
        test2.log(Status.PASS, "Page-Next clicked Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
		HelpdeskElements.Paginationlast.click();
		Thread.sleep(2000);
		ExtentTest test3 = extent.createTest("Pagination -Last");
        test3.log(Status.PASS, "Page-Last clicked Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
		HelpdeskElements.Paginationprev.click();
		Thread.sleep(2000);
		ExtentTest test4 = extent.createTest("Pagination -Previous");
        test4.log(Status.PASS, "Page-Previous clicked Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
		HelpdeskElements.Paginationfirst.click();
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Pagination -First");
        test5.log(Status.PASS, "Page-First clicked Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
        } catch(Exception e) {
			ExtentTest test7 = extent.createTest("Pagination");
			test7.log(Status.FAIL, "Pagination Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
        
		
	}


	public void New_Ticket_Creation(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		HelpdeskElements.Helpdeskdropdown.click();
		Thread.sleep(5000);
		HelpdeskElements.Newticket.click();
		Thread.sleep(7000);
		HelpdeskElements.Ticketorsearch.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		Thread.sleep(5000);
		HelpdeskElements.Ticketorselect.click();
		Thread.sleep(6000);
		HelpdeskElements.Choosecity.click();
		Thread.sleep(5000);
		HelpdeskElements.Cityselect.click();
		Thread.sleep(5000);
		HelpdeskElements.Chooseservice.click();
		Thread.sleep(5000);
		HelpdeskElements.Serviceselect.click();
		Thread.sleep(5000);
		JavascriptExecutor dw6 = (JavascriptExecutor) driver;
		dw6.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);
		HelpdeskElements.Description.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		HelpdeskElements.CreateSubmit.click();
		Thread.sleep(6000);
		System.out.println("We are currently on the following URL: " + driver.getCurrentUrl());
		Thread.sleep(3000);
		ticketid = driver.getCurrentUrl().substring(41, 48);
		System.out.println("Parent ticket:" + ticketid);
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("New Ticket Creation");
        test5.log(Status.PASS, "Ticket Created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(4000);
		HelpdeskElements.Home.click();
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("New Ticket Creation");
			test7.log(Status.FAIL, "New Ticket Creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		    }

	}


	public void Ticket_navigation(WebDriver driver, Map<String, String> dataMap,ExtentReports extent ) throws InterruptedException, AWTException {
		
		
		try {
		Thread.sleep(5000);
		HelpdeskElements.Searchticketid.click();
		HelpdeskElements.Searchticketid.sendKeys(ticketid);
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		String clicklnk = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Ticketclick.sendKeys(clicklnk);
		Thread.sleep(6000);
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
		Thread.sleep(6000);
		Servicename = driver.findElement(By.xpath("//div[@class='marginZero']")).getText().substring(28, 64);
		System.out.println("Service name:" + Servicename);
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Ticket_navigation");
        test5.log(Status.PASS, "Ticket_navigated Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Ticket_navigation");
			test7.log(Status.FAIL, "Ticket_navigation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}


	public void Critical_Note(WebDriver driver, Map<String, String> dataMap,ExtentReports extent ) throws InterruptedException, AWTException {
		
		try {
		
		HelpdeskElements.Criticalnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.NewCN.click();
		Thread.sleep(5000);
		HelpdeskElements.CNTexteditor.click(); 
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(5000);
		HelpdeskElements.CNsave.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Critical_Note");
        test5.log(Status.PASS, "Critical_Note created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(3000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Critical_Note");
			test7.log(Status.FAIL, "Critical_Note creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}


	public void Critical_Note_ATT(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		HelpdeskElements.Criticalnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.NewCN.click();
		Thread.sleep(5000);
		HelpdeskElements.CNTexteditor.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		HelpdeskElements.CNattachment.sendKeys("\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Upload documents\\Adhaar front.png");
		Thread.sleep(5000);
		HelpdeskElements.CNsave.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Critical_Note W/Attachment");
        test5.log(Status.PASS, "Critical_Note W/Attachment created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(3000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Critical_Note W/Attachment");
			test7.log(Status.FAIL, "Critical_Note W/Attachment creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }

	}


	public void Critical_Note_CC(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.Criticalnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.NewCN.click();
		Thread.sleep(5000);
		HelpdeskElements.CNTexteditor.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		HelpdeskElements.CNEmployees.click();
		Thread.sleep(5000);
		HelpdeskElements.CNEmployeeselect.click();
		Thread.sleep(5000);
		HelpdeskElements.CNsave.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Critical_Note W/CC");
        test5.log(Status.PASS, "Critical_Note W/CC created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Critical_Note W/CC");
			test7.log(Status.FAIL, "Critical_Note W/CC creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		
	}


	public void Internal_note(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.In_ANnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.IN_ANtexteditor.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		JavascriptExecutor dw11 = (JavascriptExecutor) driver;
		dw11.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);
		HelpdeskElements.IN_ANsend.click();
		Thread.sleep(5000);
		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
		dw21.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Internal Note");
        test5.log(Status.PASS, "Internal Note created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Internal Note");
			test7.log(Status.FAIL, "Internal Note creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
		
	}


	public void Internal_note_ATT(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.In_ANnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.IN_ANtexteditor.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
//		JavascriptExecutor dw13 = (JavascriptExecutor) driver;
//		dw13.executeScript("window.scrollBy(0, 300)");
//		Thread.sleep(5000);
		HelpdeskElements.IN_ANattachment.sendKeys("\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Upload documents\\Adhaar front.png");
		Thread.sleep(6000);
		HelpdeskElements.IN_ANsend.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Internal Note W/Attachment");
        test5.log(Status.PASS, "Internal Note W/Attachment created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Internal Note W/Attachment");
			test7.log(Status.FAIL, "Internal Note W/Attachment creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}


	public void Add_note(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.In_ANnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployees.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployeeselect.click();
		Thread.sleep(5000);
		HelpdeskElements.IN_ANtexteditor.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		JavascriptExecutor dw15 = (JavascriptExecutor) driver;
		dw15.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);
		HelpdeskElements.IN_ANsend.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Add_note");
        test5.log(Status.PASS, "Add_note created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Add_note");
			test7.log(Status.FAIL, "Add_note creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}


	public void Add_note_ATT(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.In_ANnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployees.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployeeselect.click();
		Thread.sleep(5000);
		HelpdeskElements.IN_ANtexteditor.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		JavascriptExecutor dw17 = (JavascriptExecutor) driver;
		dw17.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);
		HelpdeskElements.IN_ANattachment
				.sendKeys("\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Upload documents\\Adhaar front.png");
		Thread.sleep(5000);
		HelpdeskElements.IN_ANsend.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Add_note W/Attachment");
        test5.log(Status.PASS, "Add_note W/Attachment created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Add_note W/Attachment");
			test7.log(Status.FAIL, "Add_note W/Attachment creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}


	public void Add_note_CC(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		HelpdeskElements.In_ANnotes.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployees.click();
		Thread.sleep(5000);
		HelpdeskElements.ANemployeeselect.click();
		Thread.sleep(5000);
		HelpdeskElements.AN_CC.click();
		Thread.sleep(5000);
		HelpdeskElements.AN_CCemployee.click();
		Thread.sleep(5000);
		HelpdeskElements.AN_CCemployeeselect.click();
		Thread.sleep(5000);
		HelpdeskElements.IN_ANtexteditor.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(6000);
		JavascriptExecutor dw19 = (JavascriptExecutor) driver;
		dw19.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);
		HelpdeskElements.IN_ANsend.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		ExtentTest test5 = extent.createTest("Add_note W/CC");
        test5.log(Status.PASS, "Add_note W/CC created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Add_note W/CC");
			test7.log(Status.FAIL, "Add_note W/CC creation Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		    }
	}
	
	public void Email (WebDriver driver,ExtentReports extent) throws InterruptedException, AWTException {
		try {
	   JavascriptExecutor dw20 = (JavascriptExecutor) driver;
	   dw20.executeScript("window.scrollBy(0, -300)");
	   Thread.sleep(5000);
		HelpdeskElements.Takeaction.click();
		Thread.sleep(5000);
		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
		dw21.executeScript("window.scrollBy(0, 500)");
		 Thread.sleep(5000);
		 HelpdeskElements.TA_texteditor.click();
	     Thread.sleep(5000);
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_T);
	     robot.keyRelease(KeyEvent.VK_T); 
	     robot.keyPress(KeyEvent.VK_E);
	     robot.keyRelease(KeyEvent.VK_E);
	     robot.keyPress(KeyEvent.VK_S);
	     robot.keyRelease(KeyEvent.VK_S);
	     robot.keyPress(KeyEvent.VK_T);
	     robot.keyRelease(KeyEvent.VK_T);
	     Thread.sleep(6000);
	     HelpdeskElements.event_subject.sendKeys("Test");
		 Thread.sleep(5000);
		 HelpdeskElements.event_fromdate.click();
		 Thread.sleep(5000);
		 HelpdeskElements.event_dateselect.click();
		 Thread.sleep(5000);
	     HelpdeskElements.event_description.sendKeys("This is a test");
	     Thread.sleep(3000);
	     HelpdeskElements.Mailsend.click();
	     Thread.sleep(5000);
	     ExtentTest test5 = extent.createTest("Email");
	        test5.log(Status.PASS, "Email Sent Successfully",
	                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Email");
			test7.log(Status.FAIL, "Email Failed to Send: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		    }
     
	}
	
	public void Email_Canned_ATT (WebDriver driver,ExtentReports extent) throws InterruptedException, AWTException {
		
		    try {		
		    JavascriptExecutor dw22 = (JavascriptExecutor) driver;
			dw22.executeScript("window.scrollBy(0, -700)");
	        Thread.sleep(5000);
			HelpdeskElements.Takeaction.click();
			Thread.sleep(5000);
			JavascriptExecutor dw24 = (JavascriptExecutor) driver;
			dw24.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(5000);
			HelpdeskElements.TA_texteditor.click();
		    Thread.sleep(5000);
		    Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SPACE);
		    robot.keyRelease(KeyEvent.VK_SPACE); 
		    Thread.sleep(3000);
		    HelpdeskElements.TA_Cannedresp.click();
		    Thread.sleep(6000);
		    HelpdeskElements.Cannedresp_search.sendKeys("Closure of LLP");
		    Thread.sleep(6000);
		    HelpdeskElements.Cannedresp_select.click();
		    Thread.sleep(6000);
		    HelpdeskElements.Email_attachment.sendKeys("\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Upload documents\\Adhaar front.png");
		     Thread.sleep(6000); 
		    HelpdeskElements.Mailsend.click();
		    Thread.sleep(5000);
		    ExtentTest test5 = extent.createTest("Email with Canned response / Attachment");
	        test5.log(Status.PASS, "Email with Canned response / Attachment sent Successfully",
	                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		    } catch(Exception e) {
				ExtentTest test7 = extent.createTest("Email with Canned response / Attachment");
				test7.log(Status.FAIL, "Email with Canned response / Attachment Failed to Send: " + e.getMessage(),
			            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
				Thread.sleep(5000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				
			    }
	}
	
     
	public void Event_check (WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		try {
       JavascriptExecutor up21 = (JavascriptExecutor) driver;
	   up21.executeScript("window.scrollBy(0, -100)");
	   Thread.sleep(3000);
	   HelpdeskElements.eventuncheck.click();
	   Thread.sleep(5000);
	   ExtentTest test5 = extent.createTest("Events");
       test5.log(Status.PASS, "Event Cleared Successfully",
               MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
       Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Events");
			test7.log(Status.FAIL, "Events Failed to Clear : " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		    }
	
	}
	
	

	public void Quotation_creation(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {

		try {
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(2000);
		String clicklnk2 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Createquotation.sendKeys(clicklnk2);
		Thread.sleep(6000);
		Set<String> windows1 = driver.getWindowHandles();
		for (String window1 : windows1) {
			driver.switchTo().window(window1);
		}
//		HelpdeskElements.Quotation_name.sendKeys("Aejaaz");
//		Thread.sleep(5000);
//		HelpdeskElements.Quotation_address.sendKeys("21 jump street, chennai - 74");
//		Thread.sleep(5000);
//		HelpdeskElements.Quotation_pincode.sendKeys("600074");
//		Thread.sleep(5000);
		Thread.sleep(5000);
		ExtentTest test5 = extent.createTest("Quotation Engine");
        test5.log(Status.PASS, "Quotation Engine navigated Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		HelpdeskElements.Quotation_gstin.clear();
		Thread.sleep(3000);
		HelpdeskElements.Quotation_gstin.sendKeys(dataMap.get("gstin"));
		Thread.sleep(5000);
		HelpdeskElements.Addr_verify.click();
		Thread.sleep(5000);
		WebElement Quotestrtdate = driver.findElement(By.xpath("//input[@name='calculator[" + ticketid + "][start_date]']"));
		Quotestrtdate.click();
		Thread.sleep(6000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		HelpdeskElements.Year_next.click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Quoteconfirm.click();
		Thread.sleep(5000);
		JavascriptExecutor dw22 = (JavascriptExecutor) driver;
		dw22.executeScript("window.scrollBy(0, 500)");
		HelpdeskElements.Quotesend.click();
//		Thread.sleep(3000);
//		HelpdeskElements.Quotedeactive_NO.click();
		Thread.sleep(6000);
		driver.close();
		List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab.get(1));
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
		dw21.executeScript("window.scrollBy(0, 350)");
		Thread.sleep(2000);
		ExtentTest test6 = extent.createTest("Quotation creation");
        test6.log(Status.PASS, "Quotation created Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("window.scrollBy(0, -350)");
		Thread.sleep(3000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Quotation creation");
			test7.log(Status.FAIL, "Quotation creation Failed : " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		}
		
	
	}
	

	public void Quote_edit(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		HelpdeskElements.Quotationload.click();
		Thread.sleep(5000);
		HelpdeskElements.Quote_edit.click();
		Thread.sleep(5000);
		List<String> switchtab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab2.get(2));
		Thread.sleep(5000);
		WebElement QuoteEnddate = driver.findElement(By.xpath("//input[@name='calculator[" + ticketid + "][expiry_date]']"));
		QuoteEnddate.click();
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		WebElement Profee1 = driver.findElement(By.xpath("//input[@id='fee_type_1_"+ticketid+"']"));
		Profee1.clear();
    	Profee1.sendKeys(dataMap.get("profee"));
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		WebElement Confee1 = driver.findElement(By.xpath("//input[@id='fee_type_2_"+ticketid+"']"));
		Confee1.clear();
    	Confee1.sendKeys(dataMap.get("confee"));
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		WebElement Govfee1 = driver.findElement(By.xpath("//input[@id='fee_type_4_"+ticketid+"']"));
		Govfee1.clear();
    	Govfee1.sendKeys(dataMap.get("govfee"));
    	Thread.sleep(3000);
		HelpdeskElements.Quoteconfirm.click();
		Thread.sleep(5000);
		JavascriptExecutor dw23 = (JavascriptExecutor) driver;
		dw23.executeScript("window.scrollBy(0, 500)");
		HelpdeskElements.Quote_update.click();
		Thread.sleep(5000);
		driver.close();
		List<String> switchtab3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab3.get(1));
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
		dw21.executeScript("window.scrollBy(0, 350)");
		Thread.sleep(2000);
		ExtentTest test6 = extent.createTest("Quotation Edit");
        test6.log(Status.PASS, "Quotation Edited Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Quotation Edit");
			test7.log(Status.FAIL, "Quotation Edit Failed : " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		}
	}


	public void Paynow(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		String clicklnk3 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.QuotePaynow.sendKeys(clicklnk3);
		Thread.sleep(6000);
		Set<String> windows2 = driver.getWindowHandles();
		for (String window2 : windows2) {
			driver.switchTo().window(window2);
		}

		Thread.sleep(6000);
		ExtentTest test6 = extent.createTest("Price summary");
        test6.log(Status.PASS, "Price summary navigated Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		driver.close();
		List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab.get(1));
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Price summary");
			test7.log(Status.FAIL, "Price summary Failed to navigate : " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		}
		
	}


	public void Quote_generate(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("window.scrollBy(0, -350)");   
		Thread.sleep(3000);
		HelpdeskElements.Quotationload.click();
		Thread.sleep(5000);
		HelpdeskElements.Quotegenerate.click();    
		Thread.sleep(5000);
		List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(switchtab.get(2));
		Thread.sleep(5000);
		JavascriptExecutor dw = (JavascriptExecutor) driver;
		dw.executeScript("window.scrollBy(0, 2500)");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement QuoteLink = driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip']/a)[2]"));
		PdfURL = QuoteLink.getAttribute("href");
		Thread.sleep(5000);
		QuoteLink.click();
		Thread.sleep(5000);
		Set<String> windows1 = driver.getWindowHandles();
		for (String window1 : windows1) {
			driver.switchTo().window(window1);
		}
		
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Quotation generate");
		test6.log(Status.PASS, "Quotation generated Successfully",
		        MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(3000);
		List<String> switchtab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab2.get(2));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		List<String> switchtab3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab3.get(1));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Quotation generate");
			test7.log(Status.FAIL, "Quotation generate Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		}

	}


	public void Quote_deactivate(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		try {
//		JavascriptExecutor dw25 = (JavascriptExecutor) driver;
	//	dw25.executeScript("window.scrollBy(0, -800)");
//		dw25.executeScript("window.scrollBy(0, 1200)");
		HelpdeskElements.Quotationload.click();
		Thread.sleep(5000);
		HelpdeskElements.Quotedeactivate.click();
		Thread.sleep(5000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(4000);
		HelpdeskElements.Quotationload.click();
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Quotation Deactiavtion");
        test6.log(Status.PASS, "Quotation Deactivated Successfully",
                MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Quotation Deactiavtion");
			test7.log(Status.FAIL, "Quotation Deactiavtion Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		}
	}


	public void Crosssale(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		HelpdeskElements.Crosssale.click();
		Thread.sleep(5000);
		HelpdeskElements.Cross_salesearch.sendKeys("Start a Partnership Firm");
		Thread.sleep(3000);
		HelpdeskElements.Cross_saleselect.click();
		Thread.sleep(5000);
		HelpdeskElements.Cross_salecreate.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		HelpdeskElements.Recenttickets.click();
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Cross Sale ticket Creation");
        test6.log(Status.PASS, "Cross Sale ticket created Successfully",
              MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(7000);
		Actions action2 = new Actions(driver);
		WebElement findElement2 = driver
				.findElement(By.xpath("(//ul[@class='nav tcktdetails'])[1]/child::li/child::u/child::a"));
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("arguments[0].click();", findElement2);
		Thread.sleep(5000);

		ticketid2 = driver.findElement(By.xpath("//div[@class='marginZero']")).getText().substring(1, 8);
		System.out.println("Child ticket:" + ticketid2);
		Thread.sleep(5000);
		 test6.log(Status.PASS, "Cross sale ticket navigated",
	              MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	} catch(Exception e) {
		ExtentTest test7 = extent.createTest("Cross sale function");
		test7.log(Status.FAIL, "Cross sale function Failed : " + e.getMessage(),
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab.get(1));
		Thread.sleep(5000);
		
	}
	}


	public void Merge_unmerge(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
			
		//Merge
		HelpdeskElements.Merge_ticket.click();
		Thread.sleep(6000);
		ExtentTest test6 = extent.createTest("Merge / Unmerge Ticket");
		test6.log(Status.PASS, "Merge ticket Open Successfully",
	              MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
		HelpdeskElements.Merge_search_ticket.sendKeys(ticketid2);
		Thread.sleep(6000);
		WebElement Merging_ticket = driver.findElement(By.xpath("//li[contains(text(),'" + ticketid2 + "')]"));
		Merging_ticket.click();
		Thread.sleep(6000);
		WebElement Primaryticket = driver.findElement(By.xpath("//input[@id='_" + ticketid + "']"));
		Primaryticket.click();
		HelpdeskElements.Merge_save.click();
		Thread.sleep(7000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
		dw20.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(5000);
        test6.log(Status.PASS, "Ticket Merged Successfully",
              MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("window.scrollBy(0, -1200)");
		Thread.sleep(5000);

	   // Un-merge

		List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab.get(0));
		Thread.sleep(6000);
		HelpdeskElements.Searchticketid.clear();
		Thread.sleep(5000);
		HelpdeskElements.Searchticketid.sendKeys(ticketid2);
		Thread.sleep(5000);
		HelpdeskElements.Searchsubmit.click();
		Thread.sleep(5000);
		String clicklnk4 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Merge_ticketclick.sendKeys(clicklnk4);
		Thread.sleep(6000);
		Set<String> windows5 = driver.getWindowHandles();
		for (String window5 : windows5) {
			driver.switchTo().window(window5);
		}
		Thread.sleep(6000);
		HelpdeskElements.Unmerge.click();
		Thread.sleep(5000);
		JavascriptExecutor dw23 = (JavascriptExecutor) driver;
		dw23.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(5000);
        test6.log(Status.PASS, "Ticket Unmerged Successfully",
              MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(3000);
		List<String> switchtab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchtab2.get(1));
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		}

		catch(Exception e) {
			ExtentTest test7 = extent.createTest("Merge / Unmerge Ticket");
			test7.log(Status.FAIL, "Merge / Unmerge Ticket Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(switchtab.get(1));
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			JavascriptExecutor dw23 = (JavascriptExecutor) driver;
			dw23.executeScript("window.scrollBy(0, -2000)");
			Thread.sleep(5000);
		    }
		
	}


	public void Ticket_Requester_Edit(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		HelpdeskElements.Ticket_edit.click();
		Thread.sleep(3000);
		ExtentTest test6 = extent.createTest("Edit Ticket- Requester");
      test6.log(Status.PASS, "Edit Ticket Opened Successfully",
            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
        Thread.sleep(5000);
		HelpdeskElements.Requester.click();
		Thread.sleep(6);
		HelpdeskElements.Requestersearch.sendKeys(dataMap.get("requester"));
		Thread.sleep(5000);
		HelpdeskElements.Requestervalue.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		HelpdeskElements.Edit_Update.click();
		Thread.sleep(6000);
		HelpdeskElements.Yesupdate.click();
//		HelpdeskElements.Noupdate.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		test6.log(Status.PASS, "Ticket Requester Updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
	    Thread.sleep(5000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Edit Ticket- Requester");
			test7.log(Status.FAIL, "Edit Ticket- Requester Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}
			
			}


	public void Ticket_Edit(WebDriver driver, Map<String, String> dataMap,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		HelpdeskElements.Ticket_edit.click();
		Thread.sleep(5000);

		// --Ticket priority
//		HelpdeskElements.Requester.click();
//		Thread.sleep(5000);
		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
		HelpdeskElements.Ticketpriority.click();
		Thread.sleep(5000);
		HelpdeskElements.Priorityselect.click();
		Thread.sleep(5000);
////		//--Ticket status
		HelpdeskElements.Ticketstatus.click();
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_status"));
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

//	    //--Payment status
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_Pstatus"));
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

////	    //--Am source
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);

////	    //--Assigned to
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_assigneto"));
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.City_lable.click();
		Thread.sleep(5000);
		
////	    //--City
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_city"));
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////	    //--Service
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(Servicename);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////	    //-- Milestone
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_milestone"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////	    //--BAT agent
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_BAT"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////		//--Ticket professional
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
////	    //--Lead quality
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_LeadQL"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////	    //Expert
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
////	    //Form type
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		HelpdeskElements.Editsearch.sendKeys(dataMap.get("edit_formtype"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
////	    //--Relationship manager
		
		HelpdeskElements.Edit_Update.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000); 
		HelpdeskElements.Ticket_edit.click();
		Thread.sleep(3000);
		ExtentTest test6 = extent.createTest("Edit Ticket");
		test6.log(Status.PASS, "Ticket Edited Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
	    Thread.sleep(5000);
	    HelpdeskElements.TicketEditClose.click();
	    Thread.sleep(5000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Edit Ticket");
			test7.log(Status.FAIL, "Ticket Edit Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}
			
		}
	

	// Copying links

	public void Copy_magickey(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.Magickey.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		List<String> all33 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all33.get(2));
		Thread.sleep(4000);
		ExtentTest test6 = extent.createTest("Magic link");
		test6.log(Status.PASS, "Magic link opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		List<String> all34 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all34.get(1));
		Thread.sleep(5000);
		} catch(Exception e) {
			ExtentTest test7 = extent.createTest("Magic link");
			test7.log(Status.FAIL, "Magic link Failed to Open: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}

	}


	public void Copy_Referrallink(WebDriver driver,ExtentReports extent) throws InterruptedException, AWTException {
		try {
		HelpdeskElements.Refferallink.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		List<String> all33 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all33.get(2));
		Thread.sleep(4000);
		ExtentTest test6 = extent.createTest("Referral link");
		test6.log(Status.PASS, "Referral link opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		List<String> all34 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all34.get(1));
		Thread.sleep(4000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Referral link");
			test7.log(Status.FAIL, "Referral link Failed to Open: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}
	}


	public void Doc_uploadlink(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		
		try {
		HelpdeskElements.Docuploadlink.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		List<String> all33 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all33.get(2));
		Thread.sleep(4000);
		ExtentTest test6 = extent.createTest("Document Upload link");
		test6.log(Status.PASS, "Document Upload link opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		List<String> all34 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all34.get(1));
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		} 
		catch (Exception e){
			ExtentTest test7 = extent.createTest("Document Upload link");
			test7.log(Status.FAIL, "Document Upload link Failed to Open: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		}
		
		
		
	}



	public void Manage_email(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		try {

		HelpdeskElements.Ticket_edit.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(6000);
		HelpdeskElements.Manage_email.click();
		Thread.sleep(5000);

		// master email
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Manage Email");
		test6.log(Status.PASS, "Master email added Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		
//		    //--Master cc
//		    
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		test6.log(Status.PASS, "Master CC - Email added Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

//		    //--Master bcc
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		test6.log(Status.PASS, "Master BCC - Email added Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		HelpdeskElements.Edit_Update.click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Updated values in send email section

		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
		dw21.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(5000);
		HelpdeskElements.Takeaction.click();
		Thread.sleep(5000);
		JavascriptExecutor dw22 = (JavascriptExecutor) driver;
		dw22.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(5000);
		HelpdeskElements.TA_cc.click();
		Thread.sleep(6000);
		HelpdeskElements.TA_bcc.click();
		Thread.sleep(6000);
		test6.log(Status.PASS, "Master Email / CC / BCC updated successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		JavascriptExecutor dw41 = (JavascriptExecutor) driver;
		dw41.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(5000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Manage Email");
			test7.log(Status.FAIL, "Managing emails Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}

	}


	public void Mile_submilestone(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		try {

		Thread.sleep(5000);
		HelpdeskElements.Atmtocont_MS.click();
		Thread.sleep(5000);
		JavascriptExecutor dw26 = (JavascriptExecutor) driver;
		dw26.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Atmtocont_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Milestone / Sub-Milstone Update");
		test6.log(Status.PASS, "Attempted to contact updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		
		HelpdeskElements.Contacted_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Contacted_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Contacted updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Quotesent_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Quotesent_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Quotation Sent updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Closed_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Closed_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Closed updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Doctodispatch_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Doctodispatch_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw22 = (JavascriptExecutor) driver;
		dw22.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Documents to Despatch updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Firstcall_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Firstcall_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw24 = (JavascriptExecutor) driver;
		dw24.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "First Call updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.IntDoc_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.IntDoc_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw25 = (JavascriptExecutor) driver;
		dw25.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Initial Docs updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.DSC_VA_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.DSC_VA_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw27 = (JavascriptExecutor) driver;
		dw27.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "DSC - Verify and Apply updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Res_uni_name_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Res_uni_name_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw28 = (JavascriptExecutor) driver;
		dw28.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Reserve Unique Name updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Final_set_doc_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Final_set_doc_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw29 = (JavascriptExecutor) driver;
		dw29.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Final Set Docs updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Final_INC_MS.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone.click();
		Thread.sleep(5000);
		HelpdeskElements.Final_INC_Sub.click();
		Thread.sleep(5000);
		HelpdeskElements.Submilstone_update.click();
		Thread.sleep(5000);
		JavascriptExecutor dw30 = (JavascriptExecutor) driver;
		dw30.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Final INC Form updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);

		HelpdeskElements.Justin_MS.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Just in updated Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Milestone / Sub-Milstone Update");
			test7.log(Status.FAIL, "Milestone / Sub-Milstone Update Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}

	}

	public void MiddlepageCTA(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

//      //--Customer dashboard
		JavascriptExecutor dw29 = (JavascriptExecutor) driver;
		dw29.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(5000);
		String clicklnk5 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Customerdashabord.sendKeys(clicklnk5);
		Thread.sleep(3000);
		List<String> all38 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all38.get(2));
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Middle page CTA's ");
		test6.log(Status.PASS, "Customer Dashboard opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
	
//	    
//
//		// --GRC ---Issue
		List<String> all36 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all36.get(1));
		Thread.sleep(5000);
	    String clicklnk = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.GRC.sendKeys(clicklnk);
		Thread.sleep(5000);
		List<String> all37 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all37.get(2));
		Thread.sleep(5000);
		test6.log(Status.PASS, "GRC opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
	    robot.keyRelease(KeyEvent.VK_W);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(5000);

//	   //--Docvault
//	    
		List<String> all39 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all39.get(1));
		Thread.sleep(5000);
		String clicklnk8 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.DocVault.sendKeys(clicklnk8);
		Thread.sleep(5000);
		List<String> all40 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all40.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Document Vault opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////	    
////	    //--VerifyDoc
////	    
		List<String> all41 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all41.get(1));
		Thread.sleep(5000);
		String clicklnk7 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.VerifyDoc.sendKeys(clicklnk7);
		Thread.sleep(5000);
		List<String> all42 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all42.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Verify Documents opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////	    
////	    
////	    //---Upload_deliv_doc
////	    
		List<String> all43 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all43.get(1));
		Thread.sleep(5000);
		String clicklnk11 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Upload_deliv_doc.sendKeys(clicklnk11);
		Thread.sleep(5000);
		List<String> all44 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all44.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Upload Delivery Documents opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////	    
////	    //-- Movetojustin
////	    
		List<String> all45 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all45.get(1));
		Thread.sleep(5000);
		HelpdeskElements.Movetojustin.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Move To justin Clicked opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
////		
////		//--View_gen_docs
////		
		List<String> all46 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all46.get(1));
		Thread.sleep(5000);
		String clicklnk9 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.View_gen_docs.sendKeys(clicklnk9);
		Thread.sleep(5000);
		List<String> all47 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all47.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "View and Generate Documents opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////		    
////		    
////		    //--View_gen_sub__docs
////		    
		List<String> all48 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all48.get(1));
		Thread.sleep(5000);
		String clicklnk10 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.View_gen_sub__docs.sendKeys(clicklnk10);
		Thread.sleep(5000);
		List<String> all49 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all49.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "View and Generate Subscriber Documents opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////		    
////		    //--Annual_file_automation
////		    
		List<String> all50 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all50.get(1));
		Thread.sleep(5000);
		String clicklnk17 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Annual_file_automation.sendKeys(clicklnk17);
		Thread.sleep(5000);
		List<String> all51 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all51.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Annual_file_automation opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////		    
////		    //--Customerprofile
////		
		List<String> all52 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all52.get(1));
		Thread.sleep(5000);
		String clicklnk12 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Customerprofile.sendKeys(clicklnk12);
		Thread.sleep(5000);
		List<String> all53 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all53.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Customer profile opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
////		    
////		    //--DSC_lib_man
////		    
		List<String> all54 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all54.get(1));
		Thread.sleep(5000);
		String clicklnk13 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.DSC_lib_man.sendKeys(clicklnk13);
		Thread.sleep(5000);
		List<String> all55 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all55.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "DSC Library Management opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
//		    
//		    //--DSC_details
//		    
		List<String> all56 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all56.get(1));
		Thread.sleep(5000);
		HelpdeskElements.DSC_details.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "DSC Details opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
//			
//			
//			//--Entity_info
//			
		List<String> all57 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all57.get(1));
		Thread.sleep(5000);
		HelpdeskElements.Entity_info.click();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Entity Info opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
//			
//			//--Activitylog
//			
		List<String> all58 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all58.get(1));
		Thread.sleep(5000);
		String clicklnk14 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Activitylog.sendKeys(clicklnk14);
		Thread.sleep(5000);
		List<String> all59 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all59.get(2));
		Thread.sleep(3000);
		test6.log(Status.PASS, "Activity Log opened Successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		List<String> all60 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all60.get(1));
	    Thread.sleep(5000);
	 } catch (Exception e) {
		ExtentTest test7 = extent.createTest("Middle page CTA's ");
		test7.log(Status.FAIL, "Middle page CTA's  Failed to open: " + e.getMessage(),
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	}
	}


	public void Loadmore(WebDriver driver,ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		JavascriptExecutor dw30 = (JavascriptExecutor) driver;
		dw30.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest("Load more");
		test6.log(Status.PASS, "Load more visibility",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);
		HelpdeskElements.Loadmore.click();
		Thread.sleep(5000);
		JavascriptExecutor dw31 = (JavascriptExecutor) driver;
		dw31.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(4000);
		test6.log(Status.PASS, "Load more action done",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(4000);
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Load more");
			test7.log(Status.FAIL, "Load more Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}
	}

	public void Addexpenses(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
		
		try {

		JavascriptExecutor dw32 = (JavascriptExecutor) driver;
		dw32.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(5000);
		String clicklnk15 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Ticketexpense.sendKeys(clicklnk15);
		Thread.sleep(5000);
		List<String> all61 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all61.get(2));
		Thread.sleep(5000);
		ExtentTest test6 = extent.createTest(" Add Expenses");
		test6.log(Status.PASS, "Add Expenses Openened successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);

		// Gov fee(add)

		HelpdeskElements.Govfee.click();
		Thread.sleep(3000);
		HelpdeskElements.GFExpensestype.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Govfeeamount.sendKeys("2000");
		Thread.sleep(3000);
		HelpdeskElements.Govfeedate.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Govfeesubmit.click();
		Thread.sleep(4000);
		test6.log(Status.PASS, "Gov fee added successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);

		// affiliate fee(add)

		HelpdeskElements.Affiliatefee.click();
		Thread.sleep(3000);
		HelpdeskElements.AFExpensestype.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Afflfeeamount.sendKeys("1000");
		Thread.sleep(3000);
		HelpdeskElements.Afflfeedate.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Afflfeesubmit.click();
		Thread.sleep(4000);
		test6.log(Status.PASS, "Affiliate fee added successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);

		List<String> all62 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all62.get(1));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		test6.log(Status.PASS, "Added Expenses in Ticket view page",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
//		JavascriptExecutor dw34 = (JavascriptExecutor) driver;
//		dw34.executeScript("window.scrollBy(0, 1700)");
		Thread.sleep(5000);
		List<String> all63 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all63.get(2));

		// Gov fee (Edit)

		HelpdeskElements.Govfee_edit.click();
		Thread.sleep(3000);
		HelpdeskElements.Edit_GFExpensestype.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Edit_Govfeeamount.clear();
		Thread.sleep(3000);
		HelpdeskElements.Edit_Govfeeamount.sendKeys("3000");
		Thread.sleep(3000);
		HelpdeskElements.Edit_Govfeedate.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Govfeeupdate.click();
		Thread.sleep(4000);
		test6.log(Status.PASS, "Gov fee Edited successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);

		// Aff fee (Edit)

		HelpdeskElements.Affledit.click();
		Thread.sleep(3000);
		HelpdeskElements.Edit_AFExpensestype.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Edit_Afflfeeamount.clear();
		Thread.sleep(3000);
		HelpdeskElements.Edit_Afflfeeamount.sendKeys("2000");
		Thread.sleep(3000);
		HelpdeskElements.Edit_Afflfeedate.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		HelpdeskElements.Afflfeeupdate.click();
		Thread.sleep(4000);
		test6.log(Status.PASS, "Affiliate fee Edited successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);

		// Govfee delete

		HelpdeskElements.Govfeedelete.click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		test6.log(Status.PASS, "Gov fee Deleted successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);
		HelpdeskElements.Affldelete.click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		test6.log(Status.PASS, "Affiliate fee Deleted successfully",
	            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		List<String> all64 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all64.get(1));
		} catch (Exception e) {
			ExtentTest test7 = extent.createTest("Add Expenses");
			test7.log(Status.FAIL, "Add Expenses Failed: " + e.getMessage(),
		            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
		}
		

	}
		
		public void Logout(WebDriver driver, ExtentReports extent) throws InterruptedException, AWTException {
			
			try {
				HelpdeskElements.Logout.click();
				Thread.sleep(5000);
				ExtentTest test6 = extent.createTest("Log out");
				test6.log(Status.PASS, "Logged out successfully",
			            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
				Thread.sleep(3000);
			}catch (Exception e) {
				ExtentTest test7 = extent.createTest("Log out");
				test7.log(Status.FAIL, "Log out Failed: " + e.getMessage(),
			            MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
				Thread.sleep(5000);
			}
	
		}
	

}
