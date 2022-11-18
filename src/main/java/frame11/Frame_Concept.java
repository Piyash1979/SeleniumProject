package frame11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//way1 enter into the frame
		driver.switchTo().frame("iframeResult");
		
		//way-2
		//driver.switchTo().frame(0);
		//way-3 switching to frame
		
		//driver.switchTo().frame(driver.findElementByXPath(null));
		System.out.println("Successfully enter into the frame");
		
		//Remove/clear john from first name field
		driver.findElementByXPath("//input[@value='John']").clear();
		
		//enter first name
		driver.findElementByXPath("//input[@value='John']").sendKeys("Parisa");
		
		//clear last name from last name field
		driver.findElementByXPath("//input[@value='Doe']").clear();
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("Parin");
		//click submit
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		Thread.sleep(3000);
		
		//back to main/parentFrame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		System.out.println("Successfully entered into the parent frame");
		
		Thread.sleep(4000);
		driver.close();
	}

}
