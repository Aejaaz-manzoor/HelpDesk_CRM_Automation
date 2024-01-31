package Pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;
import org.openqa.selenium.io.FileHandler;



public class HelpdeskElements{
	
	
	

//Login	
	@FindBy (xpath = "//input[@class='form-control floating-input email']")
	public static WebElement Username;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	public static WebElement Password;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/button[1]")
	public static WebElement Signin ;

	@FindBy (xpath = "//div[@class='col-sm-2']")
	public static WebElement Logoclick ;
	
	
//Filters	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[2]/span/span[1]/span")
	public static WebElement Filteremployee ;
	
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[2]/span/span[1]/span/ul/li[1]/span")
	public static WebElement empdropdownclose;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[1]")
	public static WebElement Filterempclear ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[4]/form/span/span[1]/span")
	public static WebElement Filterrequester ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[5]/form/span/input[1]")
	public static WebElement Filtercr ;   
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[5]/form/span/input[2]")
	public static WebElement Filterar ;   
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[6]/form/span/input[1]")
	public static WebElement Filternamecheck ; 
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[6]/form/span/input[2]")
	public static WebElement Filterdoccollect ; 
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[6]/form/span/input[3]")
	public static WebElement Filtertmcheck ; 
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[7]/form/span/span[1]/span/ul")
	public static WebElement Filterstatus ; 
	
	@FindBy (xpath = "//span[@class='select2-selection__choice__remove']")
	public static WebElement Filterstatusclear ;
		
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[8]/form/div/div/span/span[1]/span")
	public static WebElement Filtercreatedon ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[8]/form/input[7]")
	public static WebElement Filtercreatedonselect ;
	
	@FindBy (xpath = "//*[@id=\"ticket_assigned_date_timepicker_start\"]")
	public static WebElement Filterstdate ;
	
	@FindBy (xpath = "/html/body/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[1]/div")
	public static WebElement strtdateselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[9]/form/div[1]")
	public static WebElement Filterclr;
	
	@FindBy (xpath = "//*[@id=\"ticket_assigned_date_timepicker_end\"]")
	public static WebElement Filterendate ;
	
	@FindBy (xpath = "/html/body/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[5]/div")
	public static WebElement enddateselect ;
	
	@FindBy (xpath = "//*[@id=\"ticket_assigned_date_filter_button\"]")
	public static WebElement Filterdateselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[10]/form/span/span[1]/span/ul/li/input")
	public static WebElement Filterpaystatus ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[11]/form/span/span[1]/span/ul/li/input")
	public static WebElement Filterticpriority ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[12]/form/li[1]/input")
	public static WebElement Filterdueoverdue ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[12]/form/li[2]/input")
	public static WebElement Filterduetoday ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[12]/form/li[3]/input")
	public static WebElement Filterduetomm ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[12]/form/li[4]/input")
	public static WebElement Filterdue8hrs ;	
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[15]/div/span/span[1]/span/ul/li/input")
	public static WebElement Filterservice ;
	
	@FindBy (xpath = "/html/body/span/span/span/ul/li[18]")
	public static WebElement servicetm ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[16]/form/span/span[1]/span/ul/li/input")
	public static WebElement  Filtercity;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[17]/form/span/span[1]/span/ul/li/input")
	public static WebElement Filterfunction  ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[20]/form/span/span[1]/span/ul/li/input")
	public static WebElement Filtermedium ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[21]/form/span/span[1]/span")
	public static WebElement Filterlanguage ;
	
	@FindBy (xpath = "//input[@aria-controls='select2-ticket_language_filter-results']")
	public static WebElement Language_search ;
	
	@FindBy (xpath = "/html/body/span/span/span[2]/ul/li[1]")
	public static WebElement Langclr ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[22]/form[1]/span/span[1]/span")
	public static WebElement Filtermilstone ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[22]/form[2]/span/span[1]/span")
	public static WebElement  Filtersubmilstone;
	
	@FindBy (xpath = "//li[contains(text(),'Data & Document Collection')]")
	public static WebElement Milestoneselect  ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[22]/label")
	public static WebElement Milestoneclr ;
	
	@FindBy (xpath = "//li[contains(text(),'Awaiting Information & Documents')]")
	public static WebElement Submilestoneselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[23]/form/div[2]/input")
	public static WebElement Submilstartdate  ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[23]/form/div[4]/input")
	public static WebElement Submilenddate ;
	
	
	@FindBy (xpath = "/html/body/div[7]/div[1]/div[2]/table/tbody/tr[1]/td[1]/div")
	public static WebElement Submilstartdateselect ;
	
	@FindBy (xpath = "/html/body/div[8]/div[1]/div[2]/table/tbody/tr[3]/td[1]/div")
	public static WebElement Submilenddateselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[23]/form/input[2]")
	public static WebElement Submildatesubmit ;
	
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[23]/form/div[1]")
	public static WebElement  dateclr;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[24]/form/li[1]/input")
	public static WebElement FilterRRexistingcust ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[24]/form/li[2]/input")
	public static WebElement FilterRRstdassign;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[25]/form/span/span[1]/span")
	public static WebElement Filterformtype ;
	
	@FindBy (xpath = "//li[contains(text(),'INC-32')]")
	public static WebElement  Filterformtypeselect;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[27]/form/span/span[1]/span")
	public static WebElement Filterstate  ;
	
	@FindBy (xpath = "//select[@id='employee_status']")
	public static WebElement Activity_status ;	
	
	@FindBy (xpath = "//option[contains(text(),'Freeze')]")
	public static WebElement Freeze ;
	
	@FindBy (xpath = "//button[@id='continueButton2']")
	public static WebElement Start_working ;
	
	@FindBy (xpath = "//select[contains(text(),'Freeze')]")
	public static WebElement Active ;

	@FindBy (xpath = "//input[@placeholder='ticket id']")
	public static WebElement Searchticketid ;
	
	@FindBy (xpath = "//input[@value='Search']")
	public static WebElement Searchsubmit ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div/div/form/input[3]")
	public static WebElement Searchsubemail ;
	
	@FindBy (xpath = "(//a[contains(text(),'5')])[1]")
	public static WebElement Paginationnum ;
	
	@FindBy (xpath = "(//a[contains(text(),'Next')])[1]")
	public static WebElement Paginationnext ;	
	
	@FindBy (xpath = "(//a[contains(text(),'First')])[1]")
	public static WebElement  Paginationfirst;
	
	@FindBy (xpath = "(//a[contains(text(),'Last')])[1]")
	public static WebElement Paginationlast ;
	
	@FindBy (xpath = "(//a[contains(text(),'Prev')])[1]")
	public static WebElement Paginationprev ;
	
	@FindBy (xpath = "(//a[@class='ticket_index_tooltip ticket_link_title'])[1]")
	public static WebElement Ticketclick ;
	
	@FindBy (xpath = "//a[@class='ticket_index_tooltip ticket_link_title']")
	public static WebElement Ticketclick2 ;
	
	
	
	@FindBy (xpath = "(//a[contains(text(),'Helpdesk')])[1]")
	public static WebElement Helpdeskdropdown ;
	
	@FindBy (xpath = "(//a[contains(text(),'New Ticket')])[1]")
	public static WebElement Newticket ;
	
	@FindBy (xpath = "//li[contains(text(),'aej1@yopmail.com - 8778139401')]")
	public static WebElement Ticketorselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/span")
	public static WebElement Ticketorsearch ;
	
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[5]/div/div/span/span[1]/span")
	public static WebElement Choosecity ;
		
	@FindBy (xpath = "//li[contains(text(),'Chennai')]")
	public static WebElement Cityselect ;
	
	@FindBy (xpath = "(//span[@class='select2-selection select2-selection--single'])[3]")
	public static WebElement Chooseservice ;
	
	@FindBy (xpath = "//li[contains(text(),'Private Limited Company Registration')]")
	public static WebElement Serviceselect ;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[7]/div/div/div/div/div/iframe")
	public static WebElement Description ;
	
	@FindBy (xpath = "//input[@value='Create Ticket']")
	public static WebElement CreateSubmit ;
	
	@FindBy (xpath = "//a[contains(text(),'Home')]")
	public static WebElement Home ;
	
	@FindBy (xpath = "//a[contains(text(),'Critical Notes')]")
	public static WebElement Criticalnotes ;
	
	@FindBy (xpath = "//button[@id='new_critical_note']")
	public static WebElement NewCN ;	
	
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[1]")
	public static WebElement CNTexteditor ;
	
	@FindBy (xpath = "(//li[@class='select2-search select2-search--inline'])[2]")
	public static WebElement CNEmployees ;
	
	@FindBy (xpath = "(//li[contains(text(),'Sharanya BD')])[2]")
	public static WebElement CNEmployeeselect ;
	
	@FindBy (xpath = "(//input[@value='Save'])[2]")
	public static WebElement CNsave ;
	
	@FindBy (xpath = "(//input[@id='attachment-field_arr1'])")
	public static WebElement CNattachment ;
	
	@FindBy (xpath = "(//input[@id='swapper-first'])")
	public static WebElement In_ANnotes ;
	
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[4]")
	public static WebElement IN_ANtexteditor ;
	
	@FindBy (xpath = "//span[@id='select2-add_note_to-container']")
	public static WebElement ANemployees ;
	
	@FindBy (xpath = "(//li[contains(text(),'Sharanya BD')])[2]")
	public static WebElement ANemployeeselect ;
	
	@FindBy (xpath = "//input[@id='attachment-field']")
	public static WebElement IN_ANattachment ;
	
	@FindBy (xpath = "//a[@class='mailLinks text-right']")
	public static WebElement AN_CC ;
	
	@FindBy (xpath = "(//button[contains(text(),'Send')])[1]")
	public static WebElement IN_ANsend ;	
	
	@FindBy (xpath = "(//ul[@class='select2-selection__rendered'])[8]")
	public static WebElement AN_CCemployee ;
	
	@FindBy (xpath = "//li[contains(text(),'Dhrubo BD')]")
	public static WebElement AN_CCemployeeselect;
	
	@FindBy (xpath = "//div[@id='take_action_show']")
	public static WebElement Takeaction ;
		
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[3]")
	public static WebElement TA_texteditor ;
	
	@FindBy (xpath = "//a[@id='can_response']")
	public static WebElement TA_Cannedresp ;
	
	@FindBy (xpath = "(//textarea[@id='content_html_take_action'])[2]")
	public static WebElement Cannedresp_search ;
	
	@FindBy (xpath = "//a[@class='email-tempalte-object template_object_new']")
	public static WebElement Cannedresp_select ;
	
	@FindBy (xpath = "(//a[contains(text(),'cc')])[4]")
	public static WebElement TA_cc ;
	
	@FindBy (xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	public static WebElement TA_cc_bccselect ;
	
	@FindBy (xpath = "//a[contains(text(),'bcc')]")
	public static WebElement TA_bcc ;
	
	@FindBy (xpath = "(//li[@class='select2-search select2-search--inline'])[6]")
	public static WebElement TA_ccfield ;
	
	@FindBy (xpath = "(//li[@class='select2-search select2-search--inline'])[7]")
	public static WebElement TA_bccfield ;	
	
	
	@FindBy (xpath = "//input[@id='name']")
	public static WebElement event_subject ;
	
	@FindBy (xpath = "//input[@id='from_date_time']")
	public static WebElement event_fromdate ;
	
	@FindBy (xpath = "//textarea[@id='description']")
	public static WebElement event_description ;
	
	
	@FindBy (xpath = "//input[@id='attachment-field-take']")
	public static WebElement Email_attachment ;
	
	@FindBy (xpath = "(//div[@class='xdsoft_time xdsoft_current'])[4] /following-sibling::div[@class='xdsoft_time '][1]")
	public static WebElement event_dateselect ;
	
	@FindBy (xpath = "(//button[@class='xdsoft_next'])[8]")
	public static WebElement Eventnext ;
	
	@FindBy (xpath = "//input[@id='done']")
	public static WebElement eventuncheck ;
	
	
	
	
	@FindBy (xpath = "//button[@id='take_action_submit_button']")
	public static WebElement Mailsend ;
	
	
	
	@FindBy (xpath = "//a[contains(text(),'Create Quotation')]")
	public static WebElement Createquotation ;
	
	@FindBy (xpath = "//input[@id='individual_name_quotation']")
	public static WebElement Quotation_name ;
	
	@FindBy (xpath = "//textarea[@id='individual_address']")
	public static WebElement Quotation_address ;
	
	@FindBy (xpath = "//input[@id='individual_pincode']")
	public static WebElement Quotation_pincode ;
	
	@FindBy (xpath = "//input[@id='quote_gstin_number']")
	public static WebElement Quotation_gstin;
	
	@FindBy (xpath = "//button[contains(text(),'Verify and Fill Address')]")
	public static WebElement Addr_verify ;
	
	
	@FindBy (xpath = "(//th[@class='next'])[2]")
	public static WebElement Year_next ;	
	
	@FindBy (xpath = "(//option)[2]")
	public static WebElement Quotationtype ;
	
	@FindBy (xpath = "//input[@id='total_pro_fee_discount_2145898']")
	public static WebElement Discountprofee ;	
	
	@FindBy (xpath = "//a[contains(text(),'Confirm')]")   
	public static WebElement Quoteconfirm ;
	
	@FindBy (xpath = "//input[@class='send quotation_send']")    //a[contains(text(),'Send')]
	public static WebElement Quotesend  ;
	
	@FindBy (xpath = "//a[contains(text(),'No')]")
	public static WebElement Quotedeactive_NO ;
	
	@FindBy (xpath = "(//a[contains(text(),'Pay Now')])[1]")
	public static WebElement QuotePaynow ;
	
	@FindBy (xpath = "//div[@class='quotations_attachments']")
	public static WebElement Quotationload ;
	
	@FindBy (xpath = "(//span[@class='glyphicon glyphicon-paperclip'])[2]")
	public static WebElement Threadattachclick ;
	
	@FindBy (xpath = "//i[@class='glyphicon glyphicon-share']")
	public static WebElement Quotegenerate ;
	
	@FindBy (xpath = "//div[@class='green_back']//child::a[1]")
	public static WebElement Quotedeactivate ;	
	
	@FindBy (xpath = "//div[@style='background-color: #FFBBBB;']/child::a[2]/child::i")
	public static WebElement Quote_edit ;
	
	@FindBy (xpath = "//input[@class='send quotation_send']")
	public static WebElement Quote_update ;
	
	@FindBy (xpath = "//a[@id='crossSaleNew']")
	public static WebElement Crosssale ;
	
	@FindBy (xpath = "(//input[@class='select2-search__field'])[1]")
	public static WebElement Cross_salesearch ;
	
	@FindBy (xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	public static WebElement Cross_saleselect ;
		
	@FindBy (xpath = "//button[@class='btn btn-default btn-u cross_sale_ticket_create']")
	public static WebElement Cross_salecreate ;
	
	@FindBy (xpath = "//a[@class='btn recent_tickets']")
	public static WebElement Recenttickets ;
	
	@FindBy (xpath = "((//ul[@class='nav tcktdetails'])[1]/child::li/child::u/child::a")
	public static WebElement Recentticket_select ;
	
	@FindBy (xpath = "//a[@id='merge_ticket_modal_button_show_page']")
	public static WebElement Merge_ticket ;
	
	@FindBy (xpath = "(//span[@class='selection'])[1]/child::span")
	public static WebElement Merge_search_ticket ;
	
	@FindBy (xpath = "(//input[@value='2145966'])[1]")
	public static WebElement Primary_ticket  ;
	
	@FindBy (xpath = "//button[contains(text(),'Save changes')]")
	public static WebElement Merge_save ;
	
	@FindBy (xpath = "//a[@class='ticket_index_tooltip ticket_link_title_non_bold gray']")
	public static WebElement Merge_ticketclick ;
	
	@FindBy (xpath = "(//a[@class='btn'])[2]")
	public static WebElement Unmerge  ;	
	
	@FindBy (xpath = "//button[@id='editBtn']")
	public static WebElement Ticket_edit ;
	
	@FindBy (xpath = "(//span[@class='selection']/child::span/child::span)[3]")
	public static WebElement Requester  ;
	
	@FindBy (xpath = "(//input[@class='select2-search__field'])[6]")
	public static WebElement Requestersearch ;
		
	@FindBy (xpath = "//li[contains(text(),'gojo@yopmail.com [ Gojo ]')]")
	public static WebElement Requestervalue ;
	
	@FindBy (xpath = "(//input[@value='Update'])[1]")
	public static WebElement Edit_Update ;
	
	@FindBy (xpath = "//button[contains(text(),'Yes, update everything')]")
	public static WebElement Yesupdate ;
	
	@FindBy (xpath = "//button[contains(text(),'No, Update this service')]")
	public static WebElement Noupdate ;
	
	@FindBy (xpath = "//span[@id='select2-ticket_ticket_priority_id-container']")
	public static WebElement Ticketpriority ;
	
	@FindBy (xpath = "//li[contains(text(),'High')]")
	public static WebElement Priorityselect ;
	
	@FindBy (xpath = "//span[@id='select2-ticket_ticket_status_id-container']")
	public static WebElement Ticketstatus ;
	
	@FindBy (xpath = "(//input[@class='select2-search__field'])[3]")
	public static WebElement Editsearch ;
	
	@FindBy (xpath = "//dt[@id='city_modal']")
	public static WebElement City_lable ;
	
	@FindBy (xpath = "(//div[@class='modal-header'])[9]//child::button")
	public static WebElement TicketEditClose ;
	
	@FindBy (xpath = "(//button[@class='btn-link'])[1]")
	public static WebElement Magickey ;	
	
	@FindBy (xpath = "(//button[@class='btn-link'])[2]")
	public static WebElement Refferallink ;
	
	@FindBy (xpath = "(//button[@class='btn-link'])[3]")
	public static WebElement Docuploadlink ;
	
	@FindBy (xpath = "//a[contains(text(),'Manage email IDs')]")
	public static WebElement Manage_email ;
	
	@FindBy (xpath = "(//span[@class='select2-selection__rendered'])[21]")
	public static WebElement Submilstone ;	
	
	@FindBy (xpath = "//input[@class='milestone_894']")
	public static WebElement  Atmtocont_MS;	
	
	@FindBy (xpath = "//li[contains(text(),'Not reachable')]")
	public static WebElement Atmtocont_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_895']")
	public static WebElement Contacted_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Cold')]")
	public static WebElement Contacted_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_896']")
	public static WebElement Quotesent_MS ;
	
	@FindBy (xpath = "(//li[contains(text(),'Quotation Sent')])[2]")
	public static WebElement Quotesent_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_897']")
	public static WebElement Closed_MS ;	
	
	@FindBy (xpath = "//li[contains(text(),'Unreasonable Expectation')]")
	public static WebElement Closed_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_1726']")
	public static WebElement Doctodispatch_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Awaiting Courier Confirmation')]")
	public static WebElement Doctodispatch_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_2120']")
	public static WebElement Firstcall_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Payment Pending')]")
	public static WebElement Firstcall_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_5810']")
	public static WebElement IntDoc_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Verification pending')]")
	public static WebElement IntDoc_Sub;
	
	@FindBy (xpath = "//input[@class='milestone_5814']")
	public static WebElement DSC_VA_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Video Verification Pending')]")
	public static WebElement DSC_VA_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_5809']")
	public static WebElement Res_uni_name_MS;
	
	@FindBy (xpath = "//li[contains(text(),'Form Filling')]")
	public static WebElement Res_uni_name_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_5811']")
	public static WebElement Final_set_doc_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Discrepancy in Docs')]")
	public static WebElement Final_set_doc_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_5813']")
	public static WebElement Final_INC_MS ;
	
	@FindBy (xpath = "//li[contains(text(),'Incorporation Completed')]")
	public static WebElement Final_INC_Sub ;
	
	@FindBy (xpath = "//input[@class='milestone_893']")
	public static WebElement Justin_MS ;
	
	
	@FindBy (xpath = "(//input[@value='Update'])[3]")
	public static WebElement Submilstone_update ;
	
	@FindBy (xpath = "//a[contains(text(),'Customer Dashboard')]")
	public static WebElement Customerdashabord ;	
	
	@FindBy (xpath = "//a[contains(text(),'GRC')]")
	public static WebElement GRC ;
	
	@FindBy (xpath = "//a[contains(text(),'Document Vault')]")
	public static WebElement DocVault ;
	
	@FindBy (xpath = "//a[contains(text(),'Verify Documents')]")
	public static WebElement VerifyDoc ;
	
	
	@FindBy (xpath = "//a[contains(text(),'Upload Delivery Documents')]")
	public static WebElement Upload_deliv_doc ;
	
	@FindBy (xpath = "//a[contains(text(),'Move to Just In')]")
	public static WebElement Movetojustin ;
	
	@FindBy (xpath = "//a[contains(text(),'View and Generate Documents')]")
	public static WebElement View_gen_docs ;
	
	@FindBy (xpath = "//a[contains(text(),'View and Generate Subscriber Documents')]")
	public static WebElement View_gen_sub__docs ;
	
	@FindBy (xpath = "//a[contains(text(),'Annual File Automation Details')]")
	public static WebElement Annual_file_automation ;
	
	
	@FindBy (xpath = "//a[contains(text(),'Customer Profile')]")
	public static WebElement Customerprofile ;
	
	
	@FindBy (xpath = "//a[contains(text(),'DSC Library Management')]")
	public static WebElement DSC_lib_man ;
	
	@FindBy (xpath = "//a[contains(text(),'DSC Details')]")
	public static WebElement DSC_details ;
	
	@FindBy (xpath = "//button[contains(text(),'Entity Info')]")
	public static WebElement Entity_info ;
	
	@FindBy (xpath = "//a[contains(text(),'Activity Log')]")
	public static WebElement Activitylog ;
	
	@FindBy (xpath = "//button[@class='load-more-btn']")
	public static WebElement Loadmore ;
	
	@FindBy (xpath = "(//a[@class='btn btn-primary'])[12]")
	public static WebElement Ticketexpense ;
	
	@FindBy (xpath = "//button[@data-target='#myModal_2']")
	public static WebElement Govfee ;
	
	@FindBy (xpath = "//button[@data-target='#myModal_3']")
	public static WebElement Affiliatefee ;
	
	@FindBy (xpath = "(//select[@id='ticket_expense_expense_type_id'])[1]")
	public static WebElement GFExpensestype ;	
	
	@FindBy (xpath = "(//input[@id='ticket_expense_amount'])[1]")
	public static WebElement Govfeeamount ;
	
	@FindBy (xpath = "(//input[@as='date'])[1]")
	public static WebElement Govfeedate ;
	
	@FindBy (xpath = "(//input[@name='commit'])[1]")
	public static WebElement Govfeesubmit ;
	
	
	@FindBy (xpath = "(//select[@id='ticket_expense_expense_type_id'])[3]")
	public static WebElement AFExpensestype ;	
	
	@FindBy (xpath = "(//input[@id='ticket_expense_amount'])[3]")
	public static WebElement Afflfeeamount ;
	
	@FindBy (xpath = "(//input[@as='date'])[2]")
	public static WebElement Afflfeedate ;
	
	@FindBy (xpath = "(//input[@name='commit'])[3]")
	public static WebElement Afflfeesubmit ;
	
	@FindBy (xpath = "(//button[contains(text(),'Edit')])[1]")
	public static WebElement Govfee_edit ;
	
	@FindBy (xpath = "(//select[@id='ticket_expense_expense_type_id'])[2]")
	public static WebElement Edit_GFExpensestype ;
	
	@FindBy (xpath = "(//input[@id='ticket_expense_amount'])[2]")
	public static WebElement Edit_Govfeeamount ;
	
	@FindBy (xpath = "(//input[@id='ticket_expense_payment_date'])[2]")
	public static WebElement Edit_Govfeedate ;
	
	@FindBy (xpath = "(//input[@name='commit'])[2]")
	public static WebElement Govfeeupdate ;
	
	@FindBy (xpath = "(//table[@class='table uploadDocumentsNew'])[2]/child::tbody/child::tr/child::td[6]/child::a")
	public static WebElement Govfeedelete ;
	
	@FindBy (xpath = "(//button[contains(text(),'Edit')])[2]")
	public static WebElement Affledit ;
	
	@FindBy (xpath = "(//table[@class='table uploadDocumentsNew'])[3]/child::tbody/child::tr/child::td[6]/child::a")
	public static WebElement Affldelete ;
	
	@FindBy (xpath = "(//select[@id='ticket_expense_expense_type_id'])[4]")
	public static WebElement Edit_AFExpensestype ;	
	
	@FindBy (xpath = "(//input[@id='ticket_expense_amount'])[4]")
	public static WebElement Edit_Afflfeeamount ;
	
	@FindBy (xpath = "(//input[@id='ticket_expense_payment_date'])[4]")
	public static WebElement Edit_Afflfeedate ;
	
	@FindBy (xpath = "(//input[@name='commit'])[4]")
	public static WebElement Afflfeeupdate ;
	
	

    
      
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	

	

	
	
	@FindBy (xpath = "//a[contains(text(),'Send')]")
	public static WebElement QuotesendQE ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	
//	@FindBy (xpath = "")
//	public static WebElement  ;
	

	
	@FindBy (xpath = "//a[@data-method='DELETE']")
	public static WebElement Logout;
	
	
}
