package datePicker26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	
		
		driver.findElementByXPath("//input[@name='q']").sendKeys("calendar 2022");
		driver.findElementByXPath("//input[@name='btnK'][1]").click();
		driver.findElementByXPath("//h3[text()='Year 2022 Calendar – United States - Time and Date']").click();
		//driver.findElementByXPath("//h3[text()='Images for calendar 2022']").click();
		//driver.findElementByXPath("//h3[text()='Google Calendar']").click();
		//driver.findElementByXPath("//div[@class='POUQwd Rubttd']").click();
		/*WebElement ele = driver.findElementByXPath("//div[@class='POUQwd Rubttd']");
		Select dd=new Select(ele);
		dd.selectByVisibleText("november");
		
		driver.findElementById("/div[text()='november']").click();*/
		
		/*if(text.equals(month)) {//when it finds month =May2022, then comes out from the 
			
		}
		else
		{
			//continue clicking on next month until found the "November 2022" month.
			
		}*/
	}

}
