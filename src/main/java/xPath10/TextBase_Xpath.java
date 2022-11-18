package xPath10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextBase_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//Syntax://tagname[text()='text of code' //note:text=text of code
		driver.findElementByXPath("//a[text()='Demos']").click();
        driver.findElementByXPath("//a[text()='Draggable']").click();
        driver.findElementByXPath("//h1[text()='Draggable']").click();
        
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);
        driver.close();
		

	}

}
