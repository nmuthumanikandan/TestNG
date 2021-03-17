package week5.testNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	//@Test (invocationCount =3)

	//public  void TestNGTC1 () {
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	
		*/
	@Test(dataProvider="fetchdata")
	public void runcreatelead(String company, String firstname,String lastname) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
		driver.findElementByName("submitButton").click();
		System.out.println("Lead created");
		//driver.close();
}
	
	
	//ReadExcel
	
	/*public String [][] sendData() throws IOException {
		ReadExcel re=new ReadExcel();
		return re.excelRead();
		*/
	
	//Assignment
	@DataProvider(name="fetchdata")
	public String [][] excelData() throws IOException {
		WorkingwithExcel d=new WorkingwithExcel();
		return d.excelRead();
		
	
	
	/*Learn data provider
	 * public String [][] sendData() {
		String [][] data=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Muthu";
		data[0][2]="N";
		
		data[1][0]="CTS";
		data[1][1]="Muthumanikandan";
		data[1][2]="N";
		
		return data;
		*/
		
	}
}






