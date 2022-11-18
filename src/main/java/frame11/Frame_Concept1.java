package frame11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept1 {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		driver.findElementByXPath("//a[text()='Demos']").click();
		driver.findElementByXPath("//a[contains(text(),'Selecta')]").click();
		
		
        //using index number-if iframe has no ID or NAME locator then go to Index number
		//enter into the frame
		//driver.switchTo().frame("demo-frame");
		driver.switchTo().frame(0);//
		System.out.println("Successfully enter into the frame");
		
		//click item-2-7
		driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[6]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		Thread.sleep(2000);
		
		//switch back to main HTML page
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		System.out.println("Successfully enter into the parent frame");
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
