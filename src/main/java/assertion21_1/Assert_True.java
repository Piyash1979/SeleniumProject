package assertion21_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assert_True {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assertion
		Assert.assertEquals(title, "OrangeHRM","Verify page title");
		
		//isDisplay(); "OrangeHRM" Logo is displayed(true/False)
      boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			System.out.println(logo);	

		//Assertion
			Assert.assertTrue(logo, "OrangeHRM Logo is displayed");
			
			//Validation
			if(logo==true) {
				System.out.println("OrangeHRM Logo is displayed");
			}else
				System.out.println("OrangeHRM Logo is not displayed");
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			// driver.switchTo().alert().getText();
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
			driver.switchTo().alert().accept();
			  //driver.switchTo().alert().dismiss();*/

			driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
		
			//Choose Source
		//parentToChild Xpath
			  driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]")).click();
			/*Select dd=new Select(src1);
			dd.deselectByIndex(1);*/
			
			
			//Assertion
			//Assert.assertEquals(src, "Select element");

			/*//validation
			if(src==true  ) {
			System.out.println("Selected");	
			}else
			System.out.println("Not Selected");*/
		
		//driver.close();
	}

}
