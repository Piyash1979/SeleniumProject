package TC_Wait_inSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_in_CreateLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.whatsapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//img[@alt='WhatsApp Main Page'][1]")).click();
		driver.findElement(By.xpath("//span[@class='_advp _aeam']/h5[1]")).click();
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_11Jja']")).click();
		
		//driver.close(); 
		
	}

}
