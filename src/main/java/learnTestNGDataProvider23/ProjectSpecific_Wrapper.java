package learnTestNGDataProvider23;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readExcel.ReadExcel;

public class ProjectSpecific_Wrapper {
	public ChromeDriver driver;
   	
	@Parameters({"url","uname","pwd"})

	@BeforeMethod
	public void login(String url, String uname, String pwd) { 

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get(url); 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys(uname);

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys(pwd);

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@AfterMethod
	public void closeBrowser() { 
		driver.close();
	}
	
	@DataProvider
	//public void getData(){
	public String[][] getData() throws IOException{
		ReadExcel r1=new ReadExcel();
		return r1.readExcel();
		
		
	
	

		/*//create object of 2D Array/declare 2D Array and write size of array(Row & column)
		String [][] data = new String[3][3];
		data[0][0] = "TCS";
		data[0][1] = "Imrul";
		data[0][2] = "Choudhury";
		
		data [1][0] = "ABC";
		data [1][1] = "Maya";
		data [1][2] = "Karim";
		
		data [2][0] = "XYZ";
		data [2][1] = "Keya";
		data [2][2] = "Akter";
		
		//add return type and change return type of getData()
        return data;*/
		
		
	}
}