package Pagefactory;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.List;
import java.util.Map;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HelpdeskRun extends HelpdeskDetail {
	public Map<String, String> dataMap = new HashMap<String, String>();
	public ExtentReports extent;

	public WebDriver driver;
	String[][] data = null; 

	@DataProvider(name = "itemsdata")
	public String[][] loginDataProvider() throws IOException, BiffException {
		data = readExcel();	
		
		return data;
	}
	

	public String[][] readExcel() throws IOException, BiffException {
		FileInputStream excel = new FileInputStream(
				"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\HelpdeskCRM.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet1 = workbook.getSheet("Helpdeskread");
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		String testData[][] = new String[rowCount][colCount];
		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {
				testData[i][j] = sheet1.getCell(j, i).getContents();
			}
		}

		System.out.println(testData.toString());
		return testData;

	}

	@BeforeClass

	public void initiateDriver() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");

		String reportFilename = "HelpdeskCRMExtentreport " + currentDateTime.format(formatter);
		htmlReporter = new ExtentSparkReporter(
				"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\HelpdeskCRM_Output\\Reports\\"
						+ reportFilename + ".html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@Test(dataProvider = "itemsdata", priority = 1)

	public void Login(String url, String Email, String password, String Employee, String Pstatus, String Priority,
			String Service, String City, String Function, String Medium, String Language, String Milestone,
			String Submilstone, String Formtype, String State, String Search_TicketID, String Search_email,
			String Search_service, String GSTIN, String Profee, String Confee, String Govfee, String Requester,
			String Edit_status, String Edit_Pstatus, String Edit_assigneto, String Edit_city, String Edit_milestone,
			String Edit_BAT, String Edit_LeadQL, String Edit_formtype) throws InterruptedException, AWTException {

		dataMap.put("UrL", url);
		dataMap.put("Email", Email);
		dataMap.put("password", password);
		dataMap.put("employee1", Employee);
		dataMap.put("pstatus1", Pstatus);
		dataMap.put("priority", Priority);
		dataMap.put("service", Service);
		dataMap.put("city", City);
		dataMap.put("function", Function);
		dataMap.put("medium", Medium);
		dataMap.put("language", Language);
		dataMap.put("milestone", Milestone);
		dataMap.put("submilstone", Submilstone);
		dataMap.put("formtype", Formtype);
		dataMap.put("state", State);
		dataMap.put("search_TicketID", Search_TicketID);
		dataMap.put("search_email", Search_email);
		dataMap.put("search_service", Search_service);
		dataMap.put("gstin", GSTIN);
		dataMap.put("profee", Profee);
		dataMap.put("confee", Confee);
		dataMap.put("govfee", Govfee);
		dataMap.put("requester", Requester);
		dataMap.put("edit_status", Edit_status);
		dataMap.put("edit_Pstatus", Edit_Pstatus);
		dataMap.put("edit_assigneto", Edit_assigneto);
		dataMap.put("edit_city", Edit_city);
		dataMap.put("edit_milestone", Edit_milestone);
		dataMap.put("edit_BAT", Edit_BAT);
		dataMap.put("edit_LeadQL", Edit_LeadQL);
		dataMap.put("edit_formtype", Edit_formtype);

		PageFactory.initElements(driver, HelpdeskElements.class);
		driver.get(dataMap.get("UrL"));
		Thread.sleep(2000);
		Username.sendKeys(dataMap.get("Email"));
		Thread.sleep(1000);
		Password.sendKeys(dataMap.get("password"));
		Thread.sleep(1000);
		Signin.click();
		Thread.sleep(5000);
		Logoclick.click();
		Thread.sleep(6000);
		ExtentTest test = extent.createTest("Login");
		test.log(Status.PASS, "Logged in Successfull",
				MediaEntityBuilder.createScreenCaptureFromPath(Common_fucntion.takeAndSaveScreenshot(driver)).build());
		Thread.sleep(5000);

		HelpdeskDetail helpdesk = new HelpdeskDetail();
		
		helpdesk.EmployeeFilter(driver, dataMap, extent);
		helpdesk.Last_responded_by_Filter(driver, dataMap, extent);
		helpdesk.Dashboard_status_Filter(driver, dataMap, extent);
		helpdesk.Status_Filter(driver, dataMap, extent);
		helpdesk.Ticket_created_Filter(driver, dataMap, extent);
		helpdesk.Ticket_Assigned_Date_Filter(driver, dataMap, extent);
		helpdesk.Payment_Status_Filter(driver, dataMap, extent);
		helpdesk.Priority_Filter(driver, dataMap, extent);
		helpdesk.Dueby_Filter(driver, dataMap, extent);
		helpdesk.Service_Filter(driver, dataMap, extent);
		helpdesk.City_Filter(driver, dataMap, extent);
		helpdesk.Function_Filter(driver, dataMap, extent);
		helpdesk.Medium_Filter(driver, dataMap, extent);
		helpdesk.Language_filter(driver, dataMap, extent);
		helpdesk.Milestone_Submilestone_Filter(driver, dataMap, extent);
		helpdesk.Sub_Milestone_ChangedDate_Filter(driver, dataMap, extent);
		helpdesk.Round_robin_Filter(driver, dataMap, extent);
		helpdesk.Form_Type_Filter(driver, dataMap, extent);
		helpdesk.State_filter(driver, dataMap, extent);
		helpdesk.Ticket_search(driver, dataMap, extent);
		helpdesk.Pagination(driver, dataMap, extent);
		helpdesk.New_Ticket_Creation(driver, dataMap, extent);
	
		helpdesk.Ticket_navigation(driver, dataMap, extent);
		helpdesk.Critical_Note(driver, dataMap, extent);
		helpdesk.Critical_Note_ATT(driver, dataMap, extent);
		helpdesk.Critical_Note_CC(driver, dataMap, extent);
		helpdesk.Internal_note(driver, dataMap, extent);
		helpdesk.Internal_note_ATT(driver, dataMap, extent);
		helpdesk.Add_note(driver, dataMap, extent);
		helpdesk.Add_note_ATT(driver, dataMap, extent); 
		helpdesk.Add_note_CC(driver, dataMap, extent);
		helpdesk.Email(driver, extent); 
		helpdesk.Email_Canned_ATT(driver, extent); 
		helpdesk.Event_check(driver,  extent);
		helpdesk.Quotation_creation(driver, dataMap, extent);
		helpdesk.Quote_edit(driver, dataMap, extent);
		helpdesk.Paynow(driver, dataMap, extent);
		helpdesk.Quote_generate(driver, dataMap, extent);
		helpdesk.Quote_deactivate(driver, dataMap, extent);
		helpdesk.Crosssale(driver, dataMap, extent);
		helpdesk.Merge_unmerge(driver, dataMap, extent);
		helpdesk.Ticket_Requester_Edit(driver, dataMap, extent);
		helpdesk.Ticket_Edit(driver, dataMap, extent);
		helpdesk.Copy_magickey(driver, extent);
		helpdesk.Copy_Referrallink(driver, extent);
		helpdesk.Doc_uploadlink(driver, extent);
		helpdesk.Manage_email(driver, extent);
		helpdesk.Mile_submilestone(driver, extent);
		helpdesk.MiddlepageCTA(driver, extent);
		helpdesk.Loadmore(driver, extent);
		helpdesk.Addexpenses(driver, extent);
		helpdesk.Logout(driver, extent);
	}

	@AfterTest

	public void stopReport() throws AWTException, InterruptedException, IOException {
		extent.flush();
		System.out.println("Testing completed");
//		Robot robot = new Robot();
//		slack msg = new slack();
//		msg.slackMessageTest(driver);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
//		driver.quit();
	}

}
	
	