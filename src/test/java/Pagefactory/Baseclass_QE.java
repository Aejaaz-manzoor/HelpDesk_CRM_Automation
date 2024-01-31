package Pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_QE extends HelpdeskElements {
	public WebDriver driver;
	static SimpleDateFormat dateFormat21 = new SimpleDateFormat("d");
	static String currentDate = dateFormat21.format(new java.util.Date());

	public static void main(String[] args) throws AWTException, InterruptedException {
//Browser_launch

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qe-helpdesk.vakilsearch.com/login");
//Screen_resolution
		Thread.sleep(5000);
		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//Login

		PageFactory.initElements(driver, HelpdeskElements.class);
		HelpdeskElements.Username.sendKeys("aejaazmanzoor@yahoo.com");
		Thread.sleep(3000);
		HelpdeskElements.Password.sendKeys("Vakil@123");
		Thread.sleep(3000);
		HelpdeskElements.Signin.click();
		Thread.sleep(5000);
//		HelpdeskElements.Logoclick.click();
		
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		HelpdeskElements.Activity_status.click();
//		Thread.sleep(3000);
//		HelpdeskElements.Freeze.click();
//		Thread.sleep(7000);
//		HelpdeskElements.Start_working.click();
//		Thread.sleep(3000);
		

//Filters

//		HelpdeskElements.Filteremployee.sendKeys("Dhrubo BD");
//		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		  Thread.sleep(5000); 
//		  HelpdeskElements.empdropdownclose.click(); 
//		  Thread.sleep(5000);
//		  HelpdeskElements.Filterempclear.click(); 
//		  Thread.sleep(5000);

//	Requester hold	  

//		  HelpdeskElements.Filterrequester.sendKeys("kavi_13@gmail.com") ;
//		  Thread.sleep(5000);
//		  WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"select2-requesters_select-results\"]/li[2]"));
//		  JavascriptExecutor j = (JavascriptExecutor) driver;
//		  j.executeScript("arguments[0].click();", elementToHover);	

		// CR-AR

//			  HelpdeskElements.Filtercr.click();
//			  Thread.sleep(6000);
//			  HelpdeskElements.Filtercr.click();
//			  Thread.sleep(6000);
//			  HelpdeskElements.Filterar.click();
//			  Thread.sleep(6000);
//			  HelpdeskElements.Filterar.click();
//			  Thread.sleep(5000);
//			
//			 JavascriptExecutor dw = (JavascriptExecutor) driver;
//			 dw.executeScript("window.scrollBy(0, 2500)");
//
//		// 3 Checkboxes
//
//		 Thread.sleep(5000);
//		  HelpdeskElements.Filterdoccollect.click();
//		  Thread.sleep(6000);
//		  HelpdeskElements.Filterdoccollect.click();
//		  Thread.sleep(6000);
//		  HelpdeskElements.Filternamecheck.click();
//		  Thread.sleep(6000);
//		  HelpdeskElements.Filternamecheck.click();
//		  Thread.sleep(6000);
//		  HelpdeskElements.Filtertmcheck.click();
//		  Thread.sleep(6000);
//		  HelpdeskElements.Filtertmcheck.click();
//		  Thread.sleep(6000);

//		// Status dropdown
////	 
//		  HelpdeskElements.Filterstatus.click();
//		  Thread.sleep(6000);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(6000);
//		  robot.keyPress(KeyEvent.VK_ENTER);
//	      robot.keyRelease(KeyEvent.VK_ENTER);
//	      Thread.sleep(6000);	      
//	     JavascriptExecutor up = (JavascriptExecutor) driver;
//		 up.executeScript("window.scrollBy(0, -300)");
//		 Thread.sleep(6000);
//		 JavascriptExecutor dw1 = (JavascriptExecutor) driver;
//		 dw1.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(6000);		 
//		 HelpdeskElements.Filterstatusclear.click();
//		 Thread.sleep(6000);
////		 
//		// TicketCreated selection
//
//		 HelpdeskElements.Filtercreatedon.click();
//		 Thread.sleep(3000);
//		 robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(3000);
//		  robot.keyPress(KeyEvent.VK_ENTER);
//	      robot.keyRelease(KeyEvent.VK_ENTER);
//	      Thread.sleep(6000);
//	      
//	      JavascriptExecutor up1 = (JavascriptExecutor) driver;
//		 up1.executeScript("window.scrollBy(0, -300)");
//	     Thread.sleep(6000);
//		JavascriptExecutor dw2 = (JavascriptExecutor) driver;
//		dw2.executeScript("window.scrollBy(0, 300)");
//	     Thread.sleep(6000);
//	      
//		 HelpdeskElements.Filtercreatedonselect.click();
//		 Thread.sleep(6000);
//		 HelpdeskElements.Filtercreatedon.click();
//		 Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_UP);
//		  robot.keyRelease(KeyEvent.VK_UP);
//		  robot.keyPress(KeyEvent.VK_UP);
//		  robot.keyRelease(KeyEvent.VK_UP);
//		  Thread.sleep(6000);
//		  robot.keyPress(KeyEvent.VK_ENTER);
//	      robot.keyRelease(KeyEvent.VK_ENTER);
//	      Thread.sleep(6000);
//	      HelpdeskElements.Filtercreatedonselect.click();
//
//		// Ticket Assigned Date
//
//	         HelpdeskElements.Filterstdate.click();
//			 Thread.sleep(5000); 
//			 HelpdeskElements.strtdateselect.click();
//			 Thread.sleep(5000);			 
//			 HelpdeskElements.Filterendate.click();
//			 Thread.sleep(5000);
//			 HelpdeskElements.enddateselect.click();
//			 Thread.sleep(5000);
//			 HelpdeskElements.Filterdateselect.click();
//			 Thread.sleep(7000);
//			 HelpdeskElements.Filterstdate.clear();
//			 Thread.sleep(5000);
//			 HelpdeskElements.Filterclr.click();
//			 Thread.sleep(5000);
//			 HelpdeskElements.Filterendate.clear();
//			 Thread.sleep(5000);
//			 HelpdeskElements.Filterclr.click();
//			 Thread.sleep(5000);
//			 HelpdeskElements.Filterdateselect.click();
//			 Thread.sleep(5000);
//
//		// Payment Status
//
////			 
////			 
//			 HelpdeskElements.Filterpaystatus.sendKeys("Paid - no dues");
//			 Thread.sleep(3000);
//			 robot.keyPress(KeyEvent.VK_ENTER);
//		     robot.keyRelease(KeyEvent.VK_ENTER);		      
//		     Thread.sleep(5000);
//		     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		     robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//		     Thread.sleep(5000);
////		 
//
//		// Priority
////		 
//		 HelpdeskElements.Filterticpriority.sendKeys("High");
//		 Thread.sleep(3000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(3000);
//	     JavascriptExecutor up2 = (JavascriptExecutor) driver;
//		 up2.executeScript("window.scrollBy(0, -1000)");
//		 Thread.sleep(5000);   
//		 JavascriptExecutor dw3 = (JavascriptExecutor) driver;
//		 dw3.executeScript("window.scrollBy(0, 1000)");    
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//
//		// Due By
//
//	     HelpdeskElements.Filterdueoverdue.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterdueoverdue.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterduetoday.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterduetoday.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterduetomm.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterduetomm.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterdue8hrs.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterdue8hrs.click();
//	     Thread.sleep(6000);
//
////last called on skip
////Affiliate skip	     
//
//		// Service
//
//	     HelpdeskElements.Filterservice.sendKeys("Trademark registration");
//	     Thread.sleep(5000);
//	     HelpdeskElements.servicetm.click();
//	     Thread.sleep(6000);
		
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//
//		// City
////	     
//	     HelpdeskElements.Filtercity.sendKeys("Hyderabad");
//	     Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//
//		// Function
////	     
////	     
//	     HelpdeskElements.Filterfunction.sendKeys("ABC DAT RRQ");
//	     Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(7000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//
////Verified skip
////Ticket source skip - need to do "Google"
//
//		// Medium
//
//	     HelpdeskElements.Filtermedium.sendKeys("TMO Crawler");
//	     Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(7000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
////	     
//		// Language
//
////	     
//	     HelpdeskElements.Filterlanguage.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Langtamil.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Filterlanguage.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Langclr.click();
//	     Thread.sleep(5000);
////	     
//		// MileStone & Sub MileStone
//
////	     
//	     HelpdeskElements.Filtermilstone.sendKeys("Data & Document Collection");
//	     Thread.sleep(3000);
//	     HelpdeskElements.Milestoneselect.click();
//	     Thread.sleep(5000);
//         HelpdeskElements.Milestoneclr.click();
//         Thread.sleep(2000);
//	     HelpdeskElements.Filtersubmilstone.sendKeys("Document");
//	     Thread.sleep(6000);
//	     HelpdeskElements.Submilestoneselect.click();
//	     Thread.sleep(5000);
//	     JavascriptExecutor up3 = (JavascriptExecutor) driver;
//		 up3.executeScript("window.scrollBy(0, -2000)");
//		 Thread.sleep(5000);
//	     JavascriptExecutor dw4 = (JavascriptExecutor) driver;
//		 dw4.executeScript("window.scrollBy(0, 2000)");
//		 Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(3000);
//	     HelpdeskElements.Filtermilstone.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//         HelpdeskElements.Milestoneclr.click();
//         Thread.sleep(5000);
////		 
////         
//		// Sub Milestone Changed Date
//
////         
//         HelpdeskElements.Submilstartdate.click();
//         Thread.sleep(5000);
//         HelpdeskElements.Submilstartdateselect.click();
//         Thread.sleep(5000);
//         HelpdeskElements.dateclr.click();
//         Thread.sleep(7000);
//         HelpdeskElements.Submilenddate.click();
//         Thread.sleep(5000);
//         HelpdeskElements.Submilenddateselect.click();
//         Thread.sleep(5000);
//         HelpdeskElements.Submildatesubmit.click();
//         Thread.sleep(5000);
//         HelpdeskElements.Submilstartdate.clear();
//         Thread.sleep(5000);
//         HelpdeskElements.dateclr.click();
//         Thread.sleep(4000);
//         HelpdeskElements.Submilenddate.clear();
//         Thread.sleep(5000);
//         
		// Round Robin
//         
//         HelpdeskElements.FilterRRexistingcust.click();
//         Thread.sleep(6000);
//         HelpdeskElements.FilterRRstdassign.click();
//         Thread.sleep(6000);
//         HelpdeskElements.FilterRRexistingcust.click();
//         Thread.sleep(4000);
//         HelpdeskElements.FilterRRstdassign.click();
//         Thread.sleep(5000);
////         
//
//		// Form Type
//
////         
//         HelpdeskElements.Filterformtype.click();
//         Thread.sleep(4000);
//         HelpdeskElements.Filterformtypeselect.click();
//         Thread.sleep(3000);
//	     JavascriptExecutor up4 = (JavascriptExecutor) driver;
//		 up4.executeScript("window.scrollBy(0, -2200)");
//		 Thread.sleep(5000);
//	     JavascriptExecutor dw5 = (JavascriptExecutor) driver;
//		 dw5.executeScript("window.scrollBy(0, 2200)");
//		 Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//	     robot.keyPress(KeyEvent.VK_ESCAPE);
//	     robot.keyRelease(KeyEvent.VK_ESCAPE); 
//	     Thread.sleep(5000);
//
////Archived tickets skip
//
//		// State
//
//	     HelpdeskElements.Filterstate.sendKeys("Andhra pradesh");
//	     Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(7000);
//	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
//	     robot.keyRelease(KeyEvent.VK_BACK_SPACE);    
//	     Thread.sleep(5000);
//
////Sorting drop downs skip
//
//		// Ticket search
//		
//		
//		//search via ticket id
//
	     HelpdeskElements.Searchticketid.sendKeys("2149967");
	     Thread.sleep(5000);
	     HelpdeskElements.Searchsubmit.click();
	     Thread.sleep(5000);
//	     
//	     //search via service
//		 JavascriptExecutor dw27 = (JavascriptExecutor) driver;
//		 dw27.executeScript("window.scrollBy(0, 1500)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.Filterservice.sendKeys("Private Limited Company Registration");
//	     Thread.sleep(5000);
//		 robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     Thread.sleep(5000);
//		 JavascriptExecutor dw28 = (JavascriptExecutor) driver;
//		 dw28.executeScript("window.scrollBy(0, -1500)");
//		 Thread.sleep(5000);
//
//	     
//	     HelpdeskElements.Searchticketid.clear();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubemail.sendKeys("kavi_21@gmail.com");
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubemail.clear();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubemail.sendKeys("Trademark Registration");
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubemail.clear();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//
//	
//
//		// Pagination
//
//	     HelpdeskElements.Paginationnum.click();
//	     Thread.sleep(8000);
//	     HelpdeskElements.Paginationnext.click();
//	     Thread.sleep(8000);
//	     HelpdeskElements.Paginationlast.click();
//	     Thread.sleep(8000);
//	     HelpdeskElements.Paginationprev.click();
//	     Thread.sleep(8000);
//	     HelpdeskElements.Paginationfirst.click();
//	     Thread.sleep(8000);
//
//		// New ticket creation
//
//	     HelpdeskElements.Helpdeskdropdown.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Newticket.click();
//	     Thread.sleep(7000);
//	     HelpdeskElements.Ticketorsearch.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_A);
//	     robot.keyRelease(KeyEvent.VK_A); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_J);
//	     robot.keyRelease(KeyEvent.VK_J);
//	     robot.keyPress(KeyEvent.VK_1);
//	     robot.keyRelease(KeyEvent.VK_1);
//	     Thread.sleep(5000);
//	     HelpdeskElements.Ticketorselect.click();
//	     Thread.sleep(6000);
//	     HelpdeskElements.Choosecity.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Cityselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Chooseservice.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.Serviceselect.click();
//	     Thread.sleep(5000);
//	     JavascriptExecutor dw6 = (JavascriptExecutor) driver;
//		 dw6.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);	     
//	     HelpdeskElements.Description.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//	     HelpdeskElements.CreateSubmit.click();
//	     Thread.sleep(7000);
//	     
//	     System.out.println("We are currently on the following URL: " + driver.getCurrentUrl());
//	     
//	     String ticketid = driver.getCurrentUrl().substring(44, 51);
//	    		 
//	     HelpdeskElements.Home.click();

		// Ticket selection/Actions

		String clicklnk = Keys.chord(Keys.CONTROL, Keys.ENTER);
		HelpdeskElements.Ticketclick.sendKeys(clicklnk);
		Thread.sleep(6000);
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
		Thread.sleep(6000);
	
		
		String ticketid = driver.findElement(By.xpath("//div[@class='marginZero']")).getText().substring(1, 8);
		
		String Servicename = driver.findElement(By.xpath("//div[@class='marginZero']")).getText().substring(28, 61);
		
    System.out.println("Parent ticket:" + ticketid);
System.out.println("Service name:"+ Servicename );
System.out.println("Current date:"+ currentDate);


		// Critical notes W/Attachment
//Thread.sleep(6000);
//	     HelpdeskElements.Criticalnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.NewCN.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.CNTexteditor.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//	     HelpdeskElements.CNattachment.sendKeys("C:\\Users\\Vakilsearch\\Documents\\Automation testing docs\\Adhaar front.png");
//	     Thread.sleep(5000);
//	     JavascriptExecutor dw7 = (JavascriptExecutor) driver;
//		 dw7.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.CNsave.click();
//
//		// Critical notes W/O Attachment
//
//	     HelpdeskElements.Criticalnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.NewCN.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.CNTexteditor.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//	     HelpdeskElements.CNsave.click();	   
//
//		// Critical note W/CC
//
//	     HelpdeskElements.Criticalnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.NewCN.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.CNTexteditor.click();
//	     Thread.sleep(3000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//	     HelpdeskElements.CNEmployees.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.CNEmployeeselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.CNsave.click();

		// Internal note W/O Attachment

//	     JavascriptExecutor dw9 = (JavascriptExecutor) driver;
//		 dw9.executeScript("window.scrollBy(0, 1200)");
//		 Thread.sleep(6000);
//	     HelpdeskElements.In_ANnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANtexteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//		 JavascriptExecutor dw11 = (JavascriptExecutor) driver;
//		 dw11.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.IN_ANsend.click();
//		 Thread.sleep(7000);
//
//		// Internal note W/ Attachment
//
//		 JavascriptExecutor dw12 = (JavascriptExecutor) driver;
//		 dw12.executeScript("window.scrollBy(0, 1200)");
//		 Thread.sleep(6000);
//	     HelpdeskElements.In_ANnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANtexteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//		 Thread.sleep(5000);
//		 JavascriptExecutor dw13 = (JavascriptExecutor) driver;
//		 dw13.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.IN_ANattachment.sendKeys("C:\\\\Users\\\\Vakilsearch\\\\Documents\\\\Automation testing docs\\\\Adhaar front.png");
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANsend.click();
//	     Thread.sleep(5000);
//
//		// Add note W/O Attachment
//
//	     JavascriptExecutor dw14 = (JavascriptExecutor) driver;
//		 dw14.executeScript("window.scrollBy(0, 1200)");
//		 Thread.sleep(6000);
//	     HelpdeskElements.In_ANnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployees.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployeeselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANtexteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//		 JavascriptExecutor dw15 = (JavascriptExecutor) driver;
//		 dw15.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.IN_ANsend.click();
//	     Thread.sleep(5000);
//
//		// Add note W/Attachment
//
//	     JavascriptExecutor dw16 = (JavascriptExecutor) driver;
//		 dw16.executeScript("window.scrollBy(0, 1200)");
//		 Thread.sleep(6000);
//	     HelpdeskElements.In_ANnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployees.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployeeselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANtexteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//		 JavascriptExecutor dw17 = (JavascriptExecutor) driver;
//		 dw17.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.IN_ANattachment.sendKeys("C:\\\\Users\\\\Vakilsearch\\\\Documents\\\\Automation testing docs\\\\Adhaar front.png");
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANsend.click();
//	     Thread.sleep(5000);

		// Add note W/CC

//	     JavascriptExecutor dw18 = (JavascriptExecutor) driver;
//		 dw18.executeScript("window.scrollBy(0, 1200)");
//		 Thread.sleep(6000);
//	     HelpdeskElements.In_ANnotes.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployees.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.ANemployeeselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.AN_CC.click();
//	     Thread.sleep(5000);	
//	     HelpdeskElements.AN_CCemployee.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.AN_CCemployeeselect.click();
//	     Thread.sleep(5000);
//	     HelpdeskElements.IN_ANtexteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(6000);
//		 JavascriptExecutor dw19 = (JavascriptExecutor) driver;
//		 dw19.executeScript("window.scrollBy(0, 300)");
//		 Thread.sleep(5000);
//	     HelpdeskElements.IN_ANsend.click();
//	     Thread.sleep(5000);

		// Email in Take Action W/O Attachment

//		JavascriptExecutor dw20 = (JavascriptExecutor) driver;
//		dw20.executeScript("window.scrollBy(0, 800)");
//		Thread.sleep(5000);
//		HelpdeskElements.Takeaction.click();
//		Thread.sleep(5000);
//		JavascriptExecutor dw21 = (JavascriptExecutor) driver;
//		dw21.executeScript("window.scrollBy(0, 500)");
//		 Thread.sleep(5000);
//		 HelpdeskElements.TA_texteditor.click();
//	     Thread.sleep(5000);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T); 
//	     robot.keyPress(KeyEvent.VK_E);
//	     robot.keyRelease(KeyEvent.VK_E);
//	     robot.keyPress(KeyEvent.VK_S);
//	     robot.keyRelease(KeyEvent.VK_S);
//	     robot.keyPress(KeyEvent.VK_T);
//	     robot.keyRelease(KeyEvent.VK_T);
//	     Thread.sleep(5000);
//	     HelpdeskElements.event_subject.sendKeys("Test");
//		 Thread.sleep(5000);
//		 HelpdeskElements.event_fromdate.click();
//		 Thread.sleep(5000);
//		 HelpdeskElements.event_dateselect.click();
//		 Thread.sleep(5000);
//	     HelpdeskElements.event_description.sendKeys("This is a test");
//	     Thread.sleep(3000);
//	     HelpdeskElements.Mailsend.click();
//	     Thread.sleep(5000);
	     
	     //EmailCanned
//	        JavascriptExecutor dw22 = (JavascriptExecutor) driver;
//			dw22.executeScript("window.scrollBy(0, -300)");
//	        Thread.sleep(5000);
//			HelpdeskElements.Takeaction.click();
//			Thread.sleep(5000);
//			JavascriptExecutor dw24 = (JavascriptExecutor) driver;
//			dw24.executeScript("window.scrollBy(0, 300)");
//			Thread.sleep(5000);
//			HelpdeskElements.TA_texteditor.click();
//		    Thread.sleep(5000);
//			robot.keyPress(KeyEvent.VK_SPACE);
//		     robot.keyRelease(KeyEvent.VK_SPACE); 
//		     Thread.sleep(3000);
//		    HelpdeskElements.TA_Cannedresp.click();
//		    Thread.sleep(6000);
//		    HelpdeskElements.Cannedresp_search.sendKeys("Closure of LLP");
//		    Thread.sleep(6000);
//		    HelpdeskElements.Cannedresp_select.click();
//		    Thread.sleep(6000);
//		    HelpdeskElements.Email_attachment.sendKeys("C:\\Users\\Vakilsearch\\Documents\\Automation testing docs\\Adhaar front.png");
//		     Thread.sleep(6000); 
//		    HelpdeskElements.Mailsend.click();
//		    Thread.sleep(5000);
		  
	     
//	     
//	     //Event uncheck
//	     
//	     JavascriptExecutor up21 = (JavascriptExecutor) driver;
//		 up21.executeScript("window.scrollBy(0, -200)");
//		 Thread.sleep(3000);
//		 HelpdeskElements.eventuncheck.click();
//		 
		
		
		
		//Quotation creation
//		
//		 JavascriptExecutor dw222 = (JavascriptExecutor) driver;
//			dw222.executeScript("window.scrollBy(0, 1200)");
//			Thread.sleep(2000);
//			String clicklnk2 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			HelpdeskElements.Createquotation.sendKeys(clicklnk2);
//			Thread.sleep(6000);
//			Set<String> windows1 = driver.getWindowHandles();
//			for (String window1 : windows1) {
//				driver.switchTo().window(window1);
//			}
//			HelpdeskElements.Quotation_name.sendKeys("Aejaaz");
//			Thread.sleep(5000);
//			HelpdeskElements.Quotation_address.sendKeys("21 jump street, chennai - 74");
//			Thread.sleep(5000);
//			HelpdeskElements.Quotation_pincode.sendKeys("600074");
//			Thread.sleep(5000);
//			Thread.sleep(5000);
//			HelpdeskElements.Quotation_gstin.clear();
//			Thread.sleep(3000);
//			HelpdeskElements.Quotation_gstin.sendKeys("10AABCU9603R1Z2");
//			Thread.sleep(5000);
//			HelpdeskElements.Addr_verify.click();
//			Thread.sleep(5000);
//			WebElement Quotestrtdate = driver.findElement(By.xpath("//input[@name='calculator[" + ticketid + "][start_date]']"));
//			Quotestrtdate.click();
//			Thread.sleep(6000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(5000);
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			Thread.sleep(5000);
//			HelpdeskElements.Year_next.click();
//			Thread.sleep(5000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(5000);
//			HelpdeskElements.Quoteconfirm.click();
//			Thread.sleep(5000);
//			JavascriptExecutor dw225 = (JavascriptExecutor) driver;
//			dw225.executeScript("window.scrollBy(0, 500)");
//			HelpdeskElements.QuotesendQE.click();
//			Thread.sleep(3000);
//			HelpdeskElements.Quotedeactive_NO.click();
//			Thread.sleep(6000);
//			driver.close();
//			List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(switchtab.get(1));
//			Thread.sleep(5000);
//			driver.navigate().refresh();
//			Thread.sleep(5000);
//			JavascriptExecutor dw213 = (JavascriptExecutor) driver;
//			dw213.executeScript("window.scrollBy(0, -2000)");
			Thread.sleep(5000);
			By elementLocator = By.id("load_quotation");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
			WebElement element = driver.findElement(elementLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000);
			

//	    
	    
	    //Paynow Quotation
//		JavascriptExecutor dw23 = (JavascriptExecutor) driver;
//		dw23.executeScript("window.scrollBy(0, 1200)");
//	    Thread.sleep(3000);
//		String clicklnk3 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//		HelpdeskElements.QuotePaynow.sendKeys(clicklnk3);
//		Thread.sleep(6000);
//		Set<String> windows2 = driver.getWindowHandles();
//		for (String window2 : windows2) {
//			driver.switchTo().window(window2);
//		}
//	    
//		Thread.sleep(6000);
//		driver.close();
		
		//Invoice check
		
//		JavascriptExecutor dw24 = (JavascriptExecutor) driver;
//		dw24.executeScript("window.scrollBy(0, 2700)");
//	    Thread.sleep(3000);
//
//        WebElement Invoicethread = driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[2]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Invoicethread);
//        Thread.sleep(3000);
////
////
//	    String invoiceno = driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[2]")).getText().substring(8, 14);
//	    System.out.println(invoiceno);
//	    Thread.sleep(6000);
////	    
////	    
////
//	    Invoicethread.click();
////		
//		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
//		JavascriptExecutor up5 = (JavascriptExecutor) driver;
//		up5.executeScript("window.scrollBy(0, -1100)");
//		Thread.sleep(5000);
//		HelpdeskElements.Quotationload.click();
//		Thread.sleep(5000);
//		   
//	    WebElement Invoiceopen = driver.findElement(By.xpath("//a[@title='Invoice-"+invoiceno+".pdf']"));
//    	Invoiceopen.click();
//    	Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    Thread.sleep(5000);
//	    
		
		
//	    Quotation generate
		

		HelpdeskElements.Quotationload.click();
		Thread.sleep(5000);
		HelpdeskElements.Quotegenerate.click();
		Thread.sleep(6000);
//		 List<String> all29 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(all29.get(0));
//		Thread.sleep(3000);
//		driver.switchTo().window(all29.get(2));
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
//	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//	    Thread.sleep(5000);
//	    Actions action = new Actions(driver);
//	   
//	  WebElement findElement1 = driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[1]/child::a"));
//	
//	  JavascriptExecutor j1 = (JavascriptExecutor) driver;
//	  j1.executeScript("arguments[0].click();", findElement1);
//
//		Thread.sleep(5000);
//		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_W);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//		
//	    Thread.sleep(5000);

//-----------------------------------------------------------------------------------------------------------------------------


//Thread.sleep(3000);
//HelpdeskElements.Quotationload.click();
//Thread.sleep(5000);
//HelpdeskElements.Quotegenerate.click();    
//Thread.sleep(5000);
//List<String> switchtab = new ArrayList<String>(driver.getWindowHandles());
//System.out.println(switchtab.size());
//driver.switchTo().window(switchtab.get(2));
//driver.close();
//Thread.sleep(5000);
//driver.switchTo().window(switchtab.get(1));
//driver.navigate().refresh();
//Thread.sleep(5000);
//JavascriptExecutor dw = (JavascriptExecutor) driver;
//dw.executeScript("window.scrollBy(0, 2000)");
//Thread.sleep(5000);
////Actions action = new Actions(driver);
//
////WebElement findElement1 = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-paperclip']/a"));
//
////JavascriptExecutor j1 = (JavascriptExecutor) driver;
////j1.executeScript("arguments[0].click();", findElement1);
//
//driver.findElement(By.xpath("((//td[@align='center'])[3]//a//img)[3]")).click();
//Thread.sleep(5000);
//driver.close();
//Thread.sleep(5000);
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_TAB);
//Thread.sleep(5000);
//driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-paperclip']/a")).click();
//Thread.sleep(5000);
//List<String> switchtab1 = new ArrayList<String>(driver.getWindowHandles());
//driver.switchTo().window(switchtab1.get(2));
//ExtentTest test6 = extent.createTest("Quotation generate");
//test6.log(Status.PASS, "Quotation generated Successfully",
//        MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
//Thread.sleep(5000);
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_W);
//robot.keyRelease(KeyEvent.VK_W);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//Thread.sleep(3000);
//List<String> switchtab2 = new ArrayList<String>(driver.getWindowHandles());
//driver.switchTo().window(switchtab2.get(1));
//Thread.sleep(3000);


//----------------------------------------------------------------------------------------------------------------------------------------------

//HelpdeskElements.Quotationload.click();
//Thread.sleep(5000);
//HelpdeskElements.Quotegenerate.click();
//Thread.sleep(6000);
// List<String> all29 = new ArrayList<String>(driver.getWindowHandles());
//driver.switchTo().window(all29.get(0));
//Thread.sleep(3000);
//driver.switchTo().window(all29.get(2));
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//Thread.sleep(5000);
//Actions action = new Actions(driver);
//
//WebElement findElement1 = driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[1]/child::a"));
//
//JavascriptExecutor j1 = (JavascriptExecutor) driver;
//j1.executeScript("arguments[0].click();", findElement1);
//Thread.sleep(7000);
//ExtentTest test6 = extent.createTest("Quotation generate");
//test6.log(Status.PASS, "Quotation generated Successfully",
//    MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
//Thread.sleep(5000);
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_W);
//robot.keyRelease(KeyEvent.VK_W);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//
//Thread.sleep(5000);

















	    
	    
	    //Deactivate Quote
	    
//		JavascriptExecutor dw25 = (JavascriptExecutor) driver;
//		dw25.executeScript("window.scrollBy(0, -800)");
//		HelpdeskElements.Quotationload.click();
//		Thread.sleep(5000);
//		HelpdeskElements.Quotedeactivate.click();
//		Thread.sleep(5000);


		//Cross sale

//        HelpdeskElements.Crosssale.click();
//        Thread.sleep(5000);
//        HelpdeskElements.Cross_salesearch.sendKeys("Start a Partnership Firm");
//        Thread.sleep(3000);
//        HelpdeskElements.Cross_saleselect.click();
//        Thread.sleep(5000);
//        HelpdeskElements.Cross_salecreate.click();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        HelpdeskElements.Recenttickets.click();
//        Thread.sleep(5000);
//        Actions action2 = new Actions(driver);
// 	     WebElement findElement2 = driver.findElement(By.xpath("(//ul[@class='nav tcktdetails'])[1]/child::li/child::u/child::a"));
// 	     JavascriptExecutor j2 = (JavascriptExecutor) driver;
// 	     j2.executeScript("arguments[0].click();", findElement2); 
// 		 Thread.sleep(5000);
// 		 
//         String ticketid2 = driver.findElement(By.xpath("//div[@class='marginZero']")).getText().substring(1, 8);
//         System.out.println("Child ticket:"+ ticketid2);
//         
// 		driver. navigate(). back();
// 		Thread.sleep(5000);
// 		driver.navigate().refresh();
 		
 		//Merge ticket
 		
// 		HelpdeskElements.Merge_ticket.click();
// 		Thread.sleep(6000);
// 		HelpdeskElements.Merge_search_ticket.sendKeys(ticketid2);
// 		Thread.sleep(6000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    Thread.sleep(6000);
//		WebElement Primaryticket = driver.findElement(By.xpath("//input[@id='_"+ticketid+"']"));		
//		Primaryticket.click();
//	    HelpdeskElements.Merge_save.click();
//	    Thread.sleep(7000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    Thread.sleep(6000);
	    
	  //Unmerge ticket
	    
//	    List<String> all30 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(all30.get(0));
//		Thread.sleep(6000);
//		HelpdeskElements.Searchticketid.clear();
//		Thread.sleep(5000);
//	     HelpdeskElements.Searchticketid.sendKeys(ticketid2);
//	     Thread.sleep(5000);
//	     HelpdeskElements.Searchsubmit.click();
//	     Thread.sleep(5000);
//	     String clicklnk4 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			HelpdeskElements.Merge_ticketclick.sendKeys(clicklnk4);
//			Thread.sleep(6000);
//			Set<String> windows5 = driver.getWindowHandles();
//			for (String window5 : windows5) {
//				driver.switchTo().window(window5);
//			}
//			Thread.sleep(6000);
//			HelpdeskElements.Unmerge.click();
//			Thread.sleep(5000);
//			List<String> all31 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(all31.get(1));
	    
        //Ticket Edit
			
//				HelpdeskElements.Ticket_edit.click();
//				Thread.sleep(5000);
//				
//				//--Requester - Issue in QE
//				HelpdeskElements.Requester.click();
//				Thread.sleep(6);
//				HelpdeskElements.Requestersearch.sendKeys("aej@yopmail.com");
//				Thread.sleep(5000);
//				HelpdeskElements.Requestervalue.click();
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//			    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//			    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//			    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
//				Thread.sleep(5000);
//				HelpdeskElements.Edit_Update.click();
//				Thread.sleep(6000);
//				HelpdeskElements.Yesupdate.click();
////				HelpdeskElements.Noupdate.click();
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(5000);
//				
//				
//				
//				HelpdeskElements.Ticket_edit.click();
//				Thread.sleep(5000);
//				
//				//--Ticket priority
//				HelpdeskElements.Ticketpriority.click();
//				Thread.sleep(5000);
//				HelpdeskElements.Priorityselect.click();
//				Thread.sleep(5000);
//////				//--Ticket status
//				HelpdeskElements.Ticketstatus.click();
//				Thread.sleep(5000);
//				HelpdeskElements.Editsearch.sendKeys("Test tickets");
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//
////			    //--Payment status
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("Part payment made");
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
////			    
////			    
//////			    //--Am source
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
////
////			    
//////			   
//////			    //--Assigned to
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("Dhrubo BD");
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //--City
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("Hyderabad");
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //--Service
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys(Servicename);
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //-- Milestone
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("DSC");
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //--BAT agent
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("Sharanya BD");
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////				//--Ticket professional
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //--Lead quality
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("Ready to sign up");
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //Expert
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //Form type
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    HelpdeskElements.Editsearch.sendKeys("INC-32");
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//////			    //--Relationship manager
//////
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
////			    
//			    Thread.sleep(5000);
//				HelpdeskElements.Edit_Update.click();
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(5000);

                 //Copying Links


				// --- Magic key

//                HelpdeskElements.Magickey.click();
//                Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				List<String> all32 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all32.get(2));
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_ESCAPE);
//			    robot.keyRelease(KeyEvent.VK_ESCAPE);
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(5000);
//				List<String> all33 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all33.get(1));
				
				//---Referral link
				
				
//				HelpdeskElements.Refferallink.click();
//                Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				List<String> all34 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all34.get(2));
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_ESCAPE);
//			    robot.keyRelease(KeyEvent.VK_ESCAPE);
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(5000);
//				List<String> all35 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all35.get(1));
//				
//				
//				//---Documnet upload link
//				
//				HelpdeskElements.Docuploadlink.click();
//                Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_T);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				List<String> all36 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all36.get(2));
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_ESCAPE);
//			    robot.keyRelease(KeyEvent.VK_ESCAPE);
//				Thread.sleep(4000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(4000);
//			    robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_W);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(5000);
//				List<String> all37 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all37.get(1)); 


              //Manage email-id



//               HelpdeskElements.Ticket_edit.click();
//               Thread.sleep(5000);
//             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//             Thread.sleep(6000);
//             HelpdeskElements.Manage_email.click();
//             Thread.sleep(5000);
//             
             //---master email
//				robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//	             Thread.sleep(5000);
//	    	     robot.keyPress(KeyEvent.VK_A);
//	    	     robot.keyRelease(KeyEvent.VK_A); 
//	    	     robot.keyPress(KeyEvent.VK_J);
//	    	     robot.keyRelease(KeyEvent.VK_J);
//				 robot.keyPress(KeyEvent.VK_SHIFT);
//				 robot.keyPress(KeyEvent.VK_2);
//				 robot.keyRelease(KeyEvent.VK_2);
//			     robot.keyRelease(KeyEvent.VK_SHIFT);
//	    	     robot.keyPress(KeyEvent.VK_G);
//	    	     robot.keyRelease(KeyEvent.VK_G);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	    	     robot.keyPress(KeyEvent.VK_A);
//	    	     robot.keyRelease(KeyEvent.VK_A);
//	    	     robot.keyPress(KeyEvent.VK_I);
//	    	     robot.keyRelease(KeyEvent.VK_I);
//	    	     robot.keyPress(KeyEvent.VK_L);
//	    	     robot.keyRelease(KeyEvent.VK_L);
//	    	     robot.keyPress(KeyEvent.VK_DECIMAL);
//	    	     robot.keyRelease(KeyEvent.VK_DECIMAL);
//	    	     robot.keyPress(KeyEvent.VK_C);
//	    	     robot.keyRelease(KeyEvent.VK_C);
//	    	     robot.keyPress(KeyEvent.VK_O);
//	    	     robot.keyRelease(KeyEvent.VK_O);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	             Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
			    
//			    //--Master cc
//			    
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//	             Thread.sleep(5000);
//	             robot.keyPress(KeyEvent.VK_B);
//	    	     robot.keyRelease(KeyEvent.VK_B); 
//	    	     robot.keyPress(KeyEvent.VK_J);
//	    	     robot.keyRelease(KeyEvent.VK_J);
//				 robot.keyPress(KeyEvent.VK_SHIFT);
//				 robot.keyPress(KeyEvent.VK_2);
//				 robot.keyRelease(KeyEvent.VK_2);
//			     robot.keyRelease(KeyEvent.VK_SHIFT);
//	    	     robot.keyPress(KeyEvent.VK_G);
//	    	     robot.keyRelease(KeyEvent.VK_G);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	    	     robot.keyPress(KeyEvent.VK_A);
//	    	     robot.keyRelease(KeyEvent.VK_A);
//	    	     robot.keyPress(KeyEvent.VK_I);
//	    	     robot.keyRelease(KeyEvent.VK_I);
//	    	     robot.keyPress(KeyEvent.VK_L);
//	    	     robot.keyRelease(KeyEvent.VK_L);
//	    	     robot.keyPress(KeyEvent.VK_DECIMAL);
//	    	     robot.keyRelease(KeyEvent.VK_DECIMAL);
//	    	     robot.keyPress(KeyEvent.VK_C);
//	    	     robot.keyRelease(KeyEvent.VK_C);
//	    	     robot.keyPress(KeyEvent.VK_O);
//	    	     robot.keyRelease(KeyEvent.VK_O);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	             Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
			    
//			    //--Master bcc
//			    robot.keyPress(KeyEvent.VK_TAB);
//			    robot.keyRelease(KeyEvent.VK_TAB);
//	             Thread.sleep(5000);
//	             robot.keyPress(KeyEvent.VK_C);
//	    	     robot.keyRelease(KeyEvent.VK_J); 
//	    	     robot.keyPress(KeyEvent.VK_J);
//	    	     robot.keyRelease(KeyEvent.VK_J);
//				 robot.keyPress(KeyEvent.VK_SHIFT);
//				 robot.keyPress(KeyEvent.VK_2);
//				 robot.keyRelease(KeyEvent.VK_2);
//			     robot.keyRelease(KeyEvent.VK_SHIFT);
//	    	     robot.keyPress(KeyEvent.VK_G);
//	    	     robot.keyRelease(KeyEvent.VK_G);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	    	     robot.keyPress(KeyEvent.VK_A);
//	    	     robot.keyRelease(KeyEvent.VK_A);
//	    	     robot.keyPress(KeyEvent.VK_I);
//	    	     robot.keyRelease(KeyEvent.VK_I);
//	    	     robot.keyPress(KeyEvent.VK_L);
//	    	     robot.keyRelease(KeyEvent.VK_L);
//	    	     robot.keyPress(KeyEvent.VK_DECIMAL);
//	    	     robot.keyRelease(KeyEvent.VK_DECIMAL);
//	    	     robot.keyPress(KeyEvent.VK_C);
//	    	     robot.keyRelease(KeyEvent.VK_C);
//	    	     robot.keyPress(KeyEvent.VK_O);
//	    	     robot.keyRelease(KeyEvent.VK_O);
//	    	     robot.keyPress(KeyEvent.VK_M);
//	    	     robot.keyRelease(KeyEvent.VK_M);
//	             Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(5000);
//				HelpdeskElements.Edit_Update.click();
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
			    
			    //Updated values in send email section
			    
//				JavascriptExecutor dw21 = (JavascriptExecutor) driver;
//				dw21.executeScript("window.scrollBy(0, 800)");
//				Thread.sleep(5000);
//				HelpdeskElements.Takeaction.click();
//				Thread.sleep(5000);
//	             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//	             Thread.sleep(5000);
//			     HelpdeskElements.TA_cc.click();
//			     Thread.sleep(6000);
//			     HelpdeskElements.TA_bcc.click();
//			     Thread.sleep(6000);
//			     JavascriptExecutor dw41 = (JavascriptExecutor) driver;
//				dw41.executeScript("window.scrollBy(0, -1000)");
//				Thread.sleep(5000);
			     //driver.navigate().refresh();
			     
			     
			    
			    
			    // Milestones and submilstone
               
//                Thread.sleep(5000);
//			    HelpdeskElements.Atmtocont_MS.click();
//			    Thread.sleep(5000);
//				JavascriptExecutor dw26 = (JavascriptExecutor) driver;
//				dw26.executeScript("window.scrollBy(0, 450)");
//				Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Atmtocont_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Contacted_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Contacted_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Quotesent_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Quotesent_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Closed_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Closed_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Doctodispatch_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Doctodispatch_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Firstcall_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Firstcall_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.IntDoc_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.IntDoc_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.DSC_VA_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.DSC_VA_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    
//			    HelpdeskElements.Res_uni_name_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Res_uni_name_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    
//			    HelpdeskElements.Final_set_doc_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Final_set_doc_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Final_INC_MS.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Final_INC_Sub.click();
//			    Thread.sleep(5000);
//			    HelpdeskElements.Submilstone_update.click();
//			    Thread.sleep(5000);
//			    
//			    HelpdeskElements.Justin_MS.click();
//			    Thread.sleep(5000);
//			    
//				
//			    //Action items in the middle page
//
//                 //--Customer dashboard
//				JavascriptExecutor dw29 = (JavascriptExecutor) driver;
//				dw29.executeScript("window.scrollBy(0, 800)");
//				Thread.sleep(5000);
//				String clicklnk5 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//				HelpdeskElements.Customerdashabord.sendKeys(clicklnk5);
//				Thread.sleep(5000);
//				List<String> all38 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all38.get(2));
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_CONTROL);
//			    Thread.sleep(5000);
//			    
			    
			    //--GRC ---Issue
//				List<String> all36 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all36.get(1));
//				Thread.sleep(5000);
//			    String clicklnk5 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//				HelpdeskElements.GRC.sendKeys(clicklnk5);
//				Thread.sleep(5000);
//				List<String> all37 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all37.get(2));
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_CONTROL);
//			    Thread.sleep(5000);
			    
			    
//			   //--Docvault
//			    
//			    List<String> all39 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all39.get(1));
//				Thread.sleep(5000);
//			    String clicklnk6 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//				HelpdeskElements.DocVault.sendKeys(clicklnk6);
//				Thread.sleep(5000);
//				List<String> all40 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all40.get(2));
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_CONTROL);
//			    Thread.sleep(5000);
////			    
////			    //--VerifyDoc
////			    
//			    List<String> all41 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all41.get(1));
//				Thread.sleep(5000);
//			    String clicklnk7 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//				HelpdeskElements.VerifyDoc.sendKeys(clicklnk7);
//				Thread.sleep(5000);
//				List<String> all42 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all42.get(2));
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_CONTROL);
//			    Thread.sleep(5000);
////			    
////			    
////			    //---Upload_deliv_doc
////			    
//			    List<String> all43 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all43.get(1));
//				Thread.sleep(5000);
//			    String clicklnk8 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//				HelpdeskElements.Upload_deliv_doc.sendKeys(clicklnk8);
//				Thread.sleep(5000);
//				List<String> all44 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all44.get(2));
//				Thread.sleep(5000);
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_W);
//			    robot.keyRelease(KeyEvent.VK_CONTROL);
//			    Thread.sleep(5000);
////			    
////			    //-- Movetojustin
////			    
//			    List<String> all45 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all45.get(1));
//				Thread.sleep(5000);
//				HelpdeskElements.Movetojustin.click();
//				Thread.sleep(5000);
////				
////				//--View_gen_docs
////				
//				    List<String> all46 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all46.get(1));
//					Thread.sleep(5000);
//				    String clicklnk9 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//					HelpdeskElements.View_gen_docs.sendKeys(clicklnk9);
//					Thread.sleep(5000);
//					List<String> all47 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all47.get(2));
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_CONTROL);
//					robot.keyPress(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_CONTROL);
//				    Thread.sleep(5000);
////				    
////				    
////				    //--View_gen_sub__docs
////				    
//				    List<String> all48 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all48.get(1));
//					Thread.sleep(5000);
//				    String clicklnk10 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//					HelpdeskElements.View_gen_sub__docs.sendKeys(clicklnk10);
//					Thread.sleep(5000);
//					List<String> all49 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all49.get(2));
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_CONTROL);
//					robot.keyPress(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_CONTROL);
//				    Thread.sleep(5000);
////				    
////				    //--Annual_file_automation
////				    
//				    List<String> all50 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all50.get(1));
//					Thread.sleep(5000);
//				    String clicklnk11 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//					HelpdeskElements.Annual_file_automation.sendKeys(clicklnk11);
//					Thread.sleep(5000);
//					List<String> all51 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all51.get(2));
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_CONTROL);
//					robot.keyPress(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_CONTROL);
//				    Thread.sleep(5000);
////				    
////				    //--Customerprofile
////				
//				    List<String> all52 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all52.get(1));
//					Thread.sleep(5000);
//				    String clicklnk12 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//					HelpdeskElements.Customerprofile.sendKeys(clicklnk12);
//					Thread.sleep(5000);
//					List<String> all53 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all53.get(2));
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_CONTROL);
//					robot.keyPress(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_CONTROL);
//				    Thread.sleep(5000);
////				    
////				    //--DSC_lib_man
////				    
//				    List<String> all54 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all54.get(1));
//					Thread.sleep(5000);
//				    String clicklnk13 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//					HelpdeskElements.Customerprofile.sendKeys(clicklnk13);
//					Thread.sleep(5000);
//					List<String> all55 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all55.get(2));
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_CONTROL);
//					robot.keyPress(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_W);
//				    robot.keyRelease(KeyEvent.VK_CONTROL);
//				    Thread.sleep(5000);
//				    
//				    //--DSC_details
//				    
//				    List<String> all56 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all56.get(1));
//					Thread.sleep(5000);
//					HelpdeskElements.DSC_details.click();
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_ESCAPE);
//					robot.keyRelease(KeyEvent.VK_ESCAPE);
//					Thread.sleep(5000);
//					
//					
//					//--Entity_info
//					
//					List<String> all57 = new ArrayList<String>(driver.getWindowHandles());
//					driver.switchTo().window(all57.get(1));
//					Thread.sleep(5000);
//					HelpdeskElements.Entity_info.click();
//					Thread.sleep(5000);
//					robot.keyPress(KeyEvent.VK_ESCAPE);
//					robot.keyRelease(KeyEvent.VK_ESCAPE);
//					Thread.sleep(5000);
//					
//					//--Activitylog
//					
//					    List<String> all58 = new ArrayList<String>(driver.getWindowHandles());
//						driver.switchTo().window(all58.get(1));
//						Thread.sleep(5000);
//					    String clicklnk14 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//						HelpdeskElements.Activitylog.sendKeys(clicklnk14);
//						Thread.sleep(5000);
//						List<String> all59 = new ArrayList<String>(driver.getWindowHandles());
//						driver.switchTo().window(all59.get(2));
//						Thread.sleep(5000);
//						robot.keyPress(KeyEvent.VK_CONTROL);
//						robot.keyPress(KeyEvent.VK_W);
//					    robot.keyRelease(KeyEvent.VK_W);
//					    robot.keyRelease(KeyEvent.VK_CONTROL);
//					    Thread.sleep(5000);
//					    List<String> all60 = new ArrayList<String>(driver.getWindowHandles());
//						driver.switchTo().window(all60.get(1));
//			    
//			    
//			    
//			    //--Load more action
//				JavascriptExecutor dw30 = (JavascriptExecutor) driver;
//				dw30.executeScript("window.scrollBy(0, 2000)");
//				Thread.sleep(5000);
//			    HelpdeskElements.Loadmore.click();
//			    Thread.sleep(5000);
//			    JavascriptExecutor dw31 = (JavascriptExecutor) driver;
//				dw31.executeScript("window.scrollBy(0, 1000)");
			   
				
				//Add Expense
				
//				JavascriptExecutor dw32 = (JavascriptExecutor) driver;
//				dw32.executeScript("window.scrollBy(0, 1500)");
//				Thread.sleep(5000);
//				String clicklnk15 = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			    HelpdeskElements.Ticketexpense.sendKeys(clicklnk15);
//				Thread.sleep(5000);
//				List<String> all61 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all61.get(2));
//				Thread.sleep(5000);
				
				//Gov fee(add)
				
//				HelpdeskElements.Govfee.click();
//				Thread.sleep(3000);
//				HelpdeskElements.GFExpensestype.click();
//				Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Govfeeamount.sendKeys("2000");
//			    Thread.sleep(3000);
//			    HelpdeskElements.Govfeedate.click();
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_SPACE);
//			    robot.keyRelease(KeyEvent.VK_SPACE);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);	
//			    Thread.sleep(3000);
//			    HelpdeskElements.Govfeesubmit.click();
//			    Thread.sleep(3000);
			    
			    //affiliate fee(add)
			    
//			    HelpdeskElements.Affiliatefee.click();
//				Thread.sleep(3000);
//				HelpdeskElements.AFExpensestype.click();
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Afflfeeamount.sendKeys("1000");
//			    Thread.sleep(3000);
//			    HelpdeskElements.Afflfeedate.click();
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_SPACE);
//			    robot.keyRelease(KeyEvent.VK_SPACE);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);	
//			    Thread.sleep(3000);
//			    HelpdeskElements.Afflfeesubmit.click();
//			    Thread.sleep(3000);
//			    
//			    
//			    List<String> all62 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all62.get(1));
//				Thread.sleep(3000);
//				driver.navigate().refresh();
//				Thread.sleep(5000);
//				JavascriptExecutor dw34 = (JavascriptExecutor) driver;
//				dw34.executeScript("window.scrollBy(0, 1700)");
//				Thread.sleep(5000);
//				List<String> all63 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all63.get(2));
				
				 //Gov fee (Edit)
				
//				HelpdeskElements.Govfee_edit.click();
//				Thread.sleep(3000);
//				HelpdeskElements.Edit_GFExpensestype.click();
//				Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Govfeeamount.clear();
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Govfeeamount.sendKeys("3000");
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Govfeedate.click();
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_SPACE);
//			    robot.keyRelease(KeyEvent.VK_SPACE);
//			    robot.keyPress(KeyEvent.VK_RIGHT);
//			    robot.keyRelease(KeyEvent.VK_RIGHT);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Govfeeupdate.click();
//			    Thread.sleep(3000);
			    
			    //Aff fee (Edit)
			    
//			    HelpdeskElements.Affledit.click();
//				Thread.sleep(3000);
//				HelpdeskElements.Edit_AFExpensestype.click();
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyRelease(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Afflfeeamount.clear();
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Afflfeeamount.sendKeys("2000");
//			    Thread.sleep(3000);
//			    HelpdeskElements.Edit_Afflfeedate.click();
//			    Thread.sleep(3000);
//			    robot.keyPress(KeyEvent.VK_SPACE);
//			    robot.keyRelease(KeyEvent.VK_SPACE);
//			    robot.keyPress(KeyEvent.VK_RIGHT);
//			    robot.keyRelease(KeyEvent.VK_RIGHT);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    HelpdeskElements.Afflfeeupdate.click();
//			    Thread.sleep(3000);
				
			   // Govfee delete
			    
//			    HelpdeskElements.Govfeedelete.click();
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    HelpdeskElements.Affldelete.click();
//			    Thread.sleep(5000);
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    Thread.sleep(3000);
//			    driver.close();
//			    Thread.sleep(3000);
//			    List<String> all64 = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(all64.get(1));
//			    
			    
			    
			    
				
				
				
				
				
				
				
				
				
				
				
				
			   
			    
			    
			    
			    
			    
			    



                 

				
				
				






				
					
				

			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		

	
	}

	
